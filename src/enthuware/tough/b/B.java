package enthuware.tough.b;

import enthuware.tough.a.*;
public class B extends A{
	B(){
		super();
		print();
	}

	public void print() {
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		new B();
	}
}
