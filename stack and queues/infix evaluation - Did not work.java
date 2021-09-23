import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Character> st = new Stack<>();
    
    for(int i=0;i<exp.length();i++){
        st.push(exp.charAt(i));
        if(st.size()>1 && (exp.charAt(i-1)=='/' || exp.charAt(i-1)=='*') ){
            int a = st.pop()-'0';
            char op = st.pop();
            int b = st.pop() - '0';
            if(op=='/'){
                int res = b/a;
                char resCh = (char)(res+'0');
                st.push(resCh);
            }else{
                int res = b*a;
                char resCh = (char)(res+'0');
                st.push(resCh);
                
            }
        }
    }
    while(st.size()!=1 ){
            int a = st.pop()-'0';
            char op = st.pop();
            int b = st.pop()-'0';
            
            if(op=='+'){
                int res = a+b;
                char resCh = (char)(res+'0');
                st.push(resCh);
            }else if(op=='-'){
                int res = b-a;
                char resCh = (char)(res+'0');
                st.push(resCh);
            }
            
            
    }
    System.out.print(st.peek());
    
 }
}