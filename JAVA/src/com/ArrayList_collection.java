package com;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_collection {
	
	//Array list concept
	//Dynamic array using collection
	//Arrayliist contaions duplicate values
	//it is not synchronized--------means slow
	//allow random access to fetcch the value on the bases of indexes.

	public static void main(String[] args) {
		
		/*
		 * ArrayList arr = new ArrayList(); arr.add(23); arr.add(323);
		 * arr.add("gabhir"); System.out.println(arr.size());
		 * System.out.println(arr.get(2));
		 * 
		 * //for printing all the values of the array using for loop for (int i = 0; i <
		 * arr.size(); i++) { System.out.println(arr.get(i)); }
		 */


Employee e= new Employee("gambhir",23,"admin");
Employee e1= new Employee("mohit",25,"IT");
Employee e2= new Employee("deep",33,"DEV");


ArrayList <Employee> arr=new ArrayList<Employee>();
arr.add(e);
arr.add(e1);
arr.add(e2);

//Iterator to traverse the value

Iterator<Employee> arr1= arr.iterator();
while(arr1.hasNext()){
	Employee emp=arr1.next();
	
	System.out.println(emp.name);
	System.out.println(emp.age);
	System.out.println(emp.dept);
	
}




}
}