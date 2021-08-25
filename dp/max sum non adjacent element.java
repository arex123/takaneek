import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int inc = arr[0];
        int exl = 0;
        for(int i = 1;i<n;i++){
         int ninc = exl + arr[i];  //new inclusive
         int nexl = Math.max(inc,exl);
         
         inc = ninc;
         exl = nexl;
        }
        
        int max = Math.max(inc,exl);
        System.out.println(max);
    }
}