import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int len = str.length();
        int[]dp=new int[len];
         int c = str.charAt(0)-'0'; //converting char to int
            if(c!=0)   {
                dp[0]=1;
            }
        for(int i=1;i<len;i++)
        {
            int nc = str.charAt(i)-'0'; //converting char to int,nc is nextchar
            int twos= c*10 + nc;
            
            if(nc!=0)   {
                dp[i] = dp[i-1];
            }
            if(twos<=26 && c!=0 && i>1){
                dp[i]+=dp[i-2];
                c=nc;
            }else if(twos<=26 && c!=0){
                
                dp[i]+=dp[i-1];
                c=nc;
            
            }
            c=nc;
          
        }
        System.out.print(dp[len-1]);
        
        
        
        
        
        
        
        
        
        
        
    }
}