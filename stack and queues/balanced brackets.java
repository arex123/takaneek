import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.print(balanced(str));
        
    }
    public static boolean balanced(String str){
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<str.length();i++ ){
            char c =str.charAt(i);
            if(c==']' || c=='}' || c==')'){
                
                if( st.size()==0 ){
                    return false; // it means string is not balanced as it starts with closing brackets
                }
                if( c==']' && st.peek() =='[' ){
                    st.pop();
                }else if( c=='}' && st.peek() =='{' ){
                    st.pop();
                }else if( c==')' && st.peek() =='(' ){
                    st.pop();
                }
                else {
                    return false;
                }
                
                
            }
            else if( c=='[' || c=='(' || c=='{'  ) {
            st.push(c);
            }
        }
        if(st.size()==0 ){
        return true;
        }else{
            return false;
        }
        
    }

}