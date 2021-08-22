import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int oz=1; //count of old zero stirng
    int oo=1; //count of old one string
    for(int i=2;i<=n;i++){
        int nz=oo;
        int no=oz+oo;
        
        oo=no;
        oz=nz;
    }
    System.out.print(oo+oz);
    
 }

}