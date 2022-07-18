package week14;
import java.util.*;

public class PrimMST {
	int N; //������ ��
	List<Edge>[] graph;
	
	public PrimMST(List<Edge>[] adjList){
		N = adjList.length;
		graph = adjList;
	}
	
	public int[] mst(int s) {
		boolean[] visited = new boolean[N];
		int[] D = new int[N]; 			//������ �����鿡 ���Ͽ� �ּ� ����ġ ����
		int[] previous = new int[N];	//MST�� ���Ե� ������ ���� (i TO j)
		for(int i = 0; i<visited.length; i++) { 
			visited[i] = false;
			D[i] = Integer.MAX_VALUE;
			previous[i] = -1;
		}
		previous[s] = 0;
		D[s] = 0;
		
		for(int k = 0; k<N; k++) {	//�湮X ������ ������ �ּ� ���� ã��
			int minVertex = -1;
			int min = Integer.MAX_VALUE;
			for(int j = 0; j<N; j++) {
				if((!visited[j]) && (D[j] < min)) {
					min = D[j];
					minVertex = j;
				}
			}
			visited[minVertex] = true;
			for(Edge i : graph[minVertex]) {
				if(!visited[i.adjvertex]) {
					int currentDist = D[i.adjvertex];
					int newDist = i.weight;
					if(newDist < currentDist) {
						D[i.adjvertex] = newDist;
						previous[i.adjvertex] = minVertex;
					}
				}
			}
		}
		return previous;
	}
	public void print(int s) {
		int[] arr = mst(s);
		System.out.println("�ּҽ���Ʈ�� ���� : ");
		for(int i = 1; i<N; i++)
			System.out.print("("+i+","+arr[i]+") ");
		System.out.println("\n");
		weightSum(arr);
	}
	public void weightSum(int[] arr) {
		int result = 0;
		for(int i = 0 ; i<N; i++ ) {
			for(Edge e : graph[i]) 
				if(arr[i] == e.adjvertex) {
					result += e.weight;
					break;
				}
		}
		System.out.println("�ּҽ���Ʈ���� ���� ����ġ �� = "+result);
	}
}
