import java.util.*;
public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void input(int []arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }

    public static int[] sum(int []a, int []b){
        int size = Math.max(a.length,b.length);
        int []ans = new int[size];

        int i = a.length-1;
        int j = b.length-1;
        int k = ans.length-1;
        int carry = 0;

        while(k>=0){
            int n1 = i>=0? a[i]: 0;
            int n2 = j>=0? b[j]: 0;

            int sum = n1 + n2 + carry;
            int rem = sum % 10;
            carry = sum / 10;

            ans[k] = rem;
            i--;
            j--;
            k--;
        }

        if(carry!=0){
            System.out.println(carry);
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int []a = new int[n];
        input(a);

        int m = scn.nextInt();
        int []b = new int[m];
        input(b);

        int []ans = sum(a,b);
        for(int ele: ans){
            System.out.println(ele);
        }
    }
}
