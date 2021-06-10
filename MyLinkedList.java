package com.DataStructure;

public class MyLinkedList<K> {

	private Node<K> head;

	// This internal class represents Node in Linked List
	private static class Node<K> {

		private K key;
		private Node<K> next;

		public Node(K key) {
			super();
			this.key = key;
			this.next = null;
		}
	}

	/**
	 * This method takes search key as an argument and returns true if search key
	 * found else false
	 * 
	 * @param seachKey data to be searched in list
	 * @return return true if search key found else false
	 */
	public boolean contains(K seachKey) {
		if (head == null) {
			return false;
		}

		Node<K> currentNode = head;
		while (currentNode != null) {
			if (currentNode.key == seachKey) {
				return true;
			}
			currentNode = currentNode.next;
		}
		return false;
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

		MyLinkedList<Integer> linkedList = new MyLinkedList<>();
		linkedList.insert(56);
		linkedList.insert(30);
		linkedList.insert(70);

		System.out.println("Linked List is:");
		linkedList.printMyLinkedList();

		int seachKey = 30;

		if (linkedList.contains(seachKey)) {
			System.out.println(seachKey + " found in Linked List!!");
		} else {
			System.out.println(seachKey + " not found in Linked List!!");
		}

	}
}
