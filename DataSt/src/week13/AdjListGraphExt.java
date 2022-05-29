package week13;
import java.util.*;

public class AdjListGraphExt extends AdjListGraph {
	private List<Edge>[] adjListReverse;	//������ �׷���
	public AdjListGraphExt() {
		super();	//������ �׷��� �ʱ�ȭ
		adjListReverse = new List[getGraph().length];
	}
	public void getReverse() {
		int size = adjListReverse.length;
		int[][]mat = new int[size][size];
		for(int i = 0; i<size; i++) {
			for(Edge e : getGraph()[i]) {
				mat[e.adjvertex][i] = 1;
			}
			adjListReverse[i]= new LinkedList();
		}
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if(mat[i][j]==1)
					adjListReverse[i].add(new Edge(j));
			}
		}
		//printMatrix(mat); �����
	}
	public void printGraphReverse() {
		System.out.println("Graph (adjListReverse)");
		for(int i = 0; i < adjListReverse.length; i++) {
			System.out.print("["+i+"]");
			for(Edge e : adjListReverse[i]) {
				System.out.print(" => "+e.adjvertex);
			}
			System.out.println();
		}
	}
}
