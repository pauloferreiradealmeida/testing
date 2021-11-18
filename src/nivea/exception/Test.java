package nivea.exception;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		try {
			method1(3);
		}
		catch (MyException ne) {
			System.out.println("A");
		}
	}
	
	public static void method1(int x) {
		try {
			throw x > 10 ? new MyException() : new IOException();
		}
		catch (IOException ie) {
			System.out.println("I");
		}
		catch (Exception re) {
			System.out.println("B");
		}
	}
}
