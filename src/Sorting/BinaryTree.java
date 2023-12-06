
package Sorting;

class Node{
	int item;
	Node left,right;
	public Node(int key) {
		item=key;
		left=right=null;
	}
}
public class BinaryTree {
	Node root;
	BinaryTree(){
		root=null;
		}
	void inorder(Node node) {
		if(node==null)
			return;
		inorder(node.left);
		System.out.println(node.item+"->");
		inorder(node.right);
	}
	void preorder(Node node) {
		if(node==null)
			return;
		System.out.println(node.item+"->");
		preorder(node.left);
		preorder(node.right);
	}
	void postorder(Node node) {
		if(node==null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.item+"->");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryTree tree=new BinaryTree();
tree.root=new Node(1);
tree.root.left=new Node(12);
tree.root.right=new Node(9);
tree.root.left.left=new Node(5);
tree.root.left.right=new Node(6);
System.out.println("inorder traversal");
tree.inorder(tree.root);
System.out.println("preorder traversal");
tree.preorder(tree.root);
System.out.println("postorder traversal");
tree.postorder(tree.root);
	}

}
