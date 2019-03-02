package com;


//this keyword used to initialize class variables

//super keyword is used to call parent class constructor

public class Construtor_concept {

	public Construtor_concept() {

		System.out.println("Defult connstrructor:\n");
		
	}
		public Construtor_concept(int a)
		{
			System.out.println("parameterized constructor  \n" + a);
		}
		
			public Construtor_concept(int a,int b)
			{
				System.out.println(a);
				System.out.println(b);
		
		
	}
	
	
	public static void main(String[] args) {
	Construtor_concept obj= new Construtor_concept();
	Construtor_concept obj1= new Construtor_concept(323);
	Construtor_concept obj2= new Construtor_concept(3211,3434);
		
		

	}

}
