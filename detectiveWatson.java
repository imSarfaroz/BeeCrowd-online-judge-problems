import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            int max = 0;
            int index = 0;
            int killer = 0;
            int result = 0;
            int[] variant = new int[n];
            for (int i = 0; i < variant.length; i++) {
                variant[i] = scan.nextInt();
                if (variant[i] >= max) {
                    max = variant[i];
                    index = i;
                }
            }
            for (int i = 0; i < variant.length; i++) {
                if (i != index) {
                    if (variant[i] >= killer) {
                        result = i;
                        killer = variant[i];
                    }
                }
            }
            System.out.println(result + 1);
        }
    }
}

