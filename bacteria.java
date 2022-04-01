import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String s1 = scan.nextLine();
            String s2 = scan.nextLine();

            boolean isResistance = false;
            for (int i = 0, y = s2.length(); y <= s1.length(); i++, y++) {
                if (s1.substring(i, y).equalsIgnoreCase(s2)) {
                    isResistance = true;
                    break;
                }
            }
            System.out.println(isResistance ? "Resistente" : "Nao resistente");
        }
    }
}
