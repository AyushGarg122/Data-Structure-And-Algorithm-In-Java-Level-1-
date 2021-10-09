import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        int [][]chess = new int[n][n];

        printKnightsTour(chess,r,c,1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        int [][]dir = {{-2,1}, {-1,2}, {1,2}, {2,1}, {2,-1}, {1,-2}, {-1,-2}, {-2,-1}};
        printKnightsTour(chess,r,c,upcomingMove,dir);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove, int [][]dir) {
        int n = chess.length;
        if(upcomingMove==n * n){
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }

        chess[r][c] = upcomingMove;

        for(int i=0; i<dir.length; i++){
            int sr = r + dir[i][0];
            int sc = c + dir[i][1];

            if(sr>=0 && sc>=0 && sr<n && sc<n && chess[sr][sc]==0){
                printKnightsTour(chess,sr,sc,upcomingMove + 1, dir);
            }
        }

        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
