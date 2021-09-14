import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   int n = arr.length;
   int ans[] = new int[n];
   
   Stack<Integer> ngl = new Stack<>();   //next greater elemt to the left
   Stack<Integer> ngli = new Stack<>();   //next greater elemt to the left ka index
    
    ngl.push(arr[0]);
    ngli.push(0);
    ans[0]=1; // index is 0 so, idx+1= 0+1 => 1
    for(int i=1;i<n;i++){
        if(ngl.peek()>arr[i] ){
            ans[i]= i-ngli.peek();
        }else{
            while( ngl.peek()<arr[i]  ){
                ngl.pop();
                ngli.pop();
                if( ngl.size()==0  ){
                    break;
                }
            }
            if(ngl.size()==0 ){
                ans[i]= i+1;
            }else{
                ans[i]= i - ngli.peek();
            }
            
        }
        
        ngl.push(arr[i]);
        ngli.push(i);
        
    }
   
   return ans;
 }

}