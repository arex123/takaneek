import java.io.*;
import java.util.*;

public class Main {
        
    public static long partitionKSubset(int n, int k) {
        // write your code here
        long[][]dp=new long[k+1][n+1];
        for(int team=1;team<=k;team++){
            for(int ppl=1;ppl<=n;ppl++){
                if(team==1){
                    dp[team][ppl]=1;
                }
               else if(team==ppl){
                    dp[team][ppl]=1;
                }
                else if(ppl>team){
                    dp[team][ppl]=team*dp[team][ppl-1]+dp[team-1][ppl-1];
                }
            }
        }
        return dp[k][n];
        
        
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        long res = partitionKSubset(n, k);
        System.out.println(res);
    }
}