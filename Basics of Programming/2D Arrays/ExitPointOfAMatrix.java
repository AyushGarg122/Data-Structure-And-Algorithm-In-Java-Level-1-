import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int r = 0;
        int c = 0;
        int dir = 0;

        while(r>=0 && r<n && c>=0 && c<m){
            dir = (dir + arr[r][c]) % 4;

            if(dir==0){
                c++;
            }else if(dir==1){
                r++;
            }else if(dir==2){
                c--;
            }else{
                r--;
            }
        }

        if(r<0){
            r++;
        }else if(r>=n){
            r--;
        }else if(c<0){
            c++;
        }else if(c>=m){
            c--;
        }

        System.out.println(r);
        System.out.println(c);
    }
}
