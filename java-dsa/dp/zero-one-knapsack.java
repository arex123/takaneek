import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int items = scn.nextInt();
    
    int[]values=new int[items];
    for(int i=0;i<items;i++)
    {
        values[i]=scn.nextInt();
    }
    
    int[]weights = new int[items];
    for(int i=0;i<items;i++){
        weights[i]=scn.nextInt();
    }
    
    int cap=scn.nextInt();
    
    int[][]dp=new int[items+1][cap+1];
    for(int i=1;i<dp.length;i++)
    {
        for(int j=1;j<dp[0].length;j++)
        {
            if(weights[i-1]<=j)
            {
                int val = j-weights[i-1];
                int withconsider = values[i-1]+dp[i-1][val];
                dp[i][j]=Math.max(dp[i-1][j],withconsider);

            }else{
                dp[i][j]=dp[i-1][j];
            }
                // System.out.print(dp[i][j]+" ");
        }
        //  System.out.println();

    }
    System.out.println(dp[items][cap]);
    }
    
    
    
    
    
    
    
    
    
    
    
    
}