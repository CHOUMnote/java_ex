package week9;

import java.util.LinkedList;

public class TestTree {

	public static void main(String[] args) {
		/*	
		BinaryTree<Integer> tree = new BinaryTree<>();
		tree.setRoot(new Node(100,null,null));
		tree.creatNode(tree.getRoot(),100, 200, 300);
		tree.creatNode(tree.getRoot(),200, 400, 500);
		tree.creatNode(tree.getRoot(),300, 600, 700);
		tree.creatNode(tree.getRoot(),400, 800, null);
		*/
		/*		1��
		BinaryTree<Integer> tree2 = new BinaryTree<>();
		tree2.setRoot(new Node(100,null,null));
		tree2.creatNode(tree2.getRoot(),100, 200, 300);
		tree2.creatNode(tree2.getRoot(),200, 400, 500);
		tree2.creatNode(tree2.getRoot(),300, 600, 700);
		tree2.creatNode(tree2.getRoot(),400, 800, null);
		
		System.out.println("Ʈ�� ��� �� = "+tree.size(tree.getRoot()));
		System.out.println("Ʈ�� ���� = "+tree.height(tree.getRoot()));
		System.out.print("���� ��ȸ : "); tree.preorder(tree.getRoot());
		System.out.print("\n���� ��ȸ : "); tree.inorder(tree.getRoot());
		System.out.print("\n���� ��ȸ : "); tree.postorder(tree.getRoot());
		System.out.print("\n���� ��ȸ : "); tree.levelorder(tree.getRoot());
		System.out.println("\n���ϼ� �˻� : "+tree.isEqual(tree.getRoot(), tree2.getRoot()));
		*/
		
		/* 		2-1��
		int[] arr = tree.btree2intarr();
		for(int i = 1; i <= tree.size(tree.getRoot()); i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		*/
		/* 2-2��
		BinaryTree<Integer> tnew = new BinaryTree<>();
		tnew.intarr2btree(tree.btree2intarr());
		tnew.levelorder(tnew.getRoot());
		*/
		
		/*	3��
		BinaryTree<Integer> tA = new BinaryTree<>();
		tA.setRoot(new Node(100,null,null));
		tA.creatNode(tA.getRoot(),100, 200, 300);
		tA.creatNode(tA.getRoot(),200, 400, 500);
		tA.creatNode(tA.getRoot(),300, 600, 700);
		tA.creatNode(tA.getRoot(),400, 800, null);
		
		BinaryTree<Integer> tB = new BinaryTree<>();
		tB.setRoot(new Node(1,null,null));
		tB.creatNode(tB.getRoot(),1, 2, 3);
		tB.creatNode(tB.getRoot(),2, 300, 7);
		tB.creatNode(tB.getRoot(),300, 600, 700);
		tB.creatNode(tB.getRoot(),3, 9, 70);
		
		LinkedList<Node> arr = tA.subTreeCompare(tB);
		for(int i = 0; i< arr.size(); i++) {
			System.out.println("Found a maching subtree "+(i+1)+" :");
			tA.levelorder(arr.get(i));
			System.out.println();
		}
		*/
	}
}
