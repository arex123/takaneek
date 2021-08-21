import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // System.out.print(stair(n));  //with recursion
        // System.out.print(stair_mem(n,new int[n+1]));    //with memoisation
        System.out.print(stair_tab(n));   //with tabulation
    }
    public static int stair(int n)
    {
        if(n==0)
        {
            return 1;
        }else if(n<0)
        {
            return 0;
        }
        
        int s1 = stair(n-1);
        int s2 = stair(n-2);
        int s3 = stair(n-3);
        
        int total = s1 + s2 + s3;
        return total;
    }
    public static int stair_mem(int n,int dp[])
    {
        if(n==0)
        {
            return 1;
        }
        else if(n<0)
        {
            return 0;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        int s1 = stair_mem(n-1,dp);
        int s2 = stair_mem(n-2,dp);
        int s3 = stair_mem(n-3,dp);
        int total = s1 + s2 + s3;
        dp[n] = total;
        return total;
    }
    public static int stair_tab(int n)
    {
        int[] dp = new int[n+1];  //define storage
        dp[0] =1;                 //assign meaning to storage
        for(int i=1;i<=n;i++)     //travel and solve
        { 
            if(i==1)            // notes padhe
            {
                dp[i] = dp[0];
            }else if(i==2)
            {
                dp[i] = dp[i-1] + dp[i-2];
            }else{
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
        return dp[n];
    }
}





















