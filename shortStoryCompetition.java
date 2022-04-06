import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int lines = 0;
            int pages = 0;
            int characters = 0;
            int numWords = sc.nextInt();
            int maxlines = sc.nextInt();
            int maxCharacters = sc.nextInt();
            for (int i = 1; i <= numWords; i++) {
                String words = sc.next();
                characters += words.length();
                if (characters == maxCharacters) {
                    characters = 0;
                    lines++;
                } else if (characters > maxCharacters) {
                    characters = words.length() + 1;
                    lines++;
                } else if (i < numWords) {
                    characters++;
                    if (characters == maxCharacters) {
                        characters = 0;
                        lines++;
                    }
                }
                if (lines == maxlines) {
                    lines = 0;
                    pages++;
                }
            }
            if (lines > 0 || characters > 0)
                pages++;
            System.out.println(pages);
        }
    }
}
