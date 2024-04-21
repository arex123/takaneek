	import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] values = new int[n];
            int[] capacity = new int[n];
            for(int i=0;i<n;i++)
            {
                values[i]=scn.nextInt();
            }
            for(int i=0;i<n;i++){
                capacity[i]=scn.nextInt();
            }
            int cap = scn.nextInt();
            int[]dp = new int[cap+1];
            dp[0]=0;
            for(int ccap=1;ccap<dp.length;ccap++) //current is small capacity
            {
                for(int j=0;j<n;j++)
                {
                    if(ccap>=capacity[j]){
                        int val = ccap-capacity[j];
                        int total=values[j]+dp[val];
                        if(dp[ccap]<total)
                        {
                            dp[ccap]=total;
                        }
                    }
                }
            }
            System.out.print(dp[cap]);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
	    }
	}