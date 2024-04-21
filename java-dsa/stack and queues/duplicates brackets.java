import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn =  new Scanner(System.in);
        String str  =scn.nextLine();
        System.out.print(duplicate(str));
        
    }
    
    public static boolean duplicate(String exp){
     Stack<Character> st = new Stack<>();
        
        for(int i=0;i<exp.length();i++) {
            if(exp.charAt(i)==')'){
                //settle
                
                int count = 0;
                
                while(st.peek()!='(')
                {
                    count++;
                    st.pop();
                }
                st.pop();
                if(count==0)
                {
                    return true; // it has duplicate brackets
                }
                
                
            }
            else if(exp.charAt(i)!=' '){
                st.push(exp.charAt(i));
            }
        }
     return false;
        
    }
}

//2nd method to solve this problem


//import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         Scanner scn = new Scanner(System.in);
//         String str = scn.nextLine();
        
//         Stack<Character> st = new Stack<>();
//         for(int i=0;i<str.length();i++){
//             char c = str.charAt(i);
//             if(c==')'){
//                 if(st.peek()=='('){
//                     System.out.println("true");
//                     return;
//                 }
//                 else{
//                     while(st.peek()!='('){
//                         st.pop();
//                     }
//                 st.pop();
//                 }
                
//             }
//             else{
//                 st.push(c);
//             }
            
//         }
//         System.out.println("false");
        
//     }

// }