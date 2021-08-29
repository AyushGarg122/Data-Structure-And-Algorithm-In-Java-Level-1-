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

        for(int i=0; i<n; i++){
            int min = arr[i][0];
            int idx = 0;

            for(int j=1; j<n; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                    idx = j;
                }
            }

            boolean flag = true;

            for(int j=0; j<n; j++){
                if(arr[j][idx]>min){
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println(min);
                return;
            }
        }

        System.out.println("Invalid input");
    }
}
