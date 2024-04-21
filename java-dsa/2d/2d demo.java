import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][]arr = new int[n][m];
    for(int r=0;r<n;r++){
        for(int c=0;c<m;c++){
            arr[r][c]=scn.nextInt();
        }
    }
    
    for(int r=0;r<n;r++){
        for(int c=0;c<m;c++){
            System.out.print(arr[r][c]+" ");
        }
        System.out.println();
    }
    
 }

}