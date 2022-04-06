import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, m;

        while (true) {
            n = scan.nextInt();
            m = scan.nextInt();

            if (n == 0 && m == 0)
                break;

            int count = 0;
            int[] a = new int[m];

            for (int i = 0; i < m; i -= -1) {
                a[i] = scan.nextInt();
                if (i > 0) {
                    if (a[i - 1] > a[i]) {
                        count += a[i - 1] - a[i];
                    }
                } else {
                    count += n - a[i];
                }
            }
            System.out.println(count);
        }
    }
}
