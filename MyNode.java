package com.DataStructure;

public class MyNode<K> implements INode<K> {
	
	//the structure of node is defined 
	private K key; 
	private INode next;
	
	//Parameterized Constructor
	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key =key;
	}
	
	public INode<K> getNext() {
		return next;
	}

	@Override
	public void setNext(INode next) {
		this.next = (MyNode<K>) next;
		
	}

	
}
