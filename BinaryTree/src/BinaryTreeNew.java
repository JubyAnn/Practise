//check if two trees are mirror images & print output
// time complexity O(n)
////
 class BinaryTreeNew {
	
	//static Nodes root;
	
	//Nodes a,b;
	
	boolean mirror(Nodes a, Nodes b)
	{
		//if both trees are nu return true
		if(a == null && b==null)
			return true;
		
		//if anyone of the trees are null return false
		if(a== null || b == null)
			return false;
		
		
		//System.out.println((a.num==b.num && mirror(a.left,b.right) && mirror(a.right,b.left)));
		
		System.out.println("a=" +a.num);
		System.out.println("b=" +b.num);
		
		 /* Both non-empty, compare them recursively
        Note that in recursive calls, we pass left
        of one tree and right of other tree */
		return a.num==b.num 
				&& mirror(a.left,b.right) 
				&& mirror(a.right,b.left);
		
		
		
		
		
	}
	
	//print inorder for both trees
	public void inOrder(Nodes n)
	{
		if(n==null)
			return;
	
		inOrder(n.left);
		System.out.println(n.num);
		inOrder(n.right);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNew bt = new BinaryTreeNew();
		Nodes a = new Nodes(1);
		Nodes b = new Nodes(1);
		
		
		a.left = new Nodes(2);
		a.right = new Nodes(3);
		a.left.left = new Nodes(4);
		a.left.right = new Nodes(5);
		
		
		b.left = new Nodes(3);
		b.right = new Nodes(2);
		b.right.left = new Nodes(5);
		b.right.right = new Nodes(4);
		
		//bt.mirror(a,b);
		
		if(bt.mirror(a,b) == true)
		{
			System.out.println("Yes");
			//System.out.println("Value of Node a" +a.num);
			//System.out.println("Value of Node b" +b.num);
			
		}
		else
			System.out.println("No");
		
		bt.inOrder(a);
		bt.inOrder(b);
      
	}

}
