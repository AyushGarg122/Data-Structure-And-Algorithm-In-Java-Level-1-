import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int n = scn.nextInt();

            boolean flag = true;
            for(int div=2; div*div<=n; div++){
                if(n%div==0){
                    flag = false;
                    break;
                }
            }

            System.out.println(flag? "prime": "not prime");
        }
    }
}
