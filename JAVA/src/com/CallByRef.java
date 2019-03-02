package com;

public class CallByRef {
	int a;
	int b;

	public void swap(CallByRef t) {
		int temp;
		temp = t.a;
		t.a = t.b;
		t.b = temp;

	}

	public static void main(String[] args) {

		CallByRef obj = new CallByRef();
		obj.a = 28;
		obj.b = 27;
		
		obj.swap(obj);
	}

    }
