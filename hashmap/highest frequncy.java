import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        HashMap<Character,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        char cf=' ';
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                int cv = map.get(c);//cv means current value
                if(cv>max){
                    max=cv;
                    cf=c;
                }
                cv++;
                map.put(c,cv);
            }else{
                map.put(c,1);
            }
        }
        
        System.out.println(cf);
        
    }

}