import java.util.Scanner;
public class firstvscode {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printSS(str,"");
    }

    public static void printSS(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0); //it'll find first char of string
        String ros = str.substring(1);//rest of string
        printSS(ros,ans+ch);
        printSS(ros,ans+"");
        
    }
}
// }
// class program{
//     public static void main(String[] args)
//     {
//         System.out.println("hello bro");
//     }
// }