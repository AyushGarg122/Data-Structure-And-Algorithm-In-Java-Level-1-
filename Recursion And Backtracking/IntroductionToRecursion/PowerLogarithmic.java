import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        
        int ans = power(x,n / 2);
        ans = ans * ans;
        
        return n % 2==1? ans * x: ans;
    }

}
