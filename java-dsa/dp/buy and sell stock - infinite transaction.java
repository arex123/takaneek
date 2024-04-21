import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int maxP = 0; //max profit
        int bp = 0;  //buying point
        int sp = 0; //selling point
        for(int i=1;i<n;i++){
            
            if(arr[i]>arr[i-1]){
                sp++;
            }else{
                maxP =maxP+ arr[sp]-arr[bp];
                bp = sp = i;
            }
            
        }
        maxP =maxP+arr[sp] - arr[bp]; 
        System.out.print(maxP);
    }

}