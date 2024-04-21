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
          int f = st.peek();
          st.pop();
          int s = st.peek();
          st.pop();
          if(arr[f][s]==1){
              st.push(s);
          }
          if(arr[f][s]==0){
              st.push(f);
          }
      }
      int left = st.peek(); //left is the guy who is left in stack
      
      for(int row=0;row<n;row++){
          if(row!=left){
              if(arr[left][row]==1){
                  return -1;
              }
          }
      }
       for(int col=0;col<n;col++){
          if(col!=left){
              if(arr[col][left]==0){
                  return -1;
              }
          }
      }
            
    return left;
        
    }

}