package week14;

public class BellmanFord {
	private int D[];
	private int previous[];
	private int N;
	
	public BellmanFord(int numOfVertices) {
		N = numOfVertices;
		D = new int[N];
		previous = new int[N];
	}
	public void sortestPath(int s, int adjMatrix[][]) {
		for(int i = 0; i<N; i++) {
			D[i] = Integer.MAX_VALUE;
			previous[i] = -1;
		}
		D[s] = 0; previous[s] = 0;
		for(int k = 0; k<N-1; k++) {
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					if(adjMatrix[i][j] != Integer.MAX_VALUE)
						if(D[j] > D[i] + adjMatrix[i][j]) {
							D[j]=D[i] + adjMatrix[i][j];
							previous[j] = i;
						}
				}
			}
		}
	}
	public void printPaths(int s) {
		System.out.println("정점 "+s+"으로부터 최단거리");
		for(int i = 1; i<N; i++) {
			System.out.println("["+s+","+i+"]\t=\t"+D[i]);
		}

		System.out.println("\n정점 "+s+"으로부터 최단경로");
		for(int i = 1; i<N; i++) {
			int t = i;
			System.out.print(t);
			while(t!=0) {
				System.out.print("<-"+previous[t]);
				t = previous[t];
			}System.out.println();
		}
	}
	
	
}