import java.io.*;
import java.util.*;

public class Main {
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz" };
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> list = getKPC(str);
        System.out.println(list);
    }

    public static ArrayList<String> getKPC(String str) {
     
     if(str.length()==0){
         ArrayList<String> bs = new ArrayList<>();
         bs.add("");
         return bs;
     }
     
     char fc=str.charAt(0); //first char
     String ros = str.substring(1);
     ArrayList<String> sl =getKPC(ros); //small list
     
     int cv = fc-'0'; //char value
     String code=codes[cv];
     ArrayList<String> bl = new ArrayList<>();  //big list
     for(int i=0;i<code.length();i++){
         char c = code.charAt(i);
         for(String val:sl){
             bl.add(c+val);
         }
     }
     return bl;
    }

}