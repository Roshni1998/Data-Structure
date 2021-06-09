package com.DataStructure;

public class MyLinkedList {
	/*
	 * Linked List consist of a head and a tail. Create a linked list of INode.
	 */
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	// Add a node at the front
	public void add(INode newNode) {
		/*
		 * head and tail both pointing to 1st node(70) Add 2nd node(30) to 1st node(70)
		 * at front.
		 */
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			INode tempNode = this.head; // tempNode is going to be head.
			this.head = newNode; // head points to newNode.
			this.head.setNext(tempNode); // 2nd node pointing to 1st.
		}
	}

	// Add a node at the end
	public void append(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			/*
			 * The current tail (56) next is pointing to the next new node. Now tail is
			 * pointing to the new node (30).
			 */
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	// Insert a node between 2 nodes
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}	

	// Pop-out the 1st node(56)
	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	

	// Print the node
	public void printMyNode() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			myNodes.append(" -> ");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

}
