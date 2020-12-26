package com.datastructure.linkedlist;

import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T> {
	private int size;
	private Node<T> head = null;
	private Node<T> tail = null;
	
	
	//node class
	private class Node<T>{
		T data;
		Node<T> prev, next;
		public Node(T data, Node<T> prev, Node<T> next){
			this.data = data;
			this.prev = prev;
			this.next = next;
		}
	}
	
	public void clear(){
		Node<T> trav = head;
		while(trav != null){
			Node<T> next = trav.next;
			trav.prev = trav.next = null;
			trav.data = null;
			trav = next;
		}
		head = tail = null;
		size =0;
	}
	
	public int size(){return size;}
	public boolean isEmpty(){ return size() == 0; }
	
	public void addLast(T data){
		if(isEmpty()){
			head = new Node<T>(data,null,null);
			tail = head;
		}
		else{
			tail.next = new Node<T>(data,tail,null);
			tail = tail.next;
		}
		size++;	
	}
	public void addFirst(T data){
		if(isEmpty()){
			head = new Node<T>(data,null,null);
			tail = head;
		}else{
			head.prev = new Node<T>(data,null,head);
			head = head.prev;
					}
		size++;
	}
	

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator(){

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	}

}
