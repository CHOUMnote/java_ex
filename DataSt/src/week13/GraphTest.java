package week13;

import java.util.*;

public class GraphTest {
	public static void main(String args[]) {
		
		/* 1번
		AdjListGraph adj = new AdjListGraph();
		adj.print();
		*/
		
		/*	2번, 3번
		int a[][]= {{0,2},{0,1},{1,3},{1,0},{2,3},{2,0},{3,9},{3,8},{3,2},{3,1},
					{4,5},{5,7},{5,6},{5,4},{6,7},{6,5},{7,6},{7,5},{8,3},{9,3}}; //A to B의 대한 정보 -> 매트릭스 생성
		AdjListGraph adj = new AdjListGraph(10,a);
		adj.print();
		//2번
		System.out.println("\nDFS 방문 순서 : " );
		DFS dfs = new DFS(adj.getGraph());
		//3번
		System.out.println("\nDFS 방문 순서 : " );
		BFS bfs = new BFS(adj.getGraph());
		*/
		/* 4번
		List<Integer>[] graph = new List[9];
		for(int i = 0; i<graph.length; i++)	graph[i] = new LinkedList<>();
		graph[0].add(1); graph[1].add(3); graph[1].add(4); graph[3].add(6); graph[4].add(5);
		graph[5].add(3); graph[5].add(7); graph[6].add(7); graph[7].add(8);
		TopologicalSort ts = new TopologicalSort(graph);
		ts.print();
		*/
		/*	5번
		AdjListGraphExt al = new AdjListGraphExt();
		al.print();
		al.getReverse();
		al.printGraphReverse();
		*/
		/*	6번
		int a[][] = {{0,1},{0,3},{1,7},{2,8},{3,5},{3,6},{4,1},{5,1},{5,4},{6,0},{7,4},{8,6},{8,7},{8,9},{9,2}};
		AdjListGraph graph1 = new AdjListGraph(10,a,false);
		AdjListGraph graph2 = new AdjListGraph(10,a,true);
		Kosaraju k = new Kosaraju(graph1.graph,graph2.graph);
		*/
	}
}
