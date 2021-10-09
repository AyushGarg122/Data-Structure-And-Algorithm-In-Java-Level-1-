import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0,0,n-1,m-1,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        int [][]dir = {{0,1}, {1,0}};
        String[]dirS = {"h", "v"};

        printMazePaths(sr,sc,dr,dc,psf,dir,dirS);
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf, int [][]dir, String []dirS) {
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }

        for(int i=0; i<dir.length; i++){
            int r = sr + dir[i][0];
            int c = sc + dir[i][1];

            if(r<=dr && c<=dc){
                printMazePaths(r,c,dr,dc,psf + dirS[i], dir,dirS);
            }
        }
    }
}
