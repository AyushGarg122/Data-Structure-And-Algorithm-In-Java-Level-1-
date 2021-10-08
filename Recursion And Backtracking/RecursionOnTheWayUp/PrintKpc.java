import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printKPC(str,"");
    }

    public static void printKPC(String str, String asf) {
        String []keys = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
        printKPC(str,asf,keys);
    }

    public static void printKPC(String str, String asf, String  []keys) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        
        String curr = keys[str.charAt(0) - '0'];
        for(int i=0; i<curr.length(); i++){
            printKPC(str.substring(1), asf + curr.charAt(i), keys);
        }
    }

}
