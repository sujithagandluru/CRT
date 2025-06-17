import java.util.*;
public class GraphApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Graph graph=new Graph(false);
		System.out.println("enter number of edges:");
		int edges=sc.nextint();
		System.out.println("enter adges(format:src dest):");
		for(int i=0;i<edges;i++){
			int src=sc.nextInt();
			int dest=sc.nextInt();
			graph.addEdges(src,dest);
		}
		System.out.printn("Graph:");
		graph.printGrph();
	}
}