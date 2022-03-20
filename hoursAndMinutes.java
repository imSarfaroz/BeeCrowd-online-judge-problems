import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {
            int angle = scan.nextInt();
            if (angle % 6 == 0) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
