import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[]a1 = new int[n1];
    for(int i=0;i<n1;i++){
        a1[i]=scn.nextInt();
    }
    int n2 = scn.nextInt();
    int[]a2 = new int[n2];
    for(int i=0;i<n2;i++){
        a2[i]=scn.nextInt();
    }
    
    HashMap<Integer,Integer> map1 = new HashMap<>();
    
    for(int i=0;i<n1;i++){
        int val = a1[i];
        if(map1.containsKey(val)){
            int f = map1.get(val)+1;
            map1.put(val,f);
        }else{
            map1.put(val,1);
        }
    }
    
   for(int i=0;i<n2;i++){
       int val = a2[i];
       if(map1.containsKey(val) && map1.get(val)>0 ){
           System.out.println(val);
           int f = map1.get(val)-1;
           map1.put(val,f);
       }
   }
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 }

}