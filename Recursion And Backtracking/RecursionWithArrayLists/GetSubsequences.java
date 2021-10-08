import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> recAns = gss(str.substring(1));
        
        char curr = str.charAt(0);
        ArrayList<String> myAns = new ArrayList<>(recAns);
        for(String s: recAns){
            myAns.add(curr + s);
        }
        
        return myAns;
    }

}
