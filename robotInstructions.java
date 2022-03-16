import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int position = 0;
            int step = scan.nextInt();
            scan.nextLine();
            int[] saveCommand = new int[step + 1];
            for (int j = 1; j <= step; j++) {
                String command = scan.nextLine();
                if (command.equals("LEFT")) {
                    position--;
                    saveCommand[j] = -1;
                } else if (command.equals("RIGHT")) {
                    position++;
                    saveCommand[j] = 1;
                } else {
                    int index = Integer.parseInt(command.substring(8));
                    position += saveCommand[index];
                    saveCommand[j] = saveCommand[index];
                }
            }
            System.out.println(position);
        }
    }
}
