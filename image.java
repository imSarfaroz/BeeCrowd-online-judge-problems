import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, m;
        while ((n = sc.nextInt()) != 0) {
            m = sc.nextInt();
            String[] str = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = sc.next();
            }
            int line = sc.nextInt();
            int column = sc.nextInt();
            for (int i = 0; i < str.length; i++) {
                for (int l = 0; l < line / n; l++) {
                    for (int j = 0; j < str[i].length(); j++) {
                            for (int k = 0; k < column / m; k++) {
                            System.out.print(str[i].charAt(j));
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
