//time complexity is O(n)
///////////
public class BinaryTree {

	static Node root;
	
	public BinaryTree(int item)
	{
		root = new Node(item);
	}
	
	public BinaryTree()
	{
		root = null;
	}
	
	//post order depth first = 45231
	void postOrder(Node node)
	{
		if(node==null)
			return;
		
		postOrder(node.left);
		postOrder(node.right);
		//postOrder(root);
		
		System.out.println("Data ="  +node.data);
		
	}
	
	//preoder depth first search = 12453
	void preOrder(Node node)
	{
		if(node == null)
			return;
		
		System.out.println(node.data);
		preOrder(node.left);
		preOrder(node.right);
		
	}
	
	//in order depth first = 42513
	void inOrder(Node node)
	{
		if(node == null)
		return;
		
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
	}
	
	Node mirror(Node node)
	{
		//root = mirror(root);
		if(node == null)
			return node;
		
		Node left = mirror(node.left);
		Node right = mirror(node.right);
		
		node.left = right;
		node.right = left;

		System.out.println(node.data);
		return node;
	}
	
	public static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();


	//create root
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		////System.out.println("root = " +" " +tree.root.data);
		//System.out.println("treerootleft = " +" " +tree.root.left.data);
		//System.out.println("treerootright = " +" " +tree.root.right.data);
		//System.out.println("treerootleftright = " +" " +tree.root.left.right.data);
		//System.out.println("rootrightleft = " +" " +tree.root.left.left.data);
		tree.inOrder(root);
		tree.mirror(root);
		//tree.postOrder(root);
		//tree.preOrder(root);
		//tree.inOrder(root);
	}
}
