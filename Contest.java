import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            int[][] array = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = scan.nextInt();
                }
            }
            int result = 4;
            boolean ch1 = true;
            boolean ch2 = true;
            boolean ch3 = true;
            boolean ch4 = true;

            for (int i = 0; i < n; i++) {
                int check = 0;
                for (int j = 0; j < m; j++) {
                    if (array[i][j] == 1) {
                        check++;
                    }
                }
                if (check == m) {
                    ch1 = false;
                }
                if (check == 0) {
                    ch4 = false;
                }
            }

            for (int j = 0; j < m; j++) {
                int check = 0;
                for (int i = 0; i < n; i++) {
                    if (array[i][j] == 1) {
                        check++;
                    }
                }
                if (check == n) {
                    ch3 = false;
                }
                if (check == 0) {
                    ch2 = false;
                }
            }
            if (!ch1)
                result--;
            if (!ch2)
                result--;
            if (!ch3)
                result--;
            if (!ch4)
                result--;

            System.out.println(result);
        }
    }
}
