package week10;

import java.util.*;

public class BST <Key extends Comparable<Key>,Value> {
	public Node root;
	public BST(Key k, Value v) {
		root = new Node(k,v);
	}
	public BST() {
		root = null;
	}
	public Node getRoot() { return root; }
	public void setRoot(Node nr) { root = nr; }
	public Value get(Key k) { return get(root, k); }
	public Value get(Node n, Key k) {
		if (n == null) return null;
		int t = n.getKey().compareTo(k);
		if (t > 0) return get(n.getLeft(), k);
		else if (t < 0) return get(n.getRight(),k);
		else return (Value) n.getValue();
	}
	public void put(Key k, Value v) { root = put(root, k, v); }
	public Node put(Node n, Key k, Value v) {
		if (n == null) return new Node(k,v);
		int t = n.getKey().compareTo(k);
		if (t > 0) n.setLeft(put(n.getLeft(), k, v));
		else if (t < 0) n.setRight(put(n.getRight(), k, v));
		else n.setValue(v);
		return n;
	}
	public Key min() {
		if (root == null) return null;
		return (Key) min(root).getKey();
	}
	public Node min(Node n) {
		if (n.getLeft() == null) return n;
		return min(n.getLeft());
	}
	public void deleteMin() {
		if(root == null) System.out.println("empty 트리!");
		else root = deleteMin(root);
	}
	public Node deleteMin(Node n) {
		if(n.getLeft() == null) return n.getRight();
		n.setLeft(deleteMin(n.getLeft()));
		return n;
	}
	public void delete(Key k) {
		root = delete(root, k);
	}
	public Node delete(Node n, Key k) {
		if(n == null) return null;
		int t = n.getKey().compareTo(k);
		if( t > 0 ) 		n.setLeft(delete(n.getLeft(), k));
		else if( t < 0 ) 	n.setRight(delete(n.getRight(),k));
		else {
			if(n.getRight() == null) return n.getLeft();
			if(n.getLeft() == null) return n.getRight();
			Node target = n;
			n = min(target.getRight());
			n.setRight(deleteMin(target.getRight()));
			n.setLeft(target.getLeft());
		}
		return n;
	}
	public void inorder(Node n) {
		if(n != null) {
			inorder(n.getLeft());
			System.out.print(n.getKey()+" ");
			inorder(n.getRight());
		}
	}
	public void print() {
		inorder(root);
		System.out.println();
	}
	public void deleteMax() {
		if(root == null) System.out.println("empty 트리!");
		else root = deleteMax(root);
	}
	public Node deleteMax(Node n) {
		if( n.getRight() == null ) return n.getLeft();
		n.setRight(deleteMax(n.getRight()));
		return n;
	}
	public Key kthSmallest(int k) {
		LinkedList<Node> arr = slicing(root, new LinkedList<Node>(), k);
		System.out.println();
		return (Key)arr.get(k).getKey();
	}
	public LinkedList<Node> slicing(Node n, LinkedList<Node> arr, int k) {
		if(n != null && arr.size() <= k) {
			slicing(n.getLeft(), arr, k);
			arr.add(n);
			slicing(n.getRight(), arr, k);
		}
		return arr;
	}
	public ArrayList<Node> getArr(Node n, ArrayList<Node> arr) {
		if(n != null) {
			getArr(n.getLeft(), arr);
			arr.add(n);
			getArr(n.getRight(), arr);
		}
		return arr;
	}
	public boolean checkBST() {
		ArrayList<Node> arr = getArr(root, new ArrayList<Node>());
		for(int i = 0; i<arr.size()-1; i++) {
			int a = arr.get(i).getKey().compareTo(arr.get(i+1).getKey());
			if( a > 0) return false;
		}
		return true;
	}
}
