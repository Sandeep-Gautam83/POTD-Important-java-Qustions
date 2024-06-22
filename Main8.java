public class Main8 {
private static String floatToBinaryString(double n) {
    String val = "0."; 

    while (n > 0) {
        double r = n * 2; 

        if (r >= 1) {
            val += "1"; 
            n = r - 1; 
        } else {
            val += "0"; 
            n = r; 
        }
    }

    return val; 
}

}