import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack<Integer> operand = new Stack<>();
    Stack<Character> operator = new Stack<>();
    for(int i=0;i<exp.length();i++){
    char ch = exp.charAt(i);
        if(ch=='('){
            operator.push(ch);
        }else if(ch==')'){
            while(operator.peek()!='('){
                int v2 = operand.pop();
                int v1 = operand.pop();
                char op = operator.pop();
                int res = evaluate(v1,v2,op);
                operand.push(res);
            }
            operator.pop();
        }else if(ch=='/' || ch=='*' || ch=='-' || ch=='+'){
            while(operator.size()>0 && precedence(ch)<= precedence(operator.peek()) &&
            operator.peek()!='(')
            {
                int v2 = operand.pop();
                int v1 = operand.pop();
                char op = operator.pop();
                int res = evaluate(v1,v2,op);
                operand.push(res);
            }
            operator.push(ch);
            
        }else if(Character.isDigit(ch)){
            operand.push(ch-'0');
        }
    }
    
    while(operator.size()!=0){
          int v2 = operand.pop();
          int v1 = operand.pop();
          char op = operator.pop();
          int res = evaluate(v1,v2,op);
          operand.push(res);
    }
    
    
    System.out.println(operand.peek());
    
    
 }
 public static int precedence(char ch){
     if(ch=='+'){
         return 1;
     }else if(ch=='-'){
         return 1;
     }
     else if(ch=='*'){
         return 2;
     }else{
         return 2;
     }
 }
 public static int evaluate(int v1,int v2,char ch){
     if(ch=='+'){
         return v1+v2;
     }else if(ch=='-'){
         return v1-v2;
     }
     else if(ch=='*'){
         return v1*v2;
     }else{
         return v1/v2;
     }
 }
 
 
 
 
}