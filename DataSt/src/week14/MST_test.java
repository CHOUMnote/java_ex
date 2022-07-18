package week14;

import java.util.LinkedList;
import java.util.List;

public class MST_test {
	public static void main(String[] args) {
		/* 1번
		AdjList graph = new AdjList(8);
		int target[][] = {{0,1,1},{0,3,2},{1,3,3},{ 1,4,1},{1,2,4},{1,5,6},
						  {3,4,5},{4,6,2},{6,2,1},{6,7,1},{2,7,2},{2,5,1},{5,7,9}};
		for(int i = 0; i<target.length; i++)
			graph.add(target[i][0], target[i][1], target[i][2]);
		MyGraph mg = new MyGraph();
		mg.print(mg.getAdjMatrixFromAdjList(graph.graph));
		System.out.println();
		mg.print(mg.getAdjListFromAdjMatrix(graph.mat));
		*/
		
		/*	2번
		int target1[][] = {{1,2,2},{2,1,7},{2,4,4},{4,2,1},{4,3,3},{3,4,9},{3,1,6},{1,3,3}};
		int target2[][] = {{1,2,2},{2,1,7},{2,4,4},{4,3,3},{3,4,9},{3,1,6},{1,3,3}};
		int target3[][] = {{1,2,1},{2,1,1},{2,4,2},{4,2,2},{4,3,3},{3,4,3},{3,1,4},{1,3,4}};
		int target4[][] = {{1,2,1},{2,4,2},{4,3,3},{3,1,4}};
		int a[][] = new int[4][4];
		for(int i = 0; i<target1.length; i++) {
			a[target1[i][0]-1][target1[i][1]-1] = target1[i][2]; 
		}
		int b[][] = new int[4][4];
		for(int i = 0; i<target2.length; i++) {
			b[target2[i][0]-1][target2[i][1]-1] = target2[i][2]; 
		}
		int c[][] = new int[4][4];
		for(int i = 0; i<target3.length; i++) {
			c[target3[i][0]-1][target3[i][1]-1] = target3[i][2]; 
		}
		int d[][] = new int[4][4];
		for(int i = 0; i<target4.length; i++) {
			d[target4[i][0]-1][target4[i][1]-1] = target4[i][2]; 
			d[target4[i][1]-1][target4[i][0]-1] = target4[i][2]; 
		}
		
		List<Edge>[] aa = new List[4];
		List<Edge>[] bb = new List[4];
		List<Edge>[] cc = new List[4];
		List<Edge>[] dd = new List[4];
		
		for(int i = 0; i<4; i++) {
			aa[i] = new LinkedList<>();
			bb[i] = new LinkedList<>();
			cc[i] = new LinkedList<>();
			dd[i] = new LinkedList<>();
		}
			
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				if(a[i][j] != 0)
					aa[i].add(new Edge(j,a[i][j]));
				if(b[i][j] != 0)
					bb[i].add(new Edge(j,b[i][j]));
				if(c[i][j] != 0)
					cc[i].add(new Edge(j,c[i][j]));
				if(d[i][j] != 0)
					dd[i].add(new Edge(j,d[i][j]));
			}
		}
		
		CheckGraph cg = new CheckGraph();
		System.out.println("1번 그래프 결과 :");
		System.out.println("전치 행렬과 같은가 ? "+cg.isReverseSame(a));
		System.out.println("역방향 리스트와 같은가 ? "+cg.isReverseSame(aa));
		System.out.println("2번 그래프 결과 :");
		System.out.println("전치 행렬과 같은가 ? "+cg.isReverseSame(b));
		System.out.println("역방향 리스트와 같은가 ? "+cg.isReverseSame(bb));
		System.out.println("3번 그래프 결과 :");
		System.out.println("전치 행렬과 같은가 ? "+cg.isReverseSame(c));
		System.out.println("역방향 리스트와 같은가 ? "+cg.isReverseSame(cc));
		System.out.println("4번 그래프 결과 :");
		System.out.println("전치 행렬과 같은가 ? "+cg.isReverseSame(d));
		System.out.println("역방향 리스트와 같은가 ? "+cg.isReverseSame(dd));
		*/
		
		
		/*	3번
		AdjList graph = new AdjList(7);
		int[][] a = { {0,1,9}, {0,2,10},{1,4,5}, {1,6,3}
					, {1,3,10},{2,5,2}, {2,3,9}, {4,2,7}
					, {6,5,6}, {5,3,4}, {6,3,8}, {6,4,1} };
		for(int i = 0; i<a.length; i++) 
			graph.add(a[i][0],a[i][1],a[i][2]);
		PrimMST mst = new PrimMST(graph.graph);
		mst.print(0);
		*/
		/*	4번
		int[][] weight = {
				{0,1,0,2,0,0,0,0},
				{1,0,4,3,1,6,0,0},
				{0,4,0,0,0,1,1,2},
				{2,3,0,0,5,0,0,0},
				{0,1,0,5,0,0,2,0},
				{0,6,1,0,0,0,0,9},
				{0,0,1,0,2,0,0,1},
				{0,0,2,0,0,9,1,0},
		};
		int N = weight.length;
		List<DEdge>[] adjList = new List[N];
		
		for(int i = 0 ; i<N; i++) {
			adjList[i] = new LinkedList<>();
			for(int j = 0; j<N; j++) {
				if(weight[i][j] != 0) {
					DEdge e = new DEdge(i, j, weight[i][j]); 
					adjList[i].add(e);
				}
			}
		}
		Dijkstra d = new Dijkstra(adjList);
		
		System.out.println("정점 0으로부터의 최단거리");
		int[] distance = d.shortestPath(0);
		for(int i = 0; i < distance.length; i++) {
			if(distance[i] == Integer.MAX_VALUE)
				System.out.println("0과 "+i+" 사이에 경로 없음.");
			else
				System.out.println("[0, "+i+"] = "+distance[i]);
		}
		System.out.printf("\n정점 0으로부터의 최단 경로\n");
		for(int i = 1; i<d.N; i++) {
			int back = i;
			System.out.print(back);
			while(back!=0) {
				System.out.print("<-"+d.previous[back]);
				back = d.previous[back];
			}System.out.println();
		}
		*/
		int INF = Integer.MAX_VALUE;
		int[][] weight = {
				{INF,1,INF,2,INF,INF,INF,INF},
				{INF,INF,4,-2,1,6,INF,INF},
				{INF,INF,INF,INF,INF,INF,INF,2},
				{INF,INF,INF,INF,-1,INF,INF,INF},
				{INF,INF,INF,INF,INF,INF,4,INF},
				{INF,INF,1,INF,INF,INF,INF,INF},
				{INF,INF,-1,INF,INF,INF,INF,1},
				{INF,INF,INF,INF,INF,3,INF,INF},
		};
		int N = weight.length;
		int s = 0;
		BellmanFord bf = new BellmanFord(N);
		bf.sortestPath(s, weight);
		bf.printPaths(s);
		
	}
}