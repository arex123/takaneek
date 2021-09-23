import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        int celeb = findCelebrity(arr);
        if(celeb==-1){
        System.out.print("none");
        }else{
        System.out.print(celeb);
        }

    }

    public static int findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
      int n = arr.length;  
      Stack<Integer> st = new Stack<>();
      for(int i=0;i<n;i++){
          st.push(i);
      }
      while(st.size()!=1){
          int f = st.pop();
          int s = st.pop();
          if(arr[f][s]==1){
              //iska mtlb 'f' jo h 's' ko jaanta h so f cant be celeb
              st.push(s);
          }else{
              // it means f dont know s so s cant be celeb
              st.push(f);
          }
      }
      int pot = st.peek(); //pot means potential candidate, he can or cannot be celeb 
      
      // lets check if potential candidate is celeb or not by checking if he satisfy the celeb condition
     for(int i=0;i<n;i++){
         if(pot!=i){
             if(arr[pot][i]==1 || arr[i][pot]==0){
                 return -1;
             }
         }
     }
            
    return pot;
        
    }

}