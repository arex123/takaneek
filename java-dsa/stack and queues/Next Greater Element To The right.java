import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
      
      
      Scanner scn=  new Scanner(System.in);
      int n =scn.nextInt();
      int[]arr =new int[n];
      for(int i=0;i<n;i++){
          arr[i]=scn.nextInt();
      }
      
     int [] ans = new int[n];
     Stack<Integer> st = new Stack<>();
     st.push(arr[n-1] );
     ans[n-1]=-1;
     for(int i=n-2;i>=0;i--){
         
         if( st.peek() > arr[i] ){
             ans[i]=st.peek();
         }
         else{
             while( st.peek()< arr[i] ){
                 st.pop();
                 if(st.size()==0 ){
                     break;
                 }
             }
             if(st.size() ==0 ){
                 ans[i]=-1;
             }else{
                 ans[i]=st.peek();
             }
         }
          st.push(arr[i]);

         
         
     }
      for(int i=0;i<n;i++){
          System.out.println(ans[i] );
      }
      
  }
 }
