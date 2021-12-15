import java.io.*;
import java.util.*;

public class Main {
    public static class Edge{
        int v;
        int n;
        
        Edge(int v,int n){
            this.v = v;
            this.n = n;
        }
    }
   

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());
      
      // write your code here
      ArrayList<Edge>[] graph = new ArrayList[n];
      for(int v=0;v<n;v++){
         graph[v] = new ArrayList<>();   
      }
      
      for(int e=0;e<k;e++){
          String line = br.readLine();
          
          String[] parts = line.split(" ");
          
          int v1 = Integer.parseInt(parts[0]);
          int v2 = Integer.parseInt(parts[1]);
          
          graph[v1].add(new Edge(v1,v2));
          graph[v2].add(new Edge(v2,v1));
          
      }
      
      boolean[] vis = new boolean[n];
      ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
      for(int i=0;i<n;i++){
          if(vis[i]==false){
              ArrayList<Integer> comp = new ArrayList<>();
              getConnected(graph,i,vis,comp);
              comps.add(comp);
          }
      }
      
      int pair=0;
      for(int i=0;i<comps.size();i++){
          
          for(int j=i+1;j<comps.size();j++){
              
              pair+=comps.get(i).size() * comps.get(j).size();
              
          }
          
          
          
      }
      
        
    System.out.println(pair);
   }
   
   public static void getConnected(ArrayList<Edge>[] graph,int sr,boolean[]vis,ArrayList<Integer>comp){
       
       
       vis[sr]=true;
       comp.add(sr);
       for(Edge e:graph[sr]){
           if(vis[e.n]==false){
               getConnected(graph,e.n,vis,comp);
           }
       }
       
       
   }
   
   
   
   
   
   
   
   
   
   
   
   
   

}