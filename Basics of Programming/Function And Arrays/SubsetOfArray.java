import java.util.*;
public class Main {
    
    public static int convert(int n){
        int ans = 0;
        int pow = 1;
        
        while(n!=0){
            int rem = n % 2;
            n = n / 2;
            
            ans = ans + (rem * pow);
            pow = pow * 10;
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

        int totalSubset = (int)Math.pow(2,n);
        
        for(int i=0; i<totalSubset; i++){
            int num = convert(i);
            int div = (int)Math.pow(10,n-1);
            int idx = 0;
            
            while(div!=0){
                int rem = num / div;
                num = num % div;
                
                if(rem==1){
                    System.out.print(arr[idx] + "\t");
                }else{
                    System.out.print("-\t");
                }
                
                idx++;
                div = div / 10;
            }

            System.out.println();
        }
    }
}
