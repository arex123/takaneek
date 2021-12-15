import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        
        int[][] chess = new int[n][n];
    
        
        printKnightsTour(chess,r,c,1);
    }

    public static void printKnightsTour(int[][] chess, int i, int j, int upcomingMove) {
        
        if( i<0 ||  j<0 || i>=chess.length || j>=chess.length || chess[i][j]>0){
            return;
        }
        
        if(upcomingMove==chess.length*chess.length){
            chess[i][j] = upcomingMove;
            displayBoard(chess);
            chess[i][j] = 0;
            return;
        }
        
        chess[i][j] = upcomingMove;
        
        printKnightsTour(chess,i-2,j+1,upcomingMove+1);
        printKnightsTour(chess,i-1,j+2,upcomingMove+1);
        printKnightsTour(chess,i+1,j+2,upcomingMove+1);
        printKnightsTour(chess,i+2,j+1,upcomingMove+1);
        printKnightsTour(chess,i+2,j-1,upcomingMove+1);
        printKnightsTour(chess,i+1,j-2,upcomingMove+1);
        printKnightsTour(chess,i-1,j-2,upcomingMove+1);
        printKnightsTour(chess,i-2,j-1,upcomingMove+1);
        
        chess[i][j]=0;
        
        
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}