package week10;

public class Node<Key extends Comparable<Key>, Value> {
	private Key id;
	private Value name;
	private Node left, right;
	public Node(Key newKey, Value newValue) {
		id = newKey;
		name = newValue;
		left = null;
		right = null;
	}
	public Key getKey() { return id; }
	public Value getValue() { return name; }
	public Node getLeft() { return left; }
	public Node getRight() { return right; }
	public void	setKey(Key ni) { id = ni; }
	public void	setValue(Value nv) { name = nv; }
	public void	setLeft(Node nl) { left = nl; }
	public void	setRight(Node nr) { right = nr; }
}	
