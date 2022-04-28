package week9;
import java.util.*;
public class BinaryTree <Key extends Comparable<Key>>{
	private Node root;
	public BinaryTree() {
		root = null;
	}
	public Node getRoot() {return root;}
	public void setRoot(Node r) { root = r;}
	public boolean isEmpty() { return root==null;}
	
	public void preorder(Node n) {
		if(n != null) {
			System.out.print(n.getKey()+" ");
			preorder(n.getLeft());
			preorder(n.getRight());
		}
	}
	public void inorder(Node n) {
		if(n != null) {
			inorder(n.getLeft());
			System.out.print(n.getKey()+" ");
			inorder(n.getRight());
		}
	}
	public void postorder(Node n) {
		if(n != null) {
			postorder(n.getLeft());
			postorder(n.getRight());
			System.out.print(n.getKey()+" ");
		}
	}
	public void levelorder(Node n) {
		Queue<Node> q = new LinkedList<>();
		Node t;
		q.add(n);
		while(!q.isEmpty()) {
			t = q.remove();
			System.out.print(t.getKey()+" ");
			if(t.getLeft() != null)
				q.add(t.getLeft());
			if(t.getRight() != null)
				q.add(t.getRight());
		}
	}
	public int size(Node n) {
		if(n==null)
			return 0;
		else
			return 1+size(n.getLeft())+size(n.getRight());
	}
	public int height(Node n) {
		if(n == null)
			return 0;
		else
			return 1+Math.max(height(n.getLeft()), height(n.getRight()));
	}
	public static boolean isEqual(Node n, Node m) {
		if(n == null || m == null)
			return n == m;
		if(n.getKey().compareTo(m.getKey()) != 0)	//?!?!
			return false;
		return isEqual(n.getLeft(), m.getLeft()) && isEqual(n.getRight(), m.getRight());			
	}
	public void creatNode(Node n, Key k, Key lt, Key rt) {	// 객체형 트리 노드 생성
		if(n == null) return;
		
		if((int)n.getKey() == (int)k) {		//중복 값 없다고 가정함 key==value 이기 때문에 조심
			if(lt!=null)	//자식노드 가비지값 방지
				n.setLeft(new Node(lt,null,null));
			if(rt!=null)
				n.setRight(new Node(rt, null, null));
		}
		else {	//k값 탐색
			creatNode(n.getLeft(), k, lt, rt);
			creatNode(n.getRight(), k, lt, rt);
		}
	}
	public void creatNode(Node n, int k, int lt, int rt) {	//int형 트리 노드 생성
		if(n == null) return;
		
		if((int)n.getKey() == k) {		//중복 값 없다고 가정함 key==value 이기 때문에 조심
			if(lt!=0)	//자식노드 가비지값 방지
				n.setLeft(new Node(lt,null,null));
			if(rt!=0)
				n.setRight(new Node(rt, null, null));
		}
		else {	//k값 탐색
			creatNode(n.getLeft(), k, lt, rt);
			creatNode(n.getRight(), k, lt, rt);
		}
	}
	public int[] btree2intarr() {
		int arr[] = new int[(int)Math.pow(2, height(root))];
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		Node t;
		for(int i = 1; i <= size(root); i++) {
			t = q.remove();
			arr[i] = (int)t.getKey();
			if(t.getLeft() != null)
				q.add(t.getLeft());
			if(t.getRight() != null)
				q.add(t.getRight());
		}
		return arr;
	}
	public void intarr2btree(int[] arr) {
		setRoot(new Node(arr[1],null,null));	//루트 초기화
		int[] treeArr = new int[arr.length*2];	//(높이)n-1개 까지는 반복문 + n레밸 반복문 하면 되지만 귀찮 -> 배열 2배 한번에 다 접근
		for(int i = 0; i < arr.length; i++)
			treeArr[i] = arr[i];
		
		for(int i = 1; i < treeArr.length/2; i++) {
			if(treeArr[i] == 0)	//0은 null취급 => int 배열이기 때문
				continue;
			else 
				creatNode(root,treeArr[i],treeArr[i*2],treeArr[i*2+1]);
		}
	}
	public LinkedList<Node> subTreeCompare(BinaryTree t) {
		LinkedList<Node> arr = new LinkedList<>();
		Queue<Node> q1 = new LinkedList<>();
		Queue<Node> q2 = new LinkedList<>();
		Node n1;
		Node n2;
		q2.add(t.getRoot());

		
		for(int i = 0; i< t.size(t.root);i++) {
			n2 = q2.remove();
			q1.add(root);
			for(int j = 0; j < size(root); j++) {
				n1 = q1.remove();
				if(isEqual(n1, n2))
					arr.add(n1);
				if(n1.getLeft()!=null)
					q1.add(n1.getLeft());
				if(n1.getRight()!=null)
					q1.add(n1.getRight());
			}
			if(n2.getLeft()!=null)
				q2.add(n2.getLeft());
			if(n2.getRight()!=null)
				q2.add(n2.getRight());
		}
		return arr;
	}
}
