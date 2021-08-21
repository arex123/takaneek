import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        int amt = scn.nextInt();
        int[] dp = new int[amt+1];
        for(int i=0;i<n;i++){
            int a = arr[i];
            for(int j=0;j<dp.length;j++){
                if(i==0 && j==0){
                    dp[j]=1;
                }else if(j>=a){
                    int val = j-a;
                    if(dp[val]!=0){
                        dp[j]+=dp[val];
                    }
                }
            }
        }
        System.out.println(dp[amt]);
    }
}