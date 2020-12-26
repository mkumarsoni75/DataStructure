package com.datastructure.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoublyLinkedListTest {
	@Test
	  public void testEmptyLinkedList() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
	    assertTrue(list.isEmpty());
	  }
	@Test
	public void testSizeLinkedList(){
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		int[] data = {1,2,3,4,5,6};
		for(int i : data) list.addLast(i);
		assertEquals(list.size(), 6);
		list.addLast(40);
		assertEquals(list.size(), 7);
		
	}
	@Test
	public void testPeekFirst(){
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		int[] data = {1,2,3,4,5,6};
		for(int i : data) list.addFirst(i);
		assertEquals(list.peekFirst().intValue(),6);
	}
	@Test
	public void testPeekLast(){
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		int[] data = {1,2,3,4,5,6};
		for(int i : data) list.addLast(i);
		assertEquals(list.peekFirst().intValue(),1);
	}
}
