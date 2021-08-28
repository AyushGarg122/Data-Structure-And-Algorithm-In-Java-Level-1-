import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        int ceil = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;

        int i = 0;
        int j = n - 1;

        while(i<=j){
            int mid = (i + j) / 2;
            int ele = arr[mid];

            if(ele==tar){
                ceil = ele;
                floor = ele;
                break;
            }else if(ele>tar){
                ceil = ele;
                j = mid - 1;
            }else{
                floor = ele;
                i = mid + 1;
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }
}
