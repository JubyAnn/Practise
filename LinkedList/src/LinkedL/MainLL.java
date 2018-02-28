package LinkedL;

import LinkedL.LinkedList.Node;

public class MainLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

LinkedList ll = new LinkedList();
		
		//Allocating three nodes dynamically.

	//ll.head= new Node(14);
		
	Node second = new Node(13);
	Node third = new Node(23);
		Node fourth = new Node(33);
		
		//Connecting the nodes so all three nodes are linked
		ll.insertHead(); // inserting node in front of head
		ll.head.next = second;
		//second.prev = ll.head;
		second.next = third;
		//third.prev = second;
		third.next = fourth;
		//fourth.prev = third;
		fourth.next=null;
		
		ll.insertBetween(second,6);//insert node in between
		//ll.insertEnd(second, 88);
		ll.insertEnd(fourth, 88);
		
		//print node data
		
	ll.printll();
	}

}
