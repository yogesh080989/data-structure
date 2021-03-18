package com.practice;

/*
 * i/p - 9 -> 99 -> 9 -> 99
 * o/p - 99 -> 9 -> 99 -> 9
 */

class Node{
	int data;
	Node next;
	public Node(int data) {
		super();
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}

public class SwapWithAlternateNode {
	
	private Node head = null;
	
	void  push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	void swapNode() {
		if(head == null) {
			System.out.println("Empty link list");
			return;
		}
		Node q = head;
		int i=0;
		while(q != null && q.next != null) {
			if(i==0) {
				head = q.next;
				i++;
			}
			Node temp = q.next.next;
			q.next.next = q;
			if(temp != null && temp.next != null) {
				q.next = temp.next;
			}else {
				q.next = temp;
			}
			q = temp;
		}
		display();
		
		/*Node temp2 = head;
		Node temp = head.next.next;
		temp2.next.next = head.next;
		temp2.next = temp;
		System.out.println("After swapping ");
		display();*/
		
	}
	
	void addNode(Node node) {
		if(head != null) {
			Node tempNode = head;
			while(tempNode.getNext() != null) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(node);
		}else {
			head = node;
		}
		
	}

	public static void main(String[] args) {
		SwapWithAlternateNode swapTwoConsecutive = new SwapWithAlternateNode();
	/*	swapTwoConsecutive.push(9);
		swapTwoConsecutive.push(99);
		swapTwoConsecutive.push(9);
		swapTwoConsecutive.push(99);*/
		swapTwoConsecutive.addNode(new Node(1));
		swapTwoConsecutive.addNode(new Node(2));
		swapTwoConsecutive.addNode(new Node(3));
		swapTwoConsecutive.addNode(new Node(4));
		
		swapTwoConsecutive.display();
		System.out.println("\nAfter swap");
		
		swapTwoConsecutive.swapNode();
	}

}
