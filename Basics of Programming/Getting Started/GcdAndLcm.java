import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int n1 = n;
        int m1 = m;
        
        while (n1 % m1!=0){
            int rem = n1 % m1;
            n1 = m1;
            m1 = rem;
        }
        
        int gcd = m1;
        int lcm = (n * m) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
