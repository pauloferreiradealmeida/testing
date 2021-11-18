package enthuware.tough;

import java.util.List;
import java.util.Stack;
import java.util.function.Predicate;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import enthuware.tough.p2.Donkey;

public class Tough_Test {

	static int x = 10;

	public static void main(String[] args) {
/*
		new Tough_Test().test_II_1();
		new Tough_Test().test_II_2();
		new Tough_Test().test_II_3();
		new Tough_Test().test_V_1();
		new Tough_Test().test_V_2();
		new Tough_Test().test_V_3();
		new Tough_Test().test_V_4();
		new Tough_Test().test_V_5();
		new Tough_Test().test_V_6();
		new Tough_Test().test_V_7();
		new Tough_Test().test_V_8();
		new Tough_Test().test_V_9();
		new Tough_Test().test_V_10();
		new Tough_Test().test_V_11();
		new Tough_Test().test_V_12();
		new Tough_Test().test_V_13();
		new Tough_Test().test_V_14();
		new Tough_Test().test_V_15();//loop for
		new Tough_Test().test_V_16();//loop for
		new Tough_Test().test_V_17();//value in instance
		new Tough_Test().test_V_18();//crazy in break loop
		new Tough_Test().test_V_19();//Stack
		new Tough_Test().test_V_20();//Extends
		test_V_21();//Initialize variable TODO static
		new Tough_Test().test_V_22();//String's
		new Tough_Test().test_V_23();//Predicate
		new Tough_Test().test_V_24();//object number*/
		new Tough_Test().test_V_25();//lambda expression 

	}

	static void test() {
		x = 0;
	}
	
	private void test_II_1() {
		System.out.println("test_II_1");
		char i;
		LOOP: for (i = 0; i < 5; i++) {
			switch(i++) {
				case '0': 
					System.out.print("A ");
				case 1:
					System.out.print("B ");
					break LOOP;
				case 2:
					System.out.print("C ");
					break;
				case 3:
					System.out.print("D ");
					break;
				case 4:
					System.out.print("E ");
				case 'E':
					System.out.print("F ");
			}
		}
		System.out.println();
	}

	private void test_II_2() {
		System.out.println("\ntest_II_2");
		boolean b1 = false;
		boolean b2 = false;

		if (b2 != (b1 = !b2)) {
			System.out.println("true " + b1);
		} else {
			System.out.println("false " + b1);
		}
		
	}

	private void test_II_3() {
		System.out.println("\ntest_II_3");
		String s = null;
		System.out.println(null + s);
		System.out.println(false + s);
	}

	private void test_V_1() {
		System.out.println("\ntest_V_1");
		int cont = 0;

		System.out.println("loop I");
		for (;;) {
			System.out.print(cont + "-" + Math.random() + " ");
			cont++;
			if (cont > 5) break;
		}
		
		System.out.println("\nloop II");
		for (cont = 0;;cont++, cont--, System.out.print(" : " + Math.random() + " : ")) {
			System.out.print(cont);
			cont++;
			if (cont > 5) break;
		}

		System.out.println("\nloop III");
		System.out.println();
		int j = 5;
		int i = 0;
		for (i = 0, j += 5; i < j; i++) {
			System.out.print(" - " + cont + " " + j);
			cont++;
		}

		System.out.println();
	}

