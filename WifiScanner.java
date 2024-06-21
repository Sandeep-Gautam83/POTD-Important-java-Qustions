import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WifiScanner {
    public static void main(String[] args) {
        try {
            // Execute the command to list WiFi networks (works on Windows)
            String command = "netsh wlan show networks";
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
