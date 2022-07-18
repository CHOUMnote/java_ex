package week14;
import java.util.*;

public class MyGraph {
	public static int[][] getAdjMatrixFromAdjList(List<Edge>[] lst){
		int result[][] = new int[lst.length][lst.length];
		for(int i = 0; i<lst.length; i++) 
			for(Edge e : lst[i]) 
				result[i][e.adjvertex] = e.weight;
		return result;
	}
	public static List<Edge>[] getAdjListFromAdjMatrix(int[][] mat){
		List<Edge>[] result = new List[mat.length];
		for(int i = 0; i < mat.length; i++) 
			result[i] = new LinkedList<>();
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat.length; j++) {
				if(mat[i][j] != 0)
					result[i].add(new Edge(j,mat[i][j]));
			}
		}
		return result;
	}
	public static void print(int[][] mat) {
		System.out.println("AdjMatrix : ");
		for(int i = 0 ; i<mat.length; i++) {
			for(int j = 0; j<mat.length; j++) {
				System.out.print(mat[i][j]+", ");
			}System.out.println();
		}
	}
	public static void print(List<Edge>[] lst) {
		System.out.println("AdjList");
		for(int i = 0; i<lst.length; i++) {
			System.out.print("["+i+"]");
			for(Edge e : lst[i]) {
				System.out.print(" => "+e.adjvertex+"("+e.weight+")");
			}System.out.println();
		}
	}
}
