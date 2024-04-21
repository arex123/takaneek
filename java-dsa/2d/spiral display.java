import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][]arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        int total = n*m;
        int rs = 0,cs=0,re = n-1,ce=m-1;
        
        while(total>0){
            
            //up to down
            int trs = rs; //temp row start
            while(trs<=re && total>0){
                System.out.println(arr[trs][cs]);
                trs++;
                total--;
            }
            cs++;
            
            //left to right
            
            int tcs = cs;
            while(tcs<=ce && total>0){
                System.out.println(arr[re][tcs]);
                tcs++;
                total--;
            }
            re--;
            
            //down to up
            
            int tre = re;
            while(tre>=rs && total>0){
                System.out.println(arr[tre][ce]);
                tre--;
                total--;
            }
            ce--;
            
            //right to left
            int tce=ce;
            while(tce>=cs && total>0){
                System.out.println(arr[rs][tce]);
                tce--;
                total--;
            }
            rs++;
            
        }
        
        
    }

}