package com.spring.example7autowire1;

public class A {
	B b;

	A() {
		System.out.println("Constructor of A");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	void print() {
		System.out.println("Hello in A");
	}
	
	void display() {
		print();
		b.print();
	}
}
