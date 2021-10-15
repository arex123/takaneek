import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }

      // write your code here
      boolean vis[][] = new boolean[m][n];
      int count = island(arr); //cnt means count
      System.out.println(count);
   }
   
   public static int island(int[][]arr){
       boolean vis[][] = new boolean[arr.length][arr[0].length];
       int count=0;
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[0].length;j++){
               if(vis[i][j]==false && arr[i][j]==0){
                   visitIsland(arr,i,j,arr.length,arr[0].length,vis);
                   count++;
               }
           }
       }
       
       return count;
   }
   
   public static void visitIsland(int[][] arr,int sr,int sc,int tr,int tc,boolean[][]vis){ 
       //sr for source row, sc for source col , tr for total row, tc for total col
    
    if(sr<0 || sc<0 || sr>=tr || sc>=tc || vis[sr][sc]==true|| arr[sr][sc]==1)  {
        return ;
    }
       
       
       
   vis[sr][sc]=true;
   visitIsland(arr,sr+1,sc,tr,tc,vis);
   visitIsland(arr,sr,sc+1,tr,tc,vis);
   visitIsland(arr,sr-1,sc,tr,tc,vis);
   visitIsland(arr,sr,sc-1,tr,tc,vis);
       
       
       
       
   }

}














