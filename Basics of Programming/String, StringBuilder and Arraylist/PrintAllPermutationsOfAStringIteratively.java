import java.util.*;
public class Main {

    public static void solution(String str){
        int n = str.length();
        
        int total = 1;
        for(int i=2; i<=n; i++){
            total = total * i;
        }
        
        for(int i=0; i<total; i++){
            StringBuilder sb = new StringBuilder(str);
            int num = i;
            int div = n;
            
            while(div>=1){
                int rem = num % div;
                num = num / div;

                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
                
                div--;
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}
