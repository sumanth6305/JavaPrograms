class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		Node left=null;
		Node right = null;
	}
}
class NodeDemo{
	public static void main(String args[]){
		Node root = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);
		Node third = new Node(4);
		Node fourth = new Node(5);
		root.left = first;
		root.right=second;
		first.left=third;
		first.right= fourth;
		System.out.println(first.data);
		System.out.println(second.data);
		System.out.println(third.data);
		System.out.println(fourth.data);
		System.out.println(root.left.data);
	}
}	