	private void test_V_2() {
		System.out.println("\ntest_V_2");

		int INT1 = 0, INT2 = 5;

		System.out.print("## - ");
		for (int i = INT1; i < INT2; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\n1º - ");
		for (int i = INT1; i < INT2; System.out.print(++i + " "));
			//System.out.print(" ");

		System.out.print("\n2º - ");
		for (int i = INT1; i++ < INT2; System.out.print(i + " "));

		System.out.print("\n3º - ");
		int i = INT1;
		while (i++ < INT2) {
			System.out.print(i + " ");
		};
		
		System.out.print("\n4º - ");
		i = INT1;
		do {
			System.out.print(i + " ");
		} while (i++ < INT2);

		System.out.println();
	}

	private void test_V_3() {
		System.out.println("\ntest_V_3");

		int INT1 = 1, INT2 = 3;
		for (int i = INT1; i < INT2; i++, System.out.print(i + " "));

		System.out.println();
		for (int i = INT1; i < INT2; System.out.print(++i + " "));

		System.out.println();
		for (int i = INT1; i++ < INT2; System.out.print(i + " "));

		System.out.println();
		int i = INT1;
		while (i++ < INT2) {System.out.print(i + " ");}

		System.out.println();
		i = INT1;
		do{ System.out.print(i + " "); }while (i++ < INT2);
	}

	private void test_V_4() {
		System.out.println("\n\ntest_V_4");

		int int_1 = 1, int_2 = 10;
		//System.out.println(int_1++ + " > " + --int_2);
		System.out.println(int_1 + " > " + int_2);
		do {
			if (int_1++ > --int_2) continue;
		} while (int_1 < 5);

		System.out.println(int_1 + " > " + int_2);
	}

	private void test_V_5() {
		System.out.println("\n\ntest_V_5");
		//int i = 0;
		for (int i = 0; i < 5; i++) {System.out.print(i + " ");}

		boolean a = false;
		boolean b = false;
		boolean c = false;
		//if (a != b = !c) {System.out.print(a + " " + b + " " + b);};
		if (a != (b = !c)) {System.out.println(a + " " + b + " " + b);};
		if (a = b = !c) {System.out.println(a + " " + b + " " + b);};

		
	}
	
	char a;
	private void test_V_6() {
		System.out.println("\n\ntest_V_6");
		
		Donkey donkeyI = new Donkey();
		Donkey donkeyII = new Donkey();
		
		setDonkey(donkeyI, donkeyII);
		System.out.println("donkeyI " + donkeyI.location + " - donkeyII " + donkeyII.location);
		System.out.println("char: a = " + a + " - char: (int)a = " + (int)a);
	}
	private void setDonkey(Donkey donkeyI, Donkey donkeyII) {
		donkeyI.location = 10;
		donkeyII = donkeyI;
		System.out.println("donkeyI " + donkeyI.location + " - donkeyII " + donkeyII.location);
	}

	class Holder{
		int value = 1;
		Holder link;
		public Holder(int val) {this.value = val;}
	}
	private void test_V_7() {
		System.out.println("\n\ntest_V_7");
		
		final Holder a = new Holder(5);
		Holder b = new Holder(10);
		a.link = b;
		b.link = setIt(a, b);
		System.out.println("a: " + a.link + " - b: " + b.link);
	}
	private static Holder setIt(final Holder x, final Holder y) {
		x.link = y.link;
		return x;
	}

	private void test_V_8() {
		System.out.println("\n\ntest_V_8");

		C c = new C();
		c.mlC();
		((A)c).mlA();
	}
	
	class Speek {private int i = 10;}
	class GoodSpeek extends Speek implements Tone{
		public int i = 20;
		public void up() {
			System.out.println("UP UP UP");
		}
	}
	interface Tone{
		void up();
	}
	private void test_V_9() {
		System.out.println("\n\ntest_V_9");
		Speek s = new GoodSpeek();
		//s.up(); //Speek não tem up()
		((GoodSpeek)s).up();
		System.out.println("s.i " + s.i);
	}

	private void test_V_10() {
		System.out.println("\n\ntest_V_10");
		A a = new A();
		A b = new C();
		
		System.out.println("b.i " + ((B)b).i);
		System.out.println("a.getI " + a.getI());
	}	

	private void test_V_11() {
		System.out.println("\n\ntest_V_11");
		
		A a = new A();
		System.out.println("a is Object " + (a instanceof Object));
		
		Short k = new Short((short)9);
		System.out.println("k is Short " + (k instanceof Short));
	}

	private void test_V_12() {
		System.out.println("\n\ntest_V_12");
		
		String hello = "Hello", hel = "Hel", lo = "lo";
		
		System.out.println((hello == ("Hel" + lo)) + " \"Hel\" + lo");
		System.out.println((hello == (hel + "lo")) + " hel + \"lo\"");
		System.out.println((hello == (hel + lo)) + " hel + lo");
		System.out.println((hello == ("Hel" + lo).intern()) + " \"Hel\" + lo intern");
	}

	private void test_V_13() {
		System.out.println("\n\ntest_V_13");
		
		List s1 = new ArrayList();
		s1.add("a");s1.add("b");
		s1.add(1, "c");
		
		System.out.println("s1 " + s1);
		
		List s2 = new ArrayList(s1.subList(1, 2));
		System.out.println("s2 " + s2);
		
		s1.addAll(s2);
		System.out.println("s1 " + s1);
		
		System.out.println("\"1234\".replace('1', '9' : " + "1234".replace('1', '9'));
		System.out.println("\"hello\".compareTo(\"Hello\") : " + "hello".compareTo("Hello"));
		System.out.println("\"Hello\".compareTo(\"hello\") : " + "Hello".compareTo("hello"));
		System.out.println("\"Hello\".compareTo(\"Hello\") : " + "Hello".compareTo("Hello"));
		System.out.println("\"Hel\".compareTo(\"Hello\") : " + "Hel".compareTo("Hello"));
		System.out.println("\"12345\".charAt(4) : " + "12345".charAt(4));
		System.out.println("\"12345\".intern() : " + "12345".intern());

		StringBuilder sb = new StringBuilder("123456789");
		System.out.println(sb); sb.setLength(5); System.out.println(sb); sb.setLength(10); System.out.println(sb);
		for (byte a : sb.toString().getBytes()) {
			System.out.print((char)a + " - ");
		}
	}

	private void test_V_14() {
		System.out.println("\n\ntest_V_14");
		
		try {
			AX aX = new AX();
			System.out.println("aX.x[0] : " + aX.x[0]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	private void test_V_15() {
		System.out.println("\n\ntest_V_15");
		int x = 0;
		A: for (int i = 0; i < 2; i++) {
			System.out.println("A " + i);
			
			B: for (int b = 0; b < 2; b++) {
				System.out.println("B " + b);
				
				C: for (int c = 0; c < 3; c++) {
					x++;
					System.out.println("C " + c + " - x " + x);
					if (c > b) break;
				}
			}
		}
		System.out.println("x : " + x);

		System.out.println("StringBuilder : " + new StringBuilder("world").append(" - hello ", 0, 6));
		System.out.println("StringBuilder : " + new StringBuilder("world").insert(0, " - hello ", 3, 9));
		System.out.println("StringBuilder : " + new StringBuilder("hello world").reverse());
		
		int a = 0, b = 0;
		for (; a < 1; a++, ++b) {
			System.out.println("a = " + a + " - b = " + b);
		}
		System.out.println("a = " + a + " - b = " + b);

	
		System.out.print("StringBuilder : ");
		String s = "blooper";
		System.out.print(s);
		StringBuilder sb = new StringBuilder(s);
		System.out.print(" " + sb + " + " + s.substring(4));
		sb.append(s.substring(4));
		System.out.print(" " + sb);
		sb.delete(3, 5);
		System.out.println(" : " + sb);
	}

	private void test_V_16() {
		System.out.println("\n\ntest_V_16");
		int x = 12345678;
		float y = x;
		System.out.println(x - (int)y);

		loop:{
		try
		{
			int a = 10/0;
			System.out.println(a); 
			break loop;
		} catch (ArithmeticException e) {
			System.out.println("Divisão por zero - trouxa");
		} finally {
			System.out.println("finally " + 5%3);
		}}
		
		Integer i1 = 1;
		Byte b1 = i1.byteValue();
		System.out.println(b1.equals(b1));
	}

	class AA {
		AA(){
			print();
		}
		
		void print() {
			System.out.print("AA ");
		}
	}
	class BB extends AA {
		int i = 4;
		void print() {
			System.out.print(i + " ");
		}
	}
	private void test_V_17() {
		System.out.println("\n\ntest_V_17");
		AA aa = new BB();
		aa.print();
	}

	private void test_V_18() {
		System.out.println("\n\ntest_V_18");
		int i = 0;
		
		loop:{
			System.out.println("Loop Lable line");
			try {
				for ( ; true ; i++) {
					if (i > 1) break loop;
					System.out.print(false);
				}
			} catch (Exception e) {
				System.out.println("Exception " + e);
			} finally {
				System.out.println("In Finally");
			}
		}
		
		Integer i1 = 1;
		Long l1 = 1l;
		Byte b1 = 1;
		Short s1 = 1; if (s1.equals(i1)) {
			System.out.println("s1.equals(s1)");
		} else {
			System.out.println("no s1.equals(s1)");
		}
	}
	
	class Vo1 {
		private int x;

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

	}
	private void processStacks(Stack x1, Stack x2) {
		x1.push(new Integer(100));
		x2 = x1;
		System.out.println(x1 == x2);
		x2.push(new Integer(200));
		x2 = (Stack)x1.clone();
		x2.push(new Integer(200));
	}
	private void processVo(Vo1 vo1, Vo1 vo2) {
		vo1.setX(100);
		vo2 = vo1;
		System.out.println(vo1 == vo2);
	}
	private void test_V_19() {
		System.out.println("\n\ntest_V_19");
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		
		processStacks(s1, s2);
		System.out.println(s1 + " " + s2);
		System.out.println(s1 == s2);

		Vo1 vo1 = new Vo1();
		Vo1 vo2 = new Vo1();
		processVo(vo1, vo2);
		System.out.println(vo1 == vo2);
		System.out.println(vo1.getX() + " " + vo2.getX());
		
		Short k = 9; Integer i = 9; System.out.println(k.equals(i));
		Short k2 = new Short((short)9);
		System.out.println(k instanceof Short);

		int a = Integer.MIN_VALUE;
		int b = a; --a;
		System.out.println(a + " " + b);
		
		StringBuilder b1 = new StringBuilder("snorkler");
		StringBuilder b2 = new StringBuilder("yoodler");

		b1.append(b2.substring(2, 5).toUpperCase());
		System.out.println(b1 + " - " + b2);

		b1 = new StringBuilder("snorkler");
		b2 = new StringBuilder("yoodler");
		b2.insert(3, b1.append("a"));
		System.out.println(b1 + " - " + b2);
		
		b1 = new StringBuilder("snorkler");
		b2 = new StringBuilder("yoodler");
		b1.replace(3, 4, b2.substring(4)).append(b2.append(false));
		System.out.println(b1 + " - " + b2);
		
		String str1 = "a", str2 = "b";
		System.out.println("str1 " + str1 + " : str1.equals(str1 = str2)  " + str1.equals(str1 = str2));
		System.out.println("str1 " + str1);
	}

	private void methodo(Object o) {
		System.out.println("methodo Object");
	}
	private void methodo(FileNotFoundException o) {
		System.out.println("methodo FileNotFoundException");
	}
	private void methodo(IOException o) {
		System.out.println("methodo IOException");
	}
	private void methodo1() {
	}
	private String methodo2() { return null;}
	private void test_V_20() {
		System.out.println("\n\ntest_V_20");

		Object o = null;
		IOException ioe = null;
		Exception exp = null;
		methodo(o);
		methodo(ioe);
		methodo(exp);
		methodo(null);

		int i = 10;
		System.out.println(methodo2());//i<20 ? methodo1() : methodo2());
		
		A a = new A();
		A1 a1 = new A1();
		A2 a2 = new A2();
		//A1 aa = new A();

		a = a1;
		a = a2;
		//a1 = (A1)a;
		a2 = (A2)a;

		byte b = 0; b--;
		char c = 'a';
		System.out.println("char 0 " + c);
		c += 2;
		System.out.println("char + 2 " + c);
		
		i = c;
		final String test = "test";
		System.out.println("int " + i + " " + test);

		int[] arrayInt = {1, 2, 3};
		int length = arrayInt.length;
	}

	public static final int xxx = 0;
	private static void probe(int... xx) {
		System.out.println("probe(int... " + xx);
	}
	private static void probe(Integer xx) {
		System.out.println("probe(Integer " + xx);
	}
	private static void probe(long xx) {
		System.out.println("probe(long " + xx);
	}
	private static void probe(Long xx) {
		System.out.println("probe(Long " + xx);
	}
	private static void test_V_21() {
		System.out.println("\n\ntest_V_21");
		String var;
		switch(x) {
		case 2:
		case 4:
			default:
				var = "Initialized";
		}

		System.out.println(var);
		/*
		for(;;) {
			if (Math.random() < 0.5) break;
		}*/
		
		Tough_Test tough_Test = null;
		System.out.println("tough_Test is null " + (tough_Test == null) + " tough_Test.x " + tough_Test.x);
		
		probe(x);
		probe(new Integer(x));
		probe((long)x);
		
		byte b = -128;
		final int i = 1;
		char c = 0;
		b= i;

		int a = Integer.MIN_VALUE;
		System.out.println("a = " + a);
		int aa = -a;
		System.out.println("a = " + a + " - aa = " + aa);

		switch(x) {

		}
	}

	private void test_V_22() {
		System.out.println("\n\ntest_V_22");

		StringBuilder sb1 = new StringBuilder("snorkler");
		StringBuilder sb2 = new StringBuilder("yoodler");
		sb1.append(sb2.substring(2, 5).toUpperCase());
		System.out.println(sb1 + " - " + sb2);

		sb1 = new StringBuilder("snorkler");
		sb2 = new StringBuilder("yoodler");
		sb2.insert(3, sb1.append("a"));
		System.out.println(sb1 + " - " + sb2);

		sb1 = new StringBuilder("snorkler");
		sb2 = new StringBuilder("yoodler");
		sb1.replace(3, 4, sb2.substring(4)).append(sb2.append(false));
		System.out.println(sb1 + " - " + sb2);

		sb1 = new StringBuilder("012345");
		System.out.println(sb1 + " - sb1.substring(3) " + sb1.substring(3));
		System.out.println(sb1 + " - sb1.replace(3, 3, \"99\") " + sb1.replace(3, 3, "99"));
		sb1 = new StringBuilder("012345");
		System.out.println(sb1 + " - sb1.replace(3, 4, \"99\") " + sb1.replace(3, 4, "99"));
		

		char c = 'a';
		Integer i = 9;
		int ii = 9;
		c *= i;
		c += ii;
		ii = c;

	}

	private final int TESTE = 0;
	private void filter(List<Integer> list, Predicate<Integer> p) {
		Iterator<Integer> i = list.iterator();
		while(i.hasNext()) {
			if (p.test(i.next())) i.remove();
		}
	}
	private void test_V_23() {
		System.out.println("\n\ntest_V_23");

		List<Integer> list = new ArrayList<Integer>();
		Integer i = 1; list.add(i);
		list.add(2);
		list.add(3);
		
		filter(list, ii -> ii % 2 == 0);

		System.out.println(list);
	}

	private void testInt(Integer a, int b) {
		b++;
		a++;

		System.out.println("a = " + a + " & b = " + b);
	}
	private void testParm(int parm) {
		try {
			if (parm == 0) return;
			else throw new Exception("Some");
		} catch (Exception e) {
			System.out.println("Exception in Main");
		} finally {
			System.out.println("The end");
		}
	}
	private void test_V_24() {
		System.out.println("\n\ntest_V_24");

		Integer a = new Integer(5);
		int b = 9;
		
		testInt(a++, ++b);
		System.out.println("a = " + a + " & b = " + b);
		
		testInt(a, b);
		System.out.println("a = " + a + " & b = " + b);

		testParm(0); testParm(1);
	}

	private interface Runner {
		public void run();
	}
	private void run(Runner x) {
		x.run();
	}
	private void voidMethod() {
		System.out.println("in voidMethod");
	}
	private int intMethod() {
		System.out.println("in intMethod");
		return 0;
	}
	private void test_V_25() {
		System.out.println("\n\ntest_V_25");
		
		run(() -> voidMethod());
		run(() -> intMethod() );
		run(() -> System.out.println(intMethod()));
		run(() -> {System.out.println(intMethod());});
		run(() -> {System.out.println(intMethod()); return;});
		run(() -> System.out.println("nothing..") );
		run(() -> {System.out.println("nothing..");} );
		run(() -> {System.out.println("nothing.."); return;} );
		run(() -> {System.out.println("nothing.."); System.out.println("nothing..");} );
		
		
	}

}
