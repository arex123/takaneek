import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
    }
    
    HashMap<Integer,Boolean> map = new HashMap<>();
    
    for(int i=0;i<n;i++){
        map.put(arr[i],true);
    }
    
    for(int i=0;i<n;i++){
        int val = arr[i];
        if(map.containsKey(val-1)){
            map.put(val,false);
        }
    }
    
    
    int lfromS = 0; // lfroms means max length from start sequnce 
    int start = 0;     // ss means stating of sequence
    for(int i=0;i<n;i++){
        int val = arr[i];
        if(map.get(val)){
            
            int ss = val; // ss means starting sequence
            int ms = 0; //max length of sequence from start
            
            while(map.containsKey(val)){
                ms++;
                val=val+1;
            }
            
            if(ms > lfromS){
                lfromS = ms;
                start = ss;
            }
            
            
        }
    }
    
    for(int i=0;i<lfromS;i++){
        System.out.println(start+i);
    }
    
    
    
 }

}