import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> myAns = new ArrayList<>();
        for(int i=1; i<=3; i++){
            if(n - i>=0){
                ArrayList<String> recAns = getStairPaths(n - i);
                for(String s: recAns){
                    myAns.add(i + s);
                }
            }
        }
        
        return myAns;
    }

}
