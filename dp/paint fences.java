import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int k=scn.nextInt();
        int same=k*1;
        int diff=k*(k-1);
        int sum=same+diff;
        for(int i=3;i<=n;i++){
            int nsame = diff*1;
            int ndiff = sum*(k-1);
            int nsum = nsame+ndiff;
            
            
            same=nsame;
            diff=ndiff;
            sum=nsum;
        }
        System.out.println(sum);
    }
}