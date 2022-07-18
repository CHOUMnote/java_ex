package week14;
import java.util.*;
public class CheckGraph {
	public static boolean isReverseSame(int[][] G) {
		for(int i = 0; i<G.length; i++) {
			for(int j = 0; j<G.length; j++) {
				if(G[j][i] != G[i][j]) return false;
			}
		}
		return true;
	}
	public static boolean isReverseSame(List<Edge>[] G) {
		int[][] temp = new int[G.length][G.length];
		for(int i = 0; i<G.length; i++) {
			for(Edge e : G[i]) {
				temp[i][e.adjvertex] = e.weight;
			}
		}
		return isReverseSame(temp);
	}
}
