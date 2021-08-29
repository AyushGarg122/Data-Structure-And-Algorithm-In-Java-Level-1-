import java.util.*;
public class Main {

    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch>='a' && ch<='z'){
                ch = (char)(ch - 'a' + 'A');
            }else{
                ch = (char)(ch - 'A' + 'a');
            }
            
            sb.append(ch);
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }
}
