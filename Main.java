/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Graph
{
    ArrayList<ArrayList<Integer>>graph;
    int V;
    Graph(int nodes)
    {
        V=nodes;
        graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++)
        {
            graph.add(new ArrayList<Integer>());
        }
    }
    
    void addEdge(int v,int u)
    {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }
    void printg()
    {
        for(int i=0;i<V;i++)
        {
            System.out.println("");
            System.out.print("Node "+i);
            for(int x:graph.get(i))
            {
               System.out.print("-->"+x);
               
            }
            
        }
        
    }
}
public class Main
{
	public static void main(String[] args) {
	    Graph g=new Graph(5);
	    g.addEdge(0,1);
	    g.addEdge(3,2);
	     g.addEdge(2,2);
	      g.addEdge(4,1);
           g.addEdge(0,2);
           g.printg();
	    
	    
		
	}
}
