import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();
            scan.nextLine();
            if (n == 0) {
                break;
            }
            int dir = 0;
            String s = scan.nextLine().trim();
            char[] array = s.toCharArray();
            for (int i = 0; i < n; i++) {
                if (array[i] == 'E') {
                    dir--;
                    if (dir < 0) {
                        dir = 3;
                    }
                } else if (array[i] == 'D') {
                    dir++;
                    if (dir > 3) {
                        dir = 0;
                    }
                }
            }
            switch (dir) {
                case 0:
                    System.out.println("N");
                    break;
                case 1:
                    System.out.println("L");
                    break;
                case 2:
                    System.out.println("S");
                    break;
                case 3:
                    System.out.println("O");
                    break;
            }
        }
    }
}
