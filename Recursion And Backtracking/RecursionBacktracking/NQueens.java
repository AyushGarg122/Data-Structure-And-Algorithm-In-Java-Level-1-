import java.io.*;
import java.util.*;

public class Main {

     public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]chess = new int[n][n];

        printNQueens(chess,"",0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        int col = 0;
        int d1 = 0;
        int d2 = 0;

        printNQueens(chess,qsf,row,col,d1,d2);
    }

    public static void printNQueens(int[][] chess, String qsf, int row, int col, int d1, int d2) {
        int n = chess.length;
        if(row==n){
            System.out.println(qsf + ".");
            return;
        }

        for(int c = 0; c<n; c++){
            if((col & (1<<c))==0 && ((d1 & (1<<(row+c)))==0) && ((d2 & (1<<(row-c + n - 1)))==0)){
                col = col ^ (1<<c);
                d1 = d1 ^ (1 << (row + c));
                d2 = d2 ^ (1 << (row - c + n - 1));
                printNQueens(chess,qsf + row + "-" + c + ", ",row+1,col,d1,d2);
                col = col ^ (1<<c);
                d1 = d1 ^ (1 << (row + c));
                d2 = d2 ^ (1 << (row - c + n - 1));
            }
        }
    }
}
