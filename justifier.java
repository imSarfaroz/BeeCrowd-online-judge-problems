import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isFirst = true;
        while (true) {
            int testcases = scan.nextInt();
            if (testcases == 0) {
                break;
            }
            scan.nextLine();

            String[] word = new String[testcases];
            for (int i = 0; i < word.length; i++) {
                word[i] = scan.nextLine();
            }
            String longestLetterNum = word[0];
            for (int i = 1; i < word.length; i++) {
                if (longestLetterNum.length() < word[i].length()) {
                    longestLetterNum = word[i];
                }
            }
            for (int i = 0; i < word.length; i++) {
                int spaceNeeded = longestLetterNum.length() - word[i].length();
                String updatedWord = "";
                for (int s = 0; s < spaceNeeded; s++) {
                    updatedWord += " ";
                }
                word[i] = updatedWord + word[i];
            }
            if (isFirst) {
                isFirst = false;
            } else {
                System.out.println();
            }
            for (int i = 0; i < word.length; ++i) {
                System.out.println(word[i]);
            }
        }

    }
}
