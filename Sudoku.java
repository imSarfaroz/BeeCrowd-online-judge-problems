import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nx = scan.nextInt();
        for(int jx = 0; jx < nx; jx++){
            int[][] grid = new int[9][9];
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    grid[i][j] = scan.nextInt();
                }
            }
            boolean isSolution = true;
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++) {
                    if (!isValid(grid, i, j)) {
                        isSolution = false;
                        break;
                    }
                }
            }
            System.out.println("Instancia " + (jx + 1));
            System.out.println(isSolution ? "SIM" : "NAO");
            System.out.println();
        }
    }

    public static boolean isValid(int[][] grid, int i, int j) {
        for(int k = 0; k < 9; k++){
            if(k != j && grid[i][j] == grid[i][k]){
                return false;
            }
        }for(int k = 0; k < 9; k++){
            if(k != i && grid[i][j] == grid[k][j]){
                return false;
            }
        }
        for(int k = (i / 3) * 3; k < (i / 3) * 3 + 3; k++){
            for(int l = (j / 3) * 3; l < (j / 3) * 3 + 3; l++){
                if(i != k && j != l && grid[i][j] == grid[k][l]){
                    return false;
                }
            }
        }

        return true;
    }
}
