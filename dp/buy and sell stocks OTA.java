import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn= new Scanner(System.in);
        int n =scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int least = arr[0];
        int maxProfit= Integer.MIN_VALUE ;
        for(int i=1;i<n;i++){
            if(arr[i]<least){
                least=arr[i];
            }else{
                maxProfit= (arr[i]-least) > maxProfit ? arr[i]-least:maxProfit;
                
            }
        }
        System.out.print(maxProfit);
    }

}