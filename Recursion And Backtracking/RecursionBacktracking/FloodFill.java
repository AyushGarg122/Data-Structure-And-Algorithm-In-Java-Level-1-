import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {
        int [][]dir = {{-1,0}, {0,-1}, {1,0}, {0,1}};
        String []dirS = {"t", "l", "d", "r"};
        floodfill(maze,sr,sc,asf,dir,dirS);
    }

    public static void floodfill(int[][] maze, int sr, int sc, String asf, int [][]dir, String[]dirS) {
        int n = maze.length, m = maze[0].length;
        if(sr==n-1 && sc==m-1){
            System.out.println(asf);
            return;
        }
        
        maze[sr][sc] = 1;
        
        for(int i=0; i<dir.length; i++){
            int r = sr + dir[i][0];
            int c = sc + dir[i][1];
            
            if(r>=0 && c>=0 && r<n && c<m && maze[r][c]==0){
                floodfill(maze,r,c,asf + dirS[i], dir,dirS);
            }
        }

        maze[sr][sc] = 0;
    }
}
