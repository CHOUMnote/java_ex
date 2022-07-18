package week14;

import java.util.*;

public class AdjList {
	List<Edge>[] graph;
	int[][] mat;
	public AdjList(int size) {
		graph = new List[size];
		for(int i = 0; i<size; i++) {
			graph[i] = new LinkedList<>();
		}
		mat = new int[size][size];
	}
	public void add(int a, int b, int w) { //a to b ����ġ w
		graph[a].add(new Edge(b,w));
		graph[b].add(new Edge(a,w));
		mat[a][b] = w;
		mat[b][a] = w; 
		//������?
	}
	public void n_add(int a, int b, int w) { //a to b ����ġ w 
		graph[a].add(new Edge(b,w));
		mat[a][b] = w;
		//����?
	}
	public int[][] getReverseMatrix(){
		int temp[][] = new int[mat.length][mat.length];
		for(int i = 0; i< mat.length; i++) {
			for(int j = 0; j<mat.length; j++)
				temp[j][i] = mat[i][j];
		}
		return temp;
	}
	public void printGraph() {
		System.out.println("---����Ʈ ���---");
		for(int i = 0; i<graph.length; i++) {
			System.out.print("["+i+"]"+" ");
			for(Edge e : graph[i]) {
				System.out.print(e.adjvertex+" ");
			}System.out.println();
		}
	}
	public void printMat() {
		System.out.println("---��Ʈ���� ���---");
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat.length; j++) {
				System.out.print(mat[i][j]+" ");
			}System.out.println();
		}
	}
}
