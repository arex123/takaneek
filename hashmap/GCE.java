/*

n=9

0 2 5 0 2 7 7 7 3  ==>  0 2 3 5 7

my approach:
0 2 5 0 2 7 7 7 3  ==> 0 2 5 7 3  ==>  0 2 3 5 7


a[9] = 0 2 5 0 2 7 7 7 3 
ans<ArrayList>

{
ArrayList<Integer> al = new ArrayList<>();
al.add(a[0]);
for( int i=1;i<n;i++){
    int val = a[i];
    if(val!=check(al,val))
    al.add(val);
    
}
print(al);

}

function check(Arraylist)




*/
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[]a1 = new int[n1];
    for(int i=0;i<n1;i++){
        a1[i]= scn.nextInt();
    }
    int n2 = scn.nextInt();
    int[]a2 = new int[n2];
    for(int i=0;i<n2;i++){
        a2[i]= scn.nextInt();
    }
    
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<n1;i++){
        if(map.containsKey(a1[i])){
            int freq = map.get(a1[i])+1;
            map.put(a1[i],freq);
        }else{
            map.put(a1[i],1);
        }
    }
    
    // System.out.println(map);
    for(int i=0;i<n2;i++){
        int num = a2[i];
        if(map.containsKey(num)){
            System.out.println(num);
            map.remove(num);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 }

}