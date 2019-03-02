package com;

import java.util.LinkedList;

//linked listspecial collection which stored data using 2 things 
//actual date and reference data of next node.

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("gambhir");
		ll.add("selenium");
		ll.add(13333);
		
		ll.add(62762.2182);
		System.out.println("Elements are in gven Linked List are:  ");
		
		System.out.println(ll);
		//addfirst
		
		ll.addFirst("softwrae");
		ll.addLast("Automation");
		System.out.println("after:");
		System.out.println(ll);
	//get
		
		System.out.println(ll.get(3));
	}

}
