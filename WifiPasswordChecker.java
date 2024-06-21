import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class WifiPasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get WiFi network SSID and password from user
        System.out.print("Enter WiFi SSID: ");
        String ssid = scanner.nextLine();
        System.out.print("Enter WiFi Password: ");
        String password = scanner.nextLine();
        
        try {
            // Create a temporary WiFi profile XML
            String profileXml = String.format(
                "<?xml version=\"1.0\"?><WLANProfile xmlns=\"http://www.microsoft.com/networking/WLAN/profile/v1\">" +
                "<name>%s</name><SSIDConfig><SSID><name>%s</name></SSID></SSIDConfig>" +
                "<connectionType>ESS</connectionType><connectionMode>auto</connectionMode>" +
                "<MSM><security><authEncryption><authentication>WPA2PSK</authentication>" +
                "<encryption>AES</encryption><useOneX>false</useOneX></authEncryption>" +
                "<sharedKey><keyType>passPhrase</keyType><protected>false</protected>" +
                "<keyMaterial>%s</keyMaterial></sharedKey></security></MSM></WLANProfile>", 
                ssid, ssid, password
            );

            // Write the profile XML to a file
            String fileName = "tempProfile.xml";
            OutputStreamWriter writer = new OutputStreamWriter(new java.io.FileOutputStream(fileName));
            writer.write(profileXml);
            writer.close();

            // Add the WiFi profile using netsh
            String addProfileCommand = "netsh wlan add profile filename=\"" + fileName + "\"";
            Process addProfileProcess = Runtime.getRuntime().exec(addProfileCommand);
            addProfileProcess.waitFor();

            // Connect to the WiFi network using the newly added profile
            String connectCommand = "netsh wlan connect name=\"" + ssid + "\"";
            Process connectProcess = Runtime.getRuntime().exec(connectCommand);
            connectProcess.waitFor();

            // Check the connection status
            String statusCommand = "netsh wlan show interfaces";
            Process statusProcess = Runtime.getRuntime().exec(statusCommand);
            BufferedReader reader = new BufferedReader(new InputStreamReader(statusProcess.getInputStream()));

            String line;
            boolean connected = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains("State") && line.contains("connected")) {
                    connected = true;
                    break;
                }
            }
            reader.close();

            // Clean up the temporary profile file
            new java.io.File(fileName).delete();

            if (connected) {
                System.out.println("Successfully connected to the network.");
            } else {
                System.out.println("Failed to connect to the network. Incorrect password.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
