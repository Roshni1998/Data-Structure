package com.DataStructure;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedBetweenTwoNodes() {

		// Creating nodes 70, 30, 56 but they are not linked together.
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		// Node added to the front
		myLinkedList.add(myFirstNode);
		// Node added to the end
		myLinkedList.append(myThirdNode);
		// Node added b/w two nodes
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNode();
		// Creating the linked list
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);

	}

}
