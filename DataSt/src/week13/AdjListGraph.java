package week13;

import java.util.LinkedList;
import java.util.List;

public class AdjListGraph {
	private List<Edge>[] adjList;
	List<Integer>[] graph;	//6번용 인티저 그래프
	public AdjListGraph() {	//인자없을때 기본 생성자 -> 특정 그래프 생성
		buildGraph();
	}	
	public AdjListGraph(int n, int a[][]) {	//정점의 개수 + a to b의 대한 정보
		buildGraph(n,a);
	}
	public AdjListGraph(int n, int a[][],boolean t) {	//정점의 개수 + a to b의 대한 정보  + 전치?
		buildGraph(n,a,t);
	}
	private void buildGraph() {		//기본 생성
		int a[][] = {{0,1,1,0}
					,{1,0,1,1}
					,{1,1,0,1}
					,{0,1,1,0}};
		adjList = new List[a.length];
		for(int i = 0; i<a.length; i++) {
			adjList[i] = new LinkedList<>();
			for(int j = 0; j < a.length; j++) {
				int temp = a[i][j];
				if(temp == 1)	adjList[i].add(new Edge(j));
			}
		}
	}
	private void buildGraph(int size, int[][] a) {	//하드코딩 사용자 정의 생성 그래프
		adjList = new List[size];
		for(int i = 0; i<size; i++) 	adjList[i] = new LinkedList<>();
		for(int i = 0; i<a.length; i++) adjList[(a[i][0])].add(new Edge((a[i][1])));
	}
	private void buildGraph(int n, int[][] mat, boolean t) {		//사용자 정의 생성 매트릭스
		int a[][] = creatMatrix(n, mat, t);
		adjList = new List[a.length];
		for(int i = 0; i<a.length; i++) {
			adjList[i] = new LinkedList<>();
			for(int j = 0; j < a.length; j++) {
				int temp = a[i][j];
				if(temp == 1)	adjList[i].add(new Edge(j));
			}
		}
		getIntegerGraph(adjList.length);//6번 풀이용 Integer 그래프
	}
	public int[][] creatMatrix(int n, int t[][], boolean transpose){	//행렬 생성 , 전치행렬??
		int[][] matrix = new int[n][n];
		for(int i = 0; i<t.length; i++) {
			matrix[t[i][0]][t[i][1]] = 1;
		}
		if(transpose) {
			int[][] temp = new int[n][n];
			for(int i = 0; i<temp.length; i++) {
				for(int j = 0; j<temp[i].length; j++) {
					temp[i][j] = matrix[j][i];
				}
			}
			matrix = temp;
		}
		
		//printMatrix(matrix);
		return matrix;
	}
	public List<Edge>[] getGraph() {
		return adjList;
	}
	public void printMatrix(int a[][]) {	//디버깅 메서드
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
	public void getIntegerGraph(int size) {
		List<Integer>[] temp = new List[size];
		for(int i = 0; i<adjList.length; i++) {
			temp[i] = new LinkedList<>();
			for(Edge e : adjList[i]) {
				temp[i].add(e.adjvertex);
			}
		}
		graph = temp;
	}
	public void print() {
		System.out.println("Graph (AdjList)");
		for(int i = 0; i < adjList.length; i++) {
			System.out.print("["+i+"]");
			for(Edge e : adjList[i]) {
				System.out.print(" => "+e.adjvertex);
			}
			System.out.println();
		}
	}
	public void printI() {
		System.out.println("Graph (Integer graph)");
		for(int i = 0; i < graph.length; i++) {
			System.out.print("["+i+"]");
			for(Integer e : graph[i]) {
				System.out.print(" => "+e);
			}
			System.out.println();
		}
	}
}
