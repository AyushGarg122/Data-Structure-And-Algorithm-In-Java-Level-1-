import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(getKPC(str));
    }

    public static ArrayList<String> getKPC(String str) {
        String []keys = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
        return getKPC(str,keys);
    }

    public static ArrayList<String> getKPC(String str, String[]keys) {
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> recAns = getKPC(str.substring(1), keys);
        
        ArrayList<String> myAns = new ArrayList<>();
        String curr = keys[str.charAt(0) - '0'];
        for(int i=0; i<curr.length(); i++){
            char ch = curr.charAt(i);
            for(String s: recAns){
                myAns.add(ch + s);
            }
        }
        
        return myAns;
    }

}
