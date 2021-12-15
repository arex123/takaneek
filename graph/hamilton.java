import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());

      // write all your codes here
      int vis = 0;
      boolean[] visited = new boolean[vtces];
      hamilton(graph,src,vtces,vis+1,src+"",visited);
      
   }
   public static void hamilton(ArrayList<Edge>[]graph , int src , int tot,int vis,String psf,boolean[] visited){
       if(vis==tot){
           char f = psf.charAt(0);
           char l = psf.charAt(psf.length()-1);
           int fn = Character.getNumericValue(f); //first node
           int ln = Character.getNumericValue(l); //last node
           
           boolean is = false;
           
           for(Edge e:graph[fn]){
               if(e.nbr==ln){
                   is=true;
               }
           }
           
           if(is){
               System.out.println(psf+"*");
           }else{
               System.out.println(psf+".");
           }
       }
  
       
       visited[src]=true;
       for(Edge e:graph[src]){
           if(visited[e.nbr]==false){
               hamilton(graph,e.nbr,tot,vis+1,psf+e.nbr,visited);
           }
       }
       visited[src]=false;
       
       
       
   }

}