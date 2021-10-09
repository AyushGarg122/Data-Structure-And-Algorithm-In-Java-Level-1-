import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printEncodings(str,"");
    }

    public static void printEncodings(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }else if(str.length()==1){
            if(str.charAt(0)=='0'){
                return;
            }

            int val = (str.charAt(0) - '0') + 96;
            char ch = (char)val;
            printEncodings(str.substring(1), ans + ch);
        }else{
            if(str.charAt(0)=='0'){
                return;
            }
            int val = (str.charAt(0) - '0') + 96;
            char ch = (char)val;
            printEncodings(str.substring(1), ans + ch);

            int val2 = Integer.parseInt(str.substring(0,2));
            if(val2<=26){
                char ch2 = (char)(val2 + 96);
                printEncodings(str.substring(2), ans + ch2);
            }
        }
    }

}
