import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            int atay = scn.nextInt();
            if (atay == 0) break;

            char p;
            int time;
            String s, alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int sum = 0, alina = 0, num = 0;
            int[] extra = new int[26];

            for (int i = 0; i < atay; i++) {
                p = scn.next().charAt(0);
                time = scn.nextInt();
                s = scn.next();

                if (s.charAt(0) == 'c') {
                    sum += time;
                    sum += extra[alpha.indexOf(p)];
                    num++;
                } else {
                    extra[alpha.indexOf(p)] += 20;
                }
            }
            System.out.println(num + " " + sum);
        }
    }
}
