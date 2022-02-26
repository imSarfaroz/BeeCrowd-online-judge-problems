import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            while (scan.hasNextInt()) {
                int n = scan.nextInt();
                scan.nextLine();
                int[] L = new int[100];
                int[] R = new int[100];
                for (int i = 0; i < n; i++) {
                    int foot = scan.nextInt();
                    String side = scan.nextLine().trim();
                    if (side.equals("E")) {
                        L[foot]++;
                    } else if (side.equals("D")) {
                        R[foot]++;
                    }
                }
                int c = 0;
                for (int index = 0; index < 100; index++) {
                    if (L[index] > 0 && R[index] > 0) {
                        if (L[index] <= R[index]) {
                            c += L[index];
                        } else {
                            c += R[index];
                        }
                    }
                }
                System.out.println(c);
            }
        }
    }
