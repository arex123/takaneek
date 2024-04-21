import java.io.*;
import java.util.*;

public class Main {

  public static void radixSort(int[] arr) {
    // write code here 
    int max =  Integer.MIN_VALUE;
    for(int a:arr){
        if(a>max){
            max=a;
        }
    }
    int exp = 1;
    while(exp<=max){
        countSort(arr,exp);
        exp*=10;
    }
    
  }
  
  public static void countSort(int[] arr, int exp) {
   //write your code here
  
   int[]count = new int[10];
   for(int i=0;i<arr.length;i++){
       int val = arr[i]/exp%10;
       count[val]+=1;
       
   }
   
  
   for(int i=1;i<count.length;i++){
       count[i]+=count[i-1];
   }
   
   int[]ans = new int[arr.length];
   for(int i=arr.length-1;i>=0;i--){
    //   int val = arr[i]/exp%10;
    //   int var = count[val]-1; //var means pos
    //   count[val] = var; 
    //   ans[var] = val;
    
    int pos = count[arr[i]/exp%10]-1;  //pos == var
    ans[pos]=arr[i];
    count[arr[i]/exp%10]--;
   }
   
   
  for(int i=0;i<arr.length;i++){
      arr[i]=ans[i];
  }
   System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

//   public static void countSort(int[] arr, int exp) {
//     // write code here
   
//   }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}