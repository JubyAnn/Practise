package LinkedL;

//create linked list with desired nodes and output value of nodes

public class LinkedList {  //LL and Node are separate classes and LL class contains reference of node class type
 Node head,prev;
	
	static class Node     //inner class is made static for main to access it.
	{
		int data;
		Node next, prev;
		
		Node(int d)
		{
			data = d;
			next = null;
			//prev = null;
			
		}
	}
	
	public void printll()
	{
		Node n = head;
		
		while(n!=null)
		{
			System.out.println("Output = " +n.data);
			n=n.next;
		}
	
	}
	public void insertHead()
	{
		//Allocate Node & put in data
		Node nodeh = new Node(5);
		
		//Make next of new node as head
		nodeh.next = head;
		
		//Move head to point to new Node
		head = nodeh;
		
	}
	
	public void insertBetween(Node prev, int data)
	{
		
		
		
		if(prev == null)
		{
			System.out.println("New Node to be entered is Null");
			return;
		}
		
		
		//Alocate Node and put data
		  Node nodein = new Node(data);
		
		
		
		
		//Make next of new node as next of previous node
		nodein.next = prev.next;
		
		
		//Make next of previous node as new node
		prev.next = nodein;
	}
	
	public void insertEnd(Node prev, int data)
	{
		Node nodee = new Node(data);
		if(prev.next == null)
		{
			nodee.next = null;
		    prev.next = nodee;
		}
		else
		{
			System.out.println(prev.data+ " "+  "is not the last node");
			return;
		}
	}
	
	
}
