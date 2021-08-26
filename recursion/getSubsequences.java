import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    ArrayList<String> list = gss(str);
    System.out.print(list);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char c= str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> sl = gss(ros);
        
        ArrayList<String> nl = new ArrayList<>();
        for(String val:sl){
              nl.add(val) ;
        }
        for(String val:sl){
            nl.add(c+val);
        }
        return nl;
    }

}