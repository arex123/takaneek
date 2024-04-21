import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }

    // code
    
    int[] nsli = new int[n]; // next smaller element in left indexs
    
    Stack<Integer> stl = new Stack<>(); // stack(st) for left
    
    
    nsli[0]=-1;
    stl.push(0);
    for(int i=1;i<n;i++){
        while( stl.size()>0 && arr[stl.peek()]>=arr[i]){
            stl.pop();
        }
        if(stl.size()==0 ) {
            nsli[i]=-1;
        }else{
            nsli[i]=stl.peek();
        }
        stl.push(i);
        
    }
    
    int[] nsri = new int[n]; //next smallest right index
    Stack<Integer> str = new Stack<>(); // stack for right
    nsri[n-1]=n;
    str.push(n-1);
    for(int i=n-2;i>=0;i--){
        while( str.size()>0 && arr[str.peek()]>=arr[i] ){
            str.pop();
        }
        if(str.size()==0 ){
            nsri[i]=n;
        }else{
            nsri[i]=str.peek();
        }
        str.push(i);
    }
    
    int maxA=0; // maxA is for max rectangle area
    for(int i=0;i<n;i++){
        
        int width = nsri[i] - nsli[i] - 1;
        int area = width * arr[i] ; // arr[i] is length
        if(maxA<area){
            maxA = area;
        }
        
    }
    
    System.out.print(maxA);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 }
}