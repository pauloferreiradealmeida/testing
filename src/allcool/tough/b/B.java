package allcool.tough.b;

import allcool.tough.a.*;
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
