import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        for(int ele: arr){
            max = Math.max(max,ele);
        }
        
        for(int i=max; i>=1; i--){
            for(int ele: arr){
                if(ele>=i){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
