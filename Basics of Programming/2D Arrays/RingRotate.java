import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int s = scn.nextInt();
        int r = scn.nextInt();

        int []array = fill1dArray(arr,s);
        rotate(array,r);
        fill2DArray(arr,array,s);
        display(arr);
    }
    
    public static int[] fill1dArray(int [][]arr, int s){
        int n = arr.length;
        int m = arr[0].length;
        
        int minr = s - 1;
        int minc = s - 1;
        int maxr = n - s;
        int maxc = m - s;
        
        int size = ((maxr-minr+1) * 2) + ((maxc-minc+1) * 2) - 4;
        int []array = new int[size];
        int idx = 0;
        
        for(int i=minc; i<=maxc; i++){
            array[idx] = arr[minr][i];
            idx++;
        }
        
        minr++;
        
        for(int i=minr; i<=maxr; i++){
            array[idx] = arr[i][maxc];
            idx++;
        }
        
        maxc--;
        
        for(int i=maxc; i>=minc; i--){
            array[idx] = arr[maxr][i];
            idx++;
        }
        
        maxr--;
        
        for(int i=maxr; i>=minr; i--){
            array[idx] = arr[i][minc];
            idx++;
        }
        
        return array;
    }
    
    public static void fill2DArray(int [][]arr, int []array, int s){
        int n = arr.length;
        int m = arr[0].length;

        int minr = s - 1;
        int minc = s - 1;
        int maxr = n - s;
        int maxc = m - s;
        
        int idx = 0;

        for(int i=minc; i<=maxc; i++){
            arr[minr][i] = array[idx];
            idx++;
        }

        minr++;

        for(int i=minr; i<=maxr; i++){
            arr[i][maxc] = array[idx];
            idx++;
        }

        maxc--;

        for(int i=maxc; i>=minc; i--){
            arr[maxr][i] = array[idx];
            idx++;
        }

        maxr--;

        for(int i=maxr; i>=minr; i--){
            arr[i][minc] = array[idx];
            idx++;
        }
    }
    
    public static void rotate(int []arr, int r){
        int n = arr.length; 
        
        r = r<0? (r % n) + n: (r % n);
        
        reverse(arr,0,r-1);
        reverse(arr,r,n-1);
        reverse(arr,0,n-1);
    }
    
    public static void reverse(int []arr, int i, int j){
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
