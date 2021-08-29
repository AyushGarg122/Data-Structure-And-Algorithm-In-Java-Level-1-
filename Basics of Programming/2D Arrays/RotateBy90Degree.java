import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        transpose(arr);
        reverse(arr);
        display(arr);
    }

    public static void transpose(int [][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }
    }
    
    public static void reverse(int [][]arr){
        for(int i=0; i<arr.length; i++){
            int l = 0;
            int r = arr.length-1;
            while(l<r){
                int t = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = t;
                l++;
                r--;
            }
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
