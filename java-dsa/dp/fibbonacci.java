import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.print(fibo(n));
    
    //for memoisation you have to declare a question bank also to save the values, so that in future we can check if there is already ans in array or not
    // int[] qb = new int[n+1];
    // System.out.print(fibo_mem(n,qb));
    
    // System.out.print(fibo_tab(n)); //ye wala ni kiya
 }
 public static int fibo(int n)
 {
     if(n==0)
     {
         return 0;
     }
     if(n==1)
     {
         return 1;
     }
     
     int fnm1 = fibo(n-1);
     int fnm2 = fibo(n-2);
     
     int fn = fnm1 + fnm2;
     return fn;
 }
 public static int fibo_mem(int n,int[] qb)
 {
     if(n==0)
     {
         return 0;
     }
     if(n==1)
     {
         return 1;
     }
     
     if(qb[n]!=0)
     {
         return qb[n];
     }
     int fnm1 = fibo_mem(n-1,qb);
     int fnm2 = fibo_mem(n-2,qb);
     
     int fn = fnm1 + fnm2;
     qb[n] = fn;
     return fn;
 }
}