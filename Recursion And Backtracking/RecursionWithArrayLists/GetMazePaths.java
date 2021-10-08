import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int er = scn.nextInt();
        int ec = scn.nextInt();
        System.out.println(getMazePaths(0,0,er-1,ec-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        int [][]dir = {{0,1}, {1,0}};
        String[]dirS = {"h", "v"};
        return getMazePaths(sr,sc,dr,dc,dir,dirS);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc, int [][]dir, String []dirS) {
        if(sr==dr && sc==dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> myAns = new ArrayList<>();
        for(int i=0; i<dir.length; i++){
            int r = sr + dir[i][0];
            int c = sc + dir[i][1];
            
            if(r<=dr && c<=dc){
                ArrayList<String> recAns = getMazePaths(r,c,dr,dc,dir,dirS);
                for(String  s: recAns){
                    myAns.add(dirS[i] + s);
                }
            }
        }
        
        return myAns;
    }

}
