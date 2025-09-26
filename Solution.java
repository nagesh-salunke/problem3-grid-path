import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int[][] grid = new int[N][M];
        for(int i=0;i<N;i++){
            String line = sc.nextLine();
            for(int j=0;j<M;j++){
                grid[i][j] = line.charAt(j) - '0';
            }
        }
        // TODO: implement solution
        System.out.println(-1);
    }
}

