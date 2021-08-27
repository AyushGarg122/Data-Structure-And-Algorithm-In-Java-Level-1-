import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int idx = 1;
        int ans = 0;
        
        
        while(n!=0){
            int rem = n % 10;
            n = n / 10;
            
            int pow = (int)Math.pow(10,rem-1);
            ans = ans + (idx * pow);
            
            idx++;
        }

        System.out.println(ans);
    }
}
