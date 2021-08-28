import java.util.*;
public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void input(int []arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }

    public static int[] difference(int []a, int []b){
        int []ans = new int[b.length];
        int i = a.length-1;
        int j = b.length-1;
        int k = ans.length-1;
        int borrow = 0;

        while(j>=0){
            int n1 = b[j];
            int n2 = i>=0? a[i]: 0;

            int sub = (n1 + borrow) - n2;

            if(sub<0){
                sub+=10;
                borrow = -1;
            }else{
                borrow = 0;
            }

            ans[k] = sub;
            i--;
            j--;
            k--;
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

        int []ans = difference(a,b);

        int idx = 0;
        while(ans[idx]==0){
            idx++;
        }

        for(int i=idx; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
