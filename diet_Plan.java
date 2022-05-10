import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            boolean cheater = false;
            String diet = sc.nextLine();
            String breakfast = sc.nextLine();
            String lunch = sc.nextLine();

            for (char c : breakfast.toCharArray()) {
                String str = String.valueOf(c);
                if (diet.contains(str)) {
                    diet = diet.replace(str, "");
                } else {
                    cheater = true;
                }
            }

            for (Character c : lunch.toCharArray()) {
                String str = String.valueOf(c);
                if (diet.contains(str)) {
                    diet = diet.replace(str, "");
                } else {
                    cheater = true;
                }
            }

            if (cheater) {
                System.out.println("CHEATER");
            } else {
                char[] string = diet.toCharArray();
                Arrays.sort(string);
                System.out.println(new String(string));
            }
        }
    }

}
