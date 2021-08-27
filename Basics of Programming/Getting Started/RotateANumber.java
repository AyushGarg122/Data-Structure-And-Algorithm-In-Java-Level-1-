import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        int temp = n;
        int count = 0;

        while(temp!=0){
            count++;
            temp = temp / 10;
        }

        int rot = r<0? ((r%count) + count): r % count;
        
        int div = (int)Math.pow(10,rot);
        int mul = (int)Math.pow(10,count - rot);
        
        int rem = n % div;
        int quo = n / div;
        
        int ans = (rem * mul) + quo;
        System.out.println(ans);
    }
}
