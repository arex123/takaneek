import java.util.*;
public class Main{
    
        public static class edge{
            int sr;
            int nb;
            int ew;
            
            public edge(int sr,int nb,int ew){
                this.sr=sr;
                this.nb=nb;
                this.ew=ew;
            }
        }
    public static void main(String[] args){
        ArrayList<edge>[] graph = new ArrayList[7];
        
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
            
            graph[0].add(new edge(0,1,10));
            graph[0].add(new edge(0,3,40));
            
            graph[1].add(new edge(1,2,10));
            graph[1].add(new edge(1,0,10));
            
            graph[2].add(new edge(2,1,10));
            graph[2].add(new edge(2,3,10));
            
            graph[3].add(new edge(3,4,3));
            graph[3].add(new edge(3,0,40));
            graph[3].add(new edge(3,2,10));
            
            graph[4].add(new edge(4,3,3));
            graph[4].add(new edge(4,5,3));
            graph[4].add(new edge(4,6,7));
            
            graph[5].add(new edge(5,4,3));
            graph[5].add(new edge(5,6,2));
            
            graph[6].add(new edge(6,4,7));
            graph[6].add(new edge(6,5,2));
        
        for(int i=0;i<graph.length;i++){
            System.out.print(i+" -> ");
            
            for(edge e:graph[i]){
                System.out.print(" [ "+e.nb+" @ "+e.ew+" ] " );
            }
            System.out.println();
            
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}