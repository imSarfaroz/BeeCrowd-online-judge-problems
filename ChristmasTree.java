import java.util.*;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            
            if (num % 2 != 0) {
                for (int i = 1, k = num / 2 + 1; k > 0 && i <= num; k--, i += 2) {
                    StringBuilder now = new StringBuilder();
                    for (int j = k - 1; j >= 1; j--) {
                        now.append(' ');
                    }
                    for (int j = 1; j <= i; j++) {
                        now.append('*');
                    }
                    System.out.println(now);
                }
                for (int i = 1, k = num / 2 + 1; k > 0 && i <= 3; k--, i += 2) {
                    StringBuilder now = new StringBuilder();
                    for (int j = k - 1; j >= 1; j--) {
                        now.append(' ');
                    }
                    for (int j = 1; j <= i; j++) {
                        now.append('*');
                    }
                    System.out.println(now);
                }
                System.out.println();
            }
        }
    }
}
