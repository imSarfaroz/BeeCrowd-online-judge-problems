import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            
            String line = sc.nextLine();
            String[] words = line.split(" ");
            int countwords = 0;
            int sizewords = 0;
            for (String word : words) {
                boolean wordValid = true;
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    if (!Character.isAlphabetic(c) && !(c == '.' && i + 1 == word.length())) {
                        wordValid = false;
                        break;
                    }
                }
                if (wordValid) {
                    countwords++;
                    sizewords += word.replace(".", "").length();
                }
            }
            if (countwords == 0 || sizewords == 0) {
                System.out.println(250);
            } else {
                int media = sizewords / countwords;
                if (media <= 3) {
                    System.out.println(250);
                } else if (media <= 5) {
                    System.out.println(500);
                } else {
                    System.out.println(1000);
                }
            }
        }
    }
}
