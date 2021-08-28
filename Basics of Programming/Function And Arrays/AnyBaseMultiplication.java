import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2){
        int ans = 0;
        int pow = 1;
        
        while (n2!=0){
            int rem = n2 % 10;
            n2 = n2 / 10;
            
            int multiplication = multiply(b,n1,rem);
            ans = getSum(b,ans,multiplication*pow);
            pow = pow * 10;
        }
        
        return ans;
    }

    public static int multiply(int b, int n, int m){
        int ans = 0;
        int pow = 1;
        int carry = 0;

        while (n!=0 || carry!=0){
            int r = n % 10;
            n = n / 10;

            int mul = (r * m) + carry;

            int rem = mul % b;
            carry = mul / b;

            ans = ans + (rem * pow);
            pow = pow * 10;
        }

        return ans;
    }

    public static int getSum(int b, int n1, int n2){
        int ans = 0;
        int pow = 1;
        int carry = 0;

        while(n1!=0 || n2!=0 || carry!=0){
            int rem1 = n1 % 10;
            n1 = n1 / 10;

            int rem2 = n2 % 10;
            n2 = n2 / 10;

            int sum = rem1 + rem2 + carry;

            int rem = sum % b;
            carry = sum / b;

            ans = (rem * pow) + ans;
            pow = pow * 10;
        }

        return ans;
    }
}
