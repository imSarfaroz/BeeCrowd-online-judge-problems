import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            while (scan.hasNextInt()) {
                int b = scan.nextInt();
                int e = scan.nextInt();
                int counter = 0;
                for (int i = b; i <= e; i++) {
                    boolean same = false;
                    char[] array = Integer.toString(i).toCharArray();
                    for (int j = 0; j < array.length; j++) {
                        for (int k = 0; k < array.length; k++) {
                            if (j != k) {
                                if (array[j] == array[k]) {
                                    same = true;
                                }
                            }
                        }
                    }
                    if (!same) {
                        counter++;
                    }
                }
                System.out.println(counter);
            }
        }
    }
