import java.util.*;
public class Main {

    public static int FirstIndex(int []arr, int tar){
        int ans = -1;
        int i = 0;
        int j = arr.length-1;
        
        while(i<=j){
            int mid = (i + j) / 2;
            int ele = arr[mid];
            
            if(ele==tar){
                ans = mid;
                j = mid - 1;
            }else if(ele>tar){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        
        return ans;
    }

    public static int LastIndex(int []arr, int tar){
        int ans = -1;
        int i = 0;
        int j = arr.length-1;

        while(i<=j){
            int mid = (i + j) / 2;
            int ele = arr[mid];

            if(ele==tar){
                ans = mid;
                i = mid + 1;
            }else if(ele>tar){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();
        
        int ans1 = FirstIndex(arr,tar);
        int ans2 = LastIndex(arr,tar);

        System.out.println(ans1);
        System.out.println(ans2);
    }
}
