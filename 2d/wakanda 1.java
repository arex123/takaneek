import java.io.*;
import java.util.*;

public class Main{

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
    
    for(int c=0;c<m;c++){
        if(c%2==0){
            for(int r=0;r<n;r++){
                System.out.println(arr[r][c]+" ");
            }
        }
        else{
            for(int r=n-1;r>=0;r--){
                System.out.println(arr[r][c]+" ");
            }
        }
     
    }
    
    
    
 }

}