package com.DataStructure;

public class MyLinkedList {
	/*
	 * Linked List consist of a head and a tail. Creat a linked list of INode.
	 */
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

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
