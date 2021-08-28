import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        
        int ans1 = getValueIndecimal(n,sourceBase);
        int ans = getValueInBase(ans1,destBase);

        System.out.println(ans);
    }

    public static int getValueIndecimal(int n, int b){
        int ans = 0;
        int pow = 1;

        while(n!=0){
            int rem = n % 10;
            n = n / 10;

            ans = ans + (rem * pow);
            pow = pow * b;
        }

        return ans;
    }

    public static int getValueInBase(int n, int b){
        int ans = 0;
        int pow = 1;

        while(n!=0){
            int rem = n % b;
            n = n / b;

            ans = ans + (rem * pow);
            pow = pow * 10;
        }

        return ans;
    }
}
