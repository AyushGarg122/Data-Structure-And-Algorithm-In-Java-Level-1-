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
        
        int minr = 0; 
        int minc = 0; 
        int maxr = n-1; 
        int maxc = m - 1;
        int total = n * m;
        int cc = 1;
        
        while(cc<=total){
            for(int i=minr; i<=maxr && cc<=total; i++){
                System.out.println(arr[i][minc]);
                cc++;
            }
            
            minc++;
            
            for(int i=minc; i<=maxc && cc<=total; i++){
                System.out.println(arr[maxr][i]);
                cc++;
            }
            
            maxr--;
            
            for(int i=maxr; i>=minr && cc<=total; i--){
                System.out.println(arr[i][maxc]);
                cc++;
            }
            
            maxc--;
            
            for(int i=maxc; i>=minc && cc<=total; i--){
                System.out.println(arr[minr][i]);
                cc++;
            }
            
            minr++;
        }
    }
}
