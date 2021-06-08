package com.DataStructure;

public interface INode<K> {
	//Interface is created with the template key.
	K getKey();
	void setKey(K key);
	
	INode getNext();
	void setNext(INode next);
}
