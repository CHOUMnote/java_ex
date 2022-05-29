package week13;
import java.util.*;

public class TopologicalSort {
	int N;
	boolean[] visited;
	List<Integer>[] adjList;
	List<Integer> sequence;
	public TopologicalSort(List<Integer>[] graph) {
		N = graph.length;
		visited = new boolean[N];
		adjList = graph;
		sequence = new ArrayList<>();
	}
	public List<Integer> tsort(){
		for(int i = 0; i<N; i++) if(!visited[i])	dfs(i);
		Collections.reverse(sequence);
		return sequence;
	}
	public void dfs(int i) {
		visited[i] = true;
		for(int v : adjList[i]) {
			if(!visited[v]) dfs(v);
		}
		sequence.add(i);
	}
	public void print() {
		System.out.println("위상 정렬 : ");
		System.out.print("[ ");
		for(Integer i : tsort())
			System.out.print(i+" ");
		System.out.print(']');
	}
}
