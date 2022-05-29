package week13;

import java.util.LinkedList;
import java.util.List;

public class Kosaraju {
	List<Integer> s;
	List<Integer>[] g;
	LinkedList<Integer[]> count = new LinkedList<>();
	LinkedList<LinkedList<Integer>> result = new LinkedList<>();
	boolean[] visited;
	public Kosaraju(List<Integer>[] g1,List<Integer>[] g2) {
		TopologicalSort a = new TopologicalSort(g1);
		s = a.tsort();
		this.g = g2;
		visited = new boolean[s.size()];
		for(int i = 0; i<visited.length;i++) visited[i]=false;
		doKosaraju();
		print();
	}
	private void doKosaraju() {
		LinkedList<Integer> list;
		for(int i : s) {
			list = new LinkedList<Integer>();
			if(!visited[i]) {
				list.add(i);
				dfs(i,list);
				result.add(list);
			}
		}
	}
	private void dfs(int i,LinkedList l) {
		visited[i] = true;
		for(int a : g[i]) {
			if(!visited[a]) {
				l.add(a);
				dfs(a,l);
			}
		}
	}
	public void print() {
		int cnt = 1;
		System.out.println("강연결성분 : ");
		for(LinkedList l : result) {
			System.out.print("["+cnt+++"] ");
			for(int i = 0; i<l.size(); i++) {
				if(i == l.size()-1)	System.out.print(l.get(i));
				else System.out.print(l.get(i)+", ");
			}
			System.out.println();
		}
	}
}
