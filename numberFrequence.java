import java.util.*;

public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int numOfTest = scan.nextInt();
            int[] num = new int[numOfTest];
            
            ArrayList<Integer> sequence = new ArrayList<Integer>();
            for (int i = 0; i < num.length; i++) {
                num[i] = scan.nextInt();
            }
            Arrays.sort(num);

            sequence.add(num[0]);
            for (int i = 1; i < num.length; i++) {
                if (!(sequence.contains(num[i]))) {
                    sequence.add(num[i]);
                }
            }
            int[] counter = new int[sequence.size()];
            for (int i = 0; i < sequence.size(); i++) {
                for (int j = 0; j < num.length; j++) {
                    if (sequence.get(i) == num[j]) {
                        counter[i]++;
                    }
                }
            }
            for (int i = 0; i < sequence.size(); i++) {
                System.out.println(sequence.get(i) + " aparece " + counter[i] + " vez(es)");
            }
        }
    }
