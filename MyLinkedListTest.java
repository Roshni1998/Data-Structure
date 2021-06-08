package com.DataStructure;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {

		// Creating nodes 70, 30, 56 but they are not linked together.
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		// Node added to the front
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNode();
		// Creating the linked list
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);

	}

}
