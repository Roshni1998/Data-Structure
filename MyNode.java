package com.DataStructure;

public class MyNode<K> {
	
	//the structure of node is defined 
	private K key; 
	private MyNode next;
	
	//Parameterized Constructor
	public MyNode(K key) {
		this.key = null;
		this.next = null;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}
	
}
