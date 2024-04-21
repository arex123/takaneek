import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn = new Scanner(System.in);
    //big test case therefore took long data type
    long n = scn.nextInt();
    
    //we can make a dp[] also but we can also solve this with simple variable
    long owb = 1;
    long owp = 1;
    for(int i=2;i<=n;i++){
        long nwb = owp;
        long nwp = owp+owb;
        
        owb = nwb;
        owp = nwp;
    }
    long one_side_of_road = owb+owp;
    long both_side_of_road = one_side_of_road*one_side_of_road;
    System.out.print(both_side_of_road);
 }

}