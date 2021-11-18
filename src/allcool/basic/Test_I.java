package allcool.basic;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import static java.lang.Integer.*;

abstract class MyClass{}
public class Test_I {
	static int test;
	final void test_I() {
		test();
	}

	final static void test() {
		System.out.println("Testing...");
		
		//double x=10, double y;
		//System.out.println[];

		PrintWriter pw = new PrintWriter(System.out);
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		System.out.println("hello " + pw.toString() + " " + osw.toString() + " : MAX_VALUE " + MAX_VALUE);

		int a=100, b, c;b=c=a;

		System.out.println("a b c " + a + " " + b + " " + c);
		
	}

	final public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("não vem null " + args);
		}
		test();
	}
	
	class Test{}
}
