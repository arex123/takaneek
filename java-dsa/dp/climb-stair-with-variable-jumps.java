import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int a[]=  new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scn.nextInt();
        } 
        
        System.out.print(jumps(a));
    }
    public static int jumps(int[]a){
        int[]dp = new int[a.length+1];
        dp[a.length] = 1;
        for(int i=a.length-1;i>=0;i--){
            for(int j=1;j<=a[i]&&i+j<=a.length;j++){
                dp[i]+=dp[i+j];
            }
        }
        return dp[0];
    }

}