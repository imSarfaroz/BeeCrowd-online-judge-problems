import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numoftest = scan.nextInt();
		for(int i = 0; i < numoftest; i++){
		    
		    int num = scan.nextInt();
		 Set<Integer> sheep = new HashSet<Integer>();
		 
		 for(int j = 0; j < num; j++){
		     sheep.add(scan.nextInt());
		   }
		   System.out.println(sheep.size());
		}
	}
}
