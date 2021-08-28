import java.util.*;
public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void input(int [][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static int[][] multiplication(int [][]a, int [][]b){
        int [][]ans = new int[a.length][b[0].length];

        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                for(int k=0; k<b.length; k++){
                    ans[i][j] = ans[i][j] + (a[i][k] * b[k][j]);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int [][]a = new int[n1][m1];
        input(a);

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int [][]b = new int[n2][m2];
        input(b);

        if(m1!=n2){
            System.out.println("Invalid input");
            return;
        }

        int [][]ans = multiplication(a,b);
        for(int []arr: ans){
            for(int ele: arr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
