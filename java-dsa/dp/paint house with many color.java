import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][]arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int[][]dp=new int[n][m];
        int min=Integer.MAX_VALUE;  //minimum
        int smin=Integer.MAX_VALUE; //second minimun
        
        for(int i=0;i<n;i++){
            int nmin =Integer.MAX_VALUE; //new minimum
            int nsmin =Integer.MAX_VALUE; //new second minimum
            for(int j=0;j<m;j++){
                if(i==0){
                    dp[i][j]=arr[i][j];
                }else{
                    if(dp[i-1][j]!=min){
                    dp[i][j]= min+arr[i][j];
                    }
                    else{
                        dp[i][j]=smin+arr[i][j];
                    }
                }
                
                if(nmin>dp[i][j]){
                    nsmin=nmin;
                    nmin=dp[i][j];
                }else if(nsmin>dp[i][j]){
                    nsmin=dp[i][j];
                }
                
            }
            min=nmin;
            smin=nsmin;
        }
        
        
        System.out.println(min);
        
        
        
        
    }
}