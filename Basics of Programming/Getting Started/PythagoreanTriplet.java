import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        a = a * a; b = b * b; c = c * c;

        if(a+b==c || b+c==a || a+c==b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
