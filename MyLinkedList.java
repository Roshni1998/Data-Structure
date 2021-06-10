package com.DataStructure;

public class MyLinkedList<K> {

	private Node<K> head;

	// This internal class represents Node in Linked List
	private static class Node<K> {

		private K key;
		private Node<K> next;

		// Constructor
		public Node(K key) {
			super();
			this.key = key;
			this.next = null;
		}
	}

	/**
	 * This method insert a node at given position
	 * 
	 * @param data     Node value has to insert
	 * @param position
	 */
	public void insertAtPosition(K key, int position) {

		Node<K> newNode = new Node<K>(key);
		Node<K> currentNode = head;
		for (int i = 0; i < position - 1; i++) {
			currentNode = currentNode.next;
		}
		newNode.next = currentNode.next;
		currentNode.next = newNode;
	}

	/**
	 * This method insert Node in Linked List
	 * 
	 * @param data has to insert in the List
	 */
	public void insert(K data) {
		Node<K> newNode = new Node<K>(data);
		if (head == null) {
			head = newNode;
		} else {
			Node<K> currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}

	/**
	 * Method which traverse Linked List and display all data.
	 */
	public void printMyLinkedList() {
		Node<K> currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.key + "->");
			currentNode = currentNode.next;
		}
		System.out.println(currentNode);
	}

	public static void main(String[] args) {

		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
		myLinkedList.insert(56);
		myLinkedList.insert(30);
		myLinkedList.insert(70);

		System.out.println("Original Linked List is:");
		myLinkedList.printMyLinkedList();
		System.out.println();

		int position = 2;
		int nodeKey = 40;

		System.out.println("Adding a node with Value " + nodeKey + " at position : " + position);
		myLinkedList.insertAtPosition(nodeKey, position);
		myLinkedList.printMyLinkedList();
	}
}
