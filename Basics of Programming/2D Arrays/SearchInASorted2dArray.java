import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int tar = scn.nextInt();

        int r = 0;
        int c = n - 1;

        while(c>=0 && r<n){
            if(arr[r][c]==tar){
                System.out.println(r);
                System.out.println(c);
                return;
            }else if(arr[r][c]>tar){
                c--;
            }else{
                r++;
            }
        }

        System.out.println("Not Found");
    }
}
