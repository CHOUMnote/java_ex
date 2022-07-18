package week14;
import java.util.*;

public class Dijkstra {
	public int N;
	List<DEdge>[] graph;
	public int[] previous;
	public Dijkstra(List<DEdge>[] adjList) {
		N = adjList.length;
		previous = new int[N];
		graph = adjList;
	}
	public int[] shortestPath(int s) {
		boolean visited[] = new boolean[N];
		int D[] = new int[N];
		for(int i = 0; i<N; i++) {
			visited[i] = false;
			D[i] = Integer.MAX_VALUE;
			previous[i] = -1;
		}
		previous[s] = 0;
		D[s] = 0;
		for(int k = 0; k<N; k++) {
			int minvertex = -1;
			int min = Integer.MAX_VALUE;
			for(int j = 0; j<N; j++) {
				if((!visited[j]) && D[j]<min) {
					minvertex = j;
					min = D[j];
				}
			}
			visited[minvertex] = true;
			for(DEdge e : graph[minvertex]) {
				if(!visited[e.adjvertex]) {
					int currentDist = D[e.adjvertex];
					int newDist = D[minvertex]+e.weight;
					if(newDist < currentDist) {
						D[e.adjvertex] = newDist;
						previous[e.adjvertex] = minvertex;
					}
				}
			}
		}
		return D;
	}
}
