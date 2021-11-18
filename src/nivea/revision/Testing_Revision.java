package nivea.revision;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Testing_Revision {
	
	//public static void main(int[] args) {}
	//public static void main(Object[] args) {}
	
	public static void main(String[] args) {//throws LogFileException{
		
		new Testing_Revision().teste_I();
		new Testing_Revision().teste_II();
		new Testing_Revision().teste_III();
		new Testing_Revision().teste_IV();
		new Testing_Revision().teste_V(); //extends
		new Testing_Revision().teste_VI(); //extends
		new Testing_Revision().teste_VII();
		new Testing_Revision().teste_VIII(); //array
		new Testing_Revision().teste_VIX(); //date
		new Testing_Revision().teste_38(); //extends
		new Testing_Revision().teste_39(); //garbage collection
		new Testing_Revision().teste_44(); //switch
		new Testing_Revision().teste_45(); //interface
		new Testing_Revision().teste_48(); //init
		new Testing_Revision().teste_X(); //extends
		//teste 50 //extends abstract
		new Testing_Revision().teste_51(); //pegadinha
		new Testing_Revision().teste_56(); //types num
		new Testing_Revision().teste_59(); //extends
		new Testing_Revision().teste_60(); //parse boolean
		//teste 61 //class abstract - *****
		//teste 62 //types numerico - *****
		new Testing_Revision().teste_63(); //String StringBuilder
		new Testing_Revision().teste_67(); //loop
		new Testing_Revision().teste_71(); //loop
		new Testing_Revision().teste_75(); //loop
		new Testing_Revision().teste_76(); //loop
		new Testing_Revision().teste_XI(); //loop
		new Testing_Revision().teste_XII(); //substring *****
		new Testing_Revision().teste_XIII(); //date time
		new Testing_Revision().teste_XIV(); //import *****
		new Testing_Revision().teste_XV(); //signature method *****
		new Testing_Revision().teste_XVI(); //array string *****
		new Testing_Revision().teste_96(); //date time *****
		new Testing_Revision().teste_XVII(); //array *****
		new Testing_Revision().teste_XVIII(); //array
		new Testing_Revision().teste_XVIX(); //type numeric *****
		new Testing_Revision().teste_XX(); //extends *****
		new Testing_Revision().teste_111(); //extends *****
		new Testing_Revision().teste_XXI(); //loop *****
		new Testing_Revision().teste_XXII(); //extends *****
		new Testing_Revision().teste_122(); //array predicate 
		new Testing_Revision().teste_XXIII(); //extends *****
		new Testing_Revision().teste_XXIV(); //logical
		new Testing_Revision().teste_128(); //array
		new Testing_Revision().teste_XXV(); //array *****
		new Testing_Revision().teste_133(); //extends *****
		new Testing_Revision().teste_XXVI(); //extends
		new Testing_Revision().teste_XXVII(); //loop/switch *****
		new Testing_Revision().teste_XXVIII(); //numeric sum
		new Testing_Revision().teste_XXVIX(); //loop *****
		new Testing_Revision().teste_XXX(); //throws *****
		new Testing_Revision().teste_XXXI(); //throws 
		new Testing_Revision().teste_XXXII(); //loop substring *****
		new Testing_Revision().teste_XXXIII(); //String *****
		new Testing_Revision().teste_XXXIV(); //String
		new Testing_Revision().teste_XXXV(); //String
		new Testing_Revision().teste_XXXVI(); //numeric sum
		new Testing_Revision().teste_XXXVII(); //extends
		new Testing_Revision().teste_XXXVIII(); //array *****
		new Testing_Revision().teste_XXXVIX(); //initialized variable *****
		new Testing_Revision().teste_XXXX(); //logical *****
		new Testing_Revision().teste_XXXXI(); //extends
		new Testing_Revision().teste_XXXXII(); //array *****
		new Testing_Revision().teste_XXXXIII(); //extends *****
		new Testing_Revision().teste_XXXXIV(); //array *****
		new Testing_Revision().teste_XXXXV(); //extends
		new Testing_Revision().teste_XXXXVI(); //logical numeric
		new Testing_Revision().teste_XXXXVII(); //fail numeric
		new Testing_Revision().teste_XXXXVIII(); //list array
		
		String[] parm_XXXXVIV = {"1", "null"};
		new Testing_Revision().teste_XXXXVIX(parm_XXXXVIV); //boolean *****
		
		new Testing_Revision().teste_XXXXX(); // variable static
		new Testing_Revision().teste_XXXXXI(); // variable no stanciable
		new Testing_Revision().teste_XXXXXII(); // loop while
		new Testing_Revision().teste_XXXXXIII(); // array reverse
		new Testing_Revision().teste_XXXXXIV(); // extends
		new Testing_Revision().teste_XXXXXV(); // extends *****
		new Testing_Revision().teste_XXXXXVI(); // String *****
		new Testing_Revision().teste_XXXXXVII(); // loop
		new Testing_Revision().teste_XXXXXVIII(); // loop array String
		new Testing_Revision().teste_XXXXXVIX(); // pegadinha do malandro
		new Testing_Revision().teste_XXXXXX(); // loop array
		new Testing_Revision().teste_XXXXXXI(); // array 2D representaction *****
		new Testing_Revision().teste_XXXXXXII(); // extends *****
	}
	
	private void teste_I() {
		System.out.println("teste_I");

		Predicate<Integer> p = (n) -> n % 2 == 0;
		
		int v = 101;
		System.out.println("test("+ v + ") " + p.test(v) + " - " + "negate().test(" + v + ") " + p.negate().test(v));
	}
	
	private void teste_II() {
		System.out.println("\nteste_II");

		char colorCode = 'y';
		switch(colorCode) {
		case 'r':
			int color = 1;
			break;
		case 'b':
			color = 10;
			break;
		default :
			color = 1;
		}
		
		System.out.println("compile error 'color'");
	}
	
	private void teste_III() {
		System.out.println("\nteste_III");
		String[] arr = {"Hi", "How", "Are", "You"};
		List<String> arrayList = new ArrayList<>(Arrays.asList(arr));
		System.out.println("arrayList " + arrayList + " " + arrayList.size());

		if (arrayList.removeIf(s -> {System.out.print(s + " "); return s.length() <= 2;})) {
			System.out.println(" removed");
			System.out.println(arrayList + " " + arrayList.size());
		}

		System.out.println("arrayList " + arrayList + " " + arrayList.size());
		if (arrayList.removeIf(s -> {System.out.println("s -> " + s + " " + s.length() + " - "); return s.equals("You");})) {
			System.out.println(" removed");
			System.out.println(arrayList + " " + arrayList.size());
		}

	}
	
	class LogFileException extends Exception{}//teste_IV
	class AccessViolationException extends RuntimeException{};//teste_IV
	private void teste_IV() {
		System.out.println("\nteste_IV");
		Testing_Revision obj = new Testing_Revision();
		try {
			obj.open();
			obj.process();
		}
		catch (Exception e) {
			System.out.println("Completed.");
		}
	}

	private void process() throws LogFileException {//teste_IV
		System.out.println("Processed.");
		throw new LogFileException();
	}
	
	private void open() {//teste_IV
		System.out.println("Opened.");
		throw new AccessViolationException();
	}
	
	class Vehicle {//teste_V
		String type = "4W"; int maxSpeed = 100;

		Vehicle(String type, int maxSpeed){
			this.type = type; 
			this.maxSpeed = maxSpeed;
		}
		
		Vehicle(){}
	}
	class Car extends Vehicle {//teste_V
		String trans;
		Car(String trans){
			//super();
			this.trans = trans;
		}

		Car(String type, int maxSpeed, String trans){
			super(type, maxSpeed);
			this.trans = trans;
		}
	}
	private void teste_V() {
		System.out.println("\nteste_V");
		Car c1 = new Car("Auto");
		Car c2 = new Car("4W", 150, "Manual");
		System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
		System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
	}
	
	class A {//teste_VI
		void test() {System.out.println("A");}
	}
	class B extends A {//teste_VI
		void test() {System.out.println("B");}
	}
	class C extends B {//teste_VI
		void test() {System.out.println("C");}
	}
	private void teste_VI() {
		System.out.println("\nteste_VI");
		A b1 = new A();
		A b2 = new C();
		A b3 = (B) b2;
		b1 = (A) b2;
		b1.test();
		b2.test();
		b3.test();
	}

	private void teste_VII() {
		System.out.println("\nteste_VII");
		String[] strs = new String[2];
		int idx = 0;
		try {
			for (String s : strs) {
				strs[idx].concat(" element " + idx);
				idx++;
			}
		} catch (Exception e) {
			System.out.println("teste_VII Exception " + e.getMessage());
		}
	}

	private void teste_VIII() {
		System.out.println("\nteste_VIII");
		int[] array = {10, 20, 30, 40, 50};
		int x = array.length;
		while (x > 0) {
			System.out.print(array[--x] + " ");
		}
		System.out.println();
	}

	private void teste_VIX() {
		System.out.println("\nteste_VIX");
		LocalDate date = LocalDate.of(2021, 1, 31);
		date = date.plusDays(10);
		System.out.println(date);
	}

	abstract class Animal {};
	interface Hunter {};
	class Cat extends Animal implements Hunter {};
	class Tiger extends Cat {};
	private void teste_38() {
		System.out.println("\nteste_38");
		ArrayList<Animal> animalTiger = new ArrayList<>();
		animalTiger.add(new Tiger());
		ArrayList<Hunter> hunterCat = new ArrayList<>();
		hunterCat.add(new Cat());
		ArrayList<Hunter> hunterTiger = new ArrayList<>();
		hunterTiger.add(new Tiger());

		ArrayList<Tiger> tigerCat = new ArrayList<>();
		//tigerCat.add(new Cat()); //Cat não extends de Tiger
		System.out.println("Cat não extends de Tiger");
		
		ArrayList<Animal> animalCat = new ArrayList<>();
		animalCat.add(new Cat());
	}

	class Students { 
		private int stu = 0; 
		Students(int stu) {
			this.stu = stu;
		}

		public String toString() {
			return "students " + stu;
		}
	};

	private void teste_39() {
		System.out.println("\nteste_39");
		Students s1 = new Students(1);
		Students s2 = new Students(2);
		Students s3 = new Students(3);
		
		s1 = s3;
		System.out.println(s1 + " " + s2 + " " + s3);
		
		s3 = s2;
		System.out.println(s1 + " " + s2 + " " + s3);
		
		s1 = s3;
		System.out.println(s1 + " " + s2 + " " + s3);

		s2 = s1;
		System.out.println(s1 + " " + s2 + " " + s3);
	}

	private void teste_44() {
		System.out.println("\nteste_44");
		int wd = 0;
		String days[] = {"sun", "mon", "wed", "sat"};
		for (String s : days) {
			switch (s) {
				case "sat":
				case "sun":
					wd -= 1;
					System.out.print(wd + " " + s + " : ");
				break;
				case "mon":
					wd -= 1;
					System.out.print(wd + " " + s + " : ");
				break;
				case "wed":
					wd += 2;
					System.out.print(wd + " " + s + " : ");
			}
		}
		System.out.println("wd " + wd);
	}
	
	class C2 {
		public void displayC2() {
			System.out.print("C2");
		}
	}
	interface I {
		public void displayI();
	}
	class C1 extends C2 implements I {
		public void displayI() {
			System.out.print("C1");
		}
	}
	private void teste_45() {
		System.out.println("\nteste_45");
		C2 obj1 = new C1();
		I obj2 = new C1();

		obj2.displayI(); System.out.print(" - "); obj1.displayC2();
		
		C2 s = (C2)obj2; //C2 s = obj2; //objeto C2 != C1
		I t = (I)obj1; //I t = obj1; //objeto I != C1

		System.out.println();
		t.displayI(); System.out.print(" - "); s.displayC2();
		System.out.println();
	}
	
	class FieldInit {
		Character c;
		boolean b;
		float f;
		
		void printAll() {
			System.out.println("c=" + c + " : b=" + b + " : f=" + f);
		}
	}
	private void teste_48() {
		System.out.println("\nteste_48");
		new FieldInit().printAll();
	}
	
	class Base {
		public void test() {System.out.println("Base");}
	}
	class DerivedA extends Base {
		public void test() {System.out.println("DerivedA");}
	}
	class DerivedB extends DerivedA {
		public void test() {System.out.println("DerivedB");}
	}
	private void teste_X() {
		System.out.println("\nteste_X");
		Base b1 = new DerivedB();
		Base b2 = new DerivedA();
		Base b3 = new DerivedB();
		
		b1 = (Base)b3;
		Base b4 = (DerivedA) b2;
		
		b1.test();
		b4.test();
	}
	
	interface Test_IV {
		public void test();
	}
	abstract class Planet implements Test_IV {//teste 50
		protected void revolve(){}
		abstract void rotate();
	}
	class Earth extends Planet {
		//private void revolve() {} //compile fail
		//private void rotate() {} //compile fail

		public void revolve() {} //ok
		public void rotate() {} //ok
		public void test() {};
	}
	
	class Employee {
		private String name;
		private int age;
		private int salary;

		public Employee() {}
		public Employee(String name, int age) {
			setName(name);
			setAge(age);
			setSalary(2000);
		}
		public Employee(String name, int age, int salary) {
			this(name, age);
			setSalary(salary);
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		public void printDetails() {
			System.out.println(name + " : " + age + " : " + salary);
		}
	}
	private void teste_51() {
		System.out.println("\nteste_51");
		Employee e1 = new Employee();//tem que declarar construtor vazio, pois existem outros contrutores declarados
		Employee e2 = new Employee("Jack", 50);
		Employee e3 = new Employee("Chloe", 40, 5000);
		
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}
	
	private void teste_56() {
		float flt_1 = 100.00F;
		float flt_2 = (float) 1_11.0;
		//Float flt_3 = 100.00; //faltou F no final '100.00F'
		
	}
	
	public class Acc {
		int p = 1;
		private int q = 2;
		protected int r = 3;
		public int s = 4;
	}
	class Test extends Acc {}
	private void teste_59() {
		System.out.println("\nteste_59");
		Test obj = new Test();
		obj.p = 0;
		obj.r = 0;
		obj.s = 0;
		System.out.println(obj.p + " : " + obj.r + " : " + obj.s);
	}

	private void teste_60() {
		System.out.println("\nteste_60");
		Boolean[] bool = new Boolean[2];
		bool[0] = new Boolean(Boolean.parseBoolean("true"));
		bool[1] = new Boolean(null);
		System.out.println(bool[0] + " : " + bool[1]);
	}

	abstract class Toy{//teste 61 class abstract
		int price;
		//public void static insert() {}; //static não permitido em class abstract
		final Toy getToy() { return null;} //return new Toy();} class abstract não tem contrutor
		public void printToy() {};
		public int calculatePrice() { return price;};
		public abstract int computeDiscount();
	}

	private void teste_63() {
		System.out.println("\nteste_63");
		String x = "XXXX-XXXX-XXXX-"; String card = "1234-5678-9012-3456";
		
		System.out.println(x + card.substring(15, 19));

		StringBuilder sbCard = new StringBuilder(x);
		sbCard.append(card, 15, 19);
		System.out.println(sbCard.toString());
		
		//sbCard.deleteAll(); //compile fail - deleteAll não existe
		//sbCard.delete(0, sbCard.size()); //compile fail - size não existe
		sbCard.delete(0, sbCard.length()); // ok
		//sbCard.removeAll(); // compile fail - removeAll não existe
	}
	
	private void teste_67() {
		System.out.println("\nteste_67");
		int[][] num = new int[3][1];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = 10;
			}
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
			}
		}
	}
	
	private void teste_71() {
		System.out.println("\nteste_71");
		List<String> lst = Arrays.asList("A", "B", "C", "D");
		Iterator<String> itr = lst.iterator();
		while (itr.hasNext()) {
			String e = itr.next();
			if (e == "C") {
				break;
			} else {
				//continue;
				System.out.print(e);
			}
		}
		System.out.println();
	}
	
	private void teste_75() {
		System.out.println("\nteste_75");
		int[] stack = {10, 20, 30};
		int size = 3;
		int idx = 0;
		
		do {
			idx++;
		} while (idx < size -1);
		System.out.println("The top element: " + stack[idx]);
	}
	
	private void teste_76() {
		System.out.println("\nteste_76");
		int number[];
		number = new int[2];
		number[0] = 10;
		number[1] = 20;
		number = new int[4];
		number[2] = 30;
		number[3] = 40;
		for (int x : number) {
			System.out.print(" " + x);
		}
		System.out.println();
	}
	
	private void teste_XI() {
		System.out.println("\nteste_XI");
		String names[] = {"Thomas", "Peter", "Joseph"};
		String pwd[] = new String[3];
		int idx = 0;
		try {
			for (String n : names) {
				pwd[idx] = n.substring(2, 6);
				System.out.println(pwd[idx]);
				idx++;
			}
		} catch (Exception e) {
			System.out.println("Invalid name");
		}
	}
	
	private void teste_XII() {
		System.out.println("\nteste_XII");
		String myStr = "Hello World ";
		myStr.trim();
		int i1 = myStr.indexOf(" ");
		System.out.println(i1);
	}
	
	private void teste_XIII() {
		System.out.println("\nteste_XIII");
		LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
	}
	
	private void teste_XIV() {
		System.out.println("\nteste_XIV");
		String color = nivea.revision.clothing.Shirt.getColor();
		if (color.equals("Green")) {
			System.out.println("Fit");
		}
	}
	
	private void teste_XV() {
		System.out.println("\nteste_XV");
		int numbers[] = {12, 13, 42, 32, 15};
		int[] keys = findMax(numbers);
		System.out.println(keys[0] + " " + keys[1]);
	}
	private int[] findMax(int[] numbers) {
		return new int[] {2, 3};
	}
	
	private void teste_XVI() {
		System.out.println("\nteste_XVI");
		String[][] chs = new String[5][2];
		chs[0] = new String[2];
		chs[1] = new String[5];
		int i = 97;
		
		try {
			for (int a = 0; a < chs.length; a++) {
				for (int b= 0; b < chs.length; b++) {
					chs[a][b] = "" + i;
					i++;
				}
			}
			for (String[] ca : chs) {
				for (String c : ca) {
					System.out.print(c + " ");
				}
			}
		} catch (Exception e) {
			System.out.println("ERRO " + e.getMessage());
		}
	}
	
	private void teste_96() {
		System.out.println("\nteste_96");
		try {
			String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
			System.out.println("Data " + date);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void teste_XVII() {
		System.out.println("\nteste_XVII");
		ArrayList<Integer> points = new ArrayList<>();
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		points.remove(1);
		points.remove(null);
		System.out.println(points);
	}
	
	private void teste_XVIII() {
		System.out.println("\nteste_XVIII");
		List<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		if (names.remove("Bran")){
			names.remove("Jon");
		}

		System.out.println(names);
	}
	
	private void doSum(Integer x, Integer y) {System.out.println("Integer " + (x + y));}
	private void doSum(double x, double y) {System.out.println("double " + (x + y));}
	private void doSum(float x, float y) {System.out.println("float " + (x + y));}
	private void doSum(int x, int y) {System.out.println("int " + (x + y));}
	private void teste_XVIX() {
		System.out.println("\nteste_XVIX");
		doSum(10, 20);
		doSum(10.0, 20.0);
	}
	
	class S1 {
		protected void display(int x) {System.out.println("Parent " + x);};
	}
	class S2 extends S1 {
		public void display(int x, int y) {
			this.display(x);
			display(y);
			super.display(y);
		}
		public void display(int x) {
			System.out.println("Child " + x);
		}
	}
	private void teste_XX() {
		System.out.println("\nteste_XX");
		S2 sobj = new S2();
		sobj.display(10, 100);
	}
	
	class VehicleI {
		int x;
		VehicleI(){
			this(10);
			//this(10, 20);
		}
		VehicleI(int x){this.x = x;}
		VehicleI(int x, int y){this.x = x;}
	}
	class CarI extends VehicleI{
		int y;
		CarI(){
			super();
			//this(20);
		}
		CarI(int y){
			this.y = y;
		}
	}
	private void teste_111() {
		System.out.println("\nteste_111");
		VehicleI y = new CarI();
		System.out.println("Compulation fails at in CarI -> this(20);");
	}
	
	private boolean isAvailable(int x) {
		return --x > 0 ? true : false;
	}
	private void teste_XXI() {
		System.out.println("\nteste_XXI");
		int x = 6;
		while (isAvailable(x)) {
			System.out.print(--x);
		}
		System.out.println();
	}
	
	class VehicleII {
		int x;
		VehicleII(){
			this(10);
		}
		VehicleII(int x){
			this.x = x;
		}
	}
	class CarII extends VehicleII {
		int y;
		CarII() {
			super(10);
		}
		CarII(int y) {
			super(y);
			this.y = y;
		}
		public String toString() {
			return super.x + " : " + this.y;
		}
	}
	private void teste_XXII() {
		System.out.println("\nteste_XXII");
		VehicleII y = new CarII(20);
		System.out.println(y);
	}
	
	private void teste_122() {
		System.out.println("\nteste_122");
		String[] arr = {"Hi", "How", "Are", "You"};
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));

		//if (arrayList.removeIf(s -> {System.out.print(s + " "); return s.length() <= 2;})) {// compilation fails
			//System.out.println(s + " Removed");// compilation fails
		//}

		if (arrList.removeIf(s -> {System.out.print(s); return s.length() <= 2;})) {
			System.out.println(" Removed " + arrList);
		}
	}
	
	interface Exportable {void export();}
	class Tool implements Exportable {
		//protected void export() {// compilation fails, tem que declarar public
		public void export() {
			System.out.println("Tool::export");
		}
	}
	class ReportTool extends Tool implements Exportable {
		public void export() {
			System.out.println("RTool::export");
		}
	}
	private void teste_XXIII() {
		System.out.println("\nteste_XXIII");
		Tool aTool = new ReportTool();
		Tool bTool = new Tool();
		callExport(aTool);
		callExport(bTool);
	}
	private void callExport(Exportable ex) {
		ex.export();
	}

	private void teste_XXIV() {
		System.out.println("\nteste_XXIV");
		int x = 10, y = ++x, z = 0; 
		if (y >= 10 | y <= ++x) {// | verifica as duas validações - || apenas a primeira válida
			z = x;
		} else {
			z = x++;
		}
		System.out.println(z);
	}
	
	private void teste_128() {
		System.out.println("\nteste_128");
		int array1[] = {1,2,3};
		int array2[] = new int[5];
		array2 = array1;
		for (int i : array2) {
			System.out.print(i + " ");
		}
		System.out.println();
		int array3[] = new int[3];
		array3 = array2;
		for (int i : array3) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private void teste_XXV() {
		System.out.println("\nteste_XXV");
		int n[][] = {{1, 3}, {2, 4}};
		for (int i = n.length - 1; i >= 0; i--) {
			for (int y : n[i]) {
				System.out.print(y);
			}
		}
		System.out.println();
	}
	
	class Base_I {
		public void test() {System.out.println("Base_I");}
	}
	class DerivedA_I extends Base_I {
		public void test() {System.out.println("DerivedA_I");}
	}
	class DerivedB_I extends DerivedA_I {
		public void test() {System.out.println("DerivedB_I");}
	}
	private void teste_133() {
		System.out.println("\nteste_133");
		Base_I b1 = new DerivedB_I();
		Base_I b2 = new DerivedA_I();
		Base_I b3 = new DerivedB_I();
		Base_I b4 = b3;
		b1 = (Base_I) b2;
		b1.test();
		b4.test();
	}
	
	public class Employee_I {
		public int salary;
	}
	public class Manager_I extends Employee_I {
		public int budget;
	}
	public class Director_I extends Manager_I {
		public int stockOptions;
	}
	private void teste_XXVI() {
		System.out.println("\nteste_XXVI");
		Employee_I employee = new Employee_I();
		Employee_I manager = new Manager_I();
		Employee_I director = new Director_I();
		
		employee.salary = 1;
		director.salary = 1;
		
		Director_I a = (Director_I)director;
		a.stockOptions = 1;
	}
	
	private void teste_XXVII() {
		System.out.println("\nteste_XXVII");
		int wd = 0;
		//String days[] = ("sun", "mon", "wed", "sat");//compiation fails
		String days[] = {"sun", "mon", "wed", "sat"};
		for (String s : days) {
			switch (s) {
			case "sat":
			case "sun":
				wd -= 1;
				break;
			case "mon":
				wd++;
			case "wed":
				wd += 2;
			}
		}
		System.out.println(wd);
	}

	private void doSum_I(Integer x, Integer y) {System.out.println("Integer " + (x + y));}
	private void doSum_I(double x, double y) {System.out.println("double " + (x + y));}
	private void doSum_I(float x, float y) {System.out.println("float " + (x + y));}
	//private void doSum(int x, int y) {System.out.println("int " + (x + y));}
	private void teste_XXVIII() {
		System.out.println("\nteste_XXVIII");
		doSum_I(10, 20);
		doSum_I(10.0, 20.0);
	}
	
	private void teste_XXVIX() {
		System.out.println("\nteste_XXVIX");
		int[] arr = {1, 2, 3, 4};
		int i = 0;
		try {
			do {
				System.out.print(arr[i] + " ");
				i++;
			}while (i < arr.length + 1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nArrayIndexOutOfBoundsException " + e.getMessage());
		}
	}
	
	class Test_I {
		void readCard(int cardNo) throws Exception {
			System.out.println("Reading Card");
		}
		void checkCard(int cardNo) throws RuntimeException {
			System.out.println("Checking Card");
		}
	}
	private void teste_XXX() {
		System.out.println("\nteste_XXX");
		Test_I ex = new Test_I();
		int cardNo = 12344;
		//ex.readCard(cardNo); //compilation fails
		try {
			ex.readCard(cardNo);
		} catch (Exception e) {};
		ex.checkCard(cardNo);
	}
	
	public class MyException extends RuntimeException {};
	private void method1() {
		try {
			throw Math.random() > .5 ? new MyException() : new RuntimeException();
		} catch (RuntimeException e) {
			System.out.println("B");
		}
	}
	private void teste_XXXI() {
		System.out.println("\nteste_XXXI");
		try {
			method1();
		} catch (RuntimeException e) {
			System.out.println("A");
		}
	}
	
	private void teste_XXXII() {
		System.out.println("\nteste_XXXII");
		//String names[] = ("Thomas", "Peter", "Joseph"); //compilation fails
		String names[] = {"Thomas", "Peter", "Joseph"};
		String pwd[] = new String[3];
		int idx = 0;
		try {
			for (String n : names) {
				pwd[idx] = n.substring(2, 6);
				idx++;
			}
		} catch (Exception e) {
			System.out.println("Invalid name");
		}
		for (String p : pwd) {
			System.out.println(p);
		}
	}
	
	class MyString {
		String msg;
		MyString(String msg){
			this.msg = msg;
		}
	}
	private void teste_XXXIII() {
		System.out.println("\nteste_XXXIII");
		System.out.println("Hello " + new StringBuilder("Java SE 8"));
		System.out.println("Hello " + new MyString("Java SE 8").msg);
	}
	
	private void teste_XXXIV() {
		System.out.println("\nteste_XXXIV");
		String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				if (arr[i][j] == "B") {
					break;
				}
			}
		}
		System.out.println("");
	}
	
	private void teste_XXXV() {
		System.out.println("\nteste_XXXV");
		String str = "Sweet Sweat";
		String str2 = str.trim().charAt(6) + "" + str.indexOf("Sw", 1);
		str2 += " : " + str.indexOf("t", 5);
		System.out.println(str2);
	}
	
	private void doSum_II(Integer x, Integer y) {System.out.println("Integer " + (x + y));}
	private void doSum_II(double x, double y) {System.out.println("double " + (x + y));}
	private void doSum_II(float x, float y) {System.out.println("float " + (x + y));}
	//private void doSum(int x, int y) {System.out.println("int " + (x + y));}
	private void teste_XXXVI() {
		System.out.println("\nteste_XXXVI");
		doSum_II(Integer.valueOf(10), Integer.valueOf(20));
		doSum_II(10.0, 20.0);
	}
	
	class P1{};
	class P2 extends P1 implements I1 {};
	interface I1 {};
	private void teste_XXXVII() {
		System.out.println("\nteste_XXXVII");
		P1 obj = new P1();
		P2 obj2 = new P2();
		I1 obj3 = new P2();
		boolean r1 = obj instanceof P2;
		boolean r2 = obj2 instanceof P1;
		boolean r3 = obj3 instanceof I1;
		System.out.println(r1 + " : " + r2 + " : " + r3);
	}
	
	private void teste_XXXVIII() {
		System.out.println("\nteste_XXXVIII");
		String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				if (arr[i][j].equals("B")) {
					continue;
				}
			}
			continue;
		}
		System.out.println();
	}

	private void teste_XXXVIX() {
		System.out.println("\nteste_XXXVIX");
		//int ans; //Compilation fails
		int ans = 0;
		try {
			int num = 10;
			int div = 0;
			ans = num / div;
		} catch (ArithmeticException ae) {
			ans = 1;
		} catch (Exception e) {
			System.out.println("Invalid calcularion");
		}
		System.out.println("Answer = " + ans);
	}
	
	public class CheckingAccount {
		public int amount;
		public CheckingAccount(int amount) {
			this.amount = amount;
		}
		public int getAmount() {return amount;}
		public void setAmount(int amount) {this.amount = amount;}
		public void changeAmount(int x) {amount += x;}
	}
	private void teste_XXXX() {
		System.out.println("\nteste_XXXX");
		CheckingAccount acct_I = new CheckingAccount((int)(Math.random() * 1000));
		CheckingAccount acct_II = new CheckingAccount((int)(Math.random() * 1000));
		CheckingAccount acct_III = new CheckingAccount((int)(Math.random() * 1000));
		
		System.out.println(acct_I.getAmount() + " : " + acct_II.getAmount() + " : " + acct_III.getAmount());
		
		acct_I.amount = 0;
		acct_II.setAmount(0);
		acct_III.changeAmount(-acct_III.getAmount());
		
		System.out.println(acct_I.getAmount() + " : " + acct_II.getAmount() + " : " + acct_III.getAmount());
	}
	
	interface Speakable {public void speak(String s);}
	abstract class Robot implements Speakable {
		//public void process(); //compilation fails
		public abstract void process();
	}
	class Humanoid extends Robot {
		public void speak(String s) {System.out.println(s);}
		public void process() {System.out.print("Helping... ");}
	}
	private void teste_XXXXI() {
		System.out.println("\nteste_XXXXI");
		Robot r = new Humanoid();
		r.process();
		r.speak("Done");
	}
	
	private void teste_XXXXII() {
		System.out.println("\nteste_XXXXII");
		String shirts[][] = {{"red", "blue"}, {"small", "medium"}};
		for (String[] c : shirts) {
			for (String s : c) {
				System.out.print(s + " : ");
			}
		}
		System.out.println();
	}
	
	interface Exportable_I {
		void export();
	}
	class Tool_I implements Exportable_I {
		public void export() {System.out.println("Tool_I::export");}
	}
	class ReportTool_I extends Tool_I {
		//void export() {System.out.println("RTool_I::export");}//compilation fails
		public void export() {System.out.println("RTool_I::export");}
	}
	public static void callExport(Exportable_I ex) {ex.export();}
	private void teste_XXXXIII() {
		System.out.println("\nteste_XXXXIII");
		Tool_I aTool = new ReportTool_I();
		Tool_I bTool = new Tool_I();
		callExport(aTool);
		callExport(bTool);
	}
	
	public class Planet_I {
		public String name;
		public int moons;
		
		public Planet_I(String name, int moons) {
			this.name = name;
			this.moons = moons;
		}
	}
	private void teste_XXXXIV() {
		System.out.println("\nteste_XXXXIV");
		Planet_I[] planets = {
				new Planet_I("Mercury", 0), 
				new Planet_I("Venus", 0), 
				new Planet_I("Earth", 1), 
				new Planet_I("Mars", 2)};
		System.out.println(planets);
		System.out.println(planets[2].name);
		System.out.println(planets[2].moons);
	}
	
	interface Downloadable {public void download();}
	interface Readable extends Downloadable {public void readBook();}
	abstract class Book implements Readable {
		public void  readBook() {System.out.println("Read Book");}
	}
	class EBook extends Book {
		public void readBook() {System.out.println("Read E=Book");}
		public void download() {}//compilation fails, sem metodo dowload
	}
	private void teste_XXXXV() {
		System.out.println("\nteste_XXXXV");
		Book book = new EBook();
		book.readBook();
	}
	
	private void teste_XXXXVI() {
		System.out.println("\nteste_XXXXVI");
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : x;
		System.out.println("a = " + a + " : b=" + b + " : c=" + c + " : x=" + x + " : d=" + d);
	}
	
	private void teste_XXXXVII() {
		System.out.println("\nteste_XXXXVII");
		Short s1 = 200;
		Integer s2 = 400;
		//String s3 = (String) (s1 + s2);//compile fail
		String s3 = String.valueOf(s1 + s2);
		Long s4 = (long) s1 + s2;//compile fail
		//Long s4 = (Long) s1 + s2;//compile fail
		Long s5 = Long.valueOf(s1 + s2);//compile fail
		System.out.println(s3 + " : " + s4 + " : " + s5);
	}
	
	private void teste_XXXXVIII() {
		System.out.println("\nteste_XXXXVIII");
		List<String> colors = new ArrayList<String>();
		//List colors = new ArrayList();
		try {
			colors.add("green");
			colors.add("blue");
			colors.add("red");
			colors.add("yellow");
			System.out.println("1º : " + colors);
			colors.remove(2);
			System.out.println("2º : " + colors);
			colors.add(3, "cyan");
			System.out.println("3º : " + colors);
			colors.add(5, "black");
			System.out.println("4º : " + colors);
		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}
	}

	private void teste_XXXXVIX(String[] args) {
		System.out.println("\nteste_XXXXVIX");
		boolean a = new Boolean(Boolean.valueOf(args[0]));
		boolean b = new Boolean(args[1]);
		System.out.println(a + " " + b);
	}
	
	static class Alpha {
		int ns;
		static int s;
		String test; //variavel nao inicializada aqui ok
		Alpha (int ns){
			if (s < ns) {
				s = ns;
				this.ns = ns;
			}
		}

		void doPrint() {
			//String test; //variavel nao inicializada aqui compiled fail
			System.out.println(test + "ns= " + ns + " s= " + s);
		}
	}
	private void teste_XXXXX() {
		System.out.println("\nteste_XXXXX");
		Alpha ref1 = new Alpha(100);
		Alpha ref2 = new Alpha(50);
		Alpha ref3 = new Alpha(120);
		ref1.doPrint();
		ref2.doPrint();
		ref3.doPrint();
	}
	
	class FieldInit_I {
		char c;
		boolean b;
		float f;
		
		void printAll() {
			System.out.println("c=" + c + " : b=" + b + " : f=" + f);
		}
	}
	private void teste_XXXXXI() {//repetido com teste 48
		System.out.println("\nteste_XXXXXI");
		FieldInit_I fieldInit_I = new FieldInit_I();
		fieldInit_I.printAll();
	}
	
	static class Test_II {
		static int count = 0;
		int i = 0;
		void changeCount() {
			while (i < 5) {
				i++;
				count++;
			}
		}
	}
	private void teste_XXXXXII() {
		System.out.println("\nteste_XXXXXII");
		Test_II count1 = new Test_II();
		Test_II count2 = new Test_II();
		count1.changeCount();

		System.out.println(count1.i + " " + count1.count + " " + count2.i + " " + count2.count);

		count2.changeCount();

		System.out.println(count1.i + " " + count1.count + " " + count2.i + " " + count2.count);
	}
	
	private void teste_XXXXXIII() {
		System.out.println("\nteste_XXXXXIII");
		int n[][] = {{-2, -1, 0, 1, 2}, {3, 4, 5}};
		for (int i = n.length - 1; i >=0; i--) {
			for (int j = n[i].length - 1; j >= 0; j--) {
				System.out.print(n[i][j]);
			}
		}
		System.out.println();
	}
	
	class CI {
		public CI() {System.out.println("CI");}
	}
	class BI extends CI{
		public BI() {System.out.println("BI");}
	}
	class AI extends BI{
		public AI() {System.out.println("AI");}
	}
	private void teste_XXXXXIV() {
		System.out.println("\nteste_XXXXXIV");
		new AI();
	}
	
	public class Bird{
		public void fly() {System.out.println("Fly.");}
	}
	public class Peacock extends Bird {
		public void dance() {System.out.println("Dance.");}
	}
	private void teste_XXXXXV() {
		System.out.println("\nteste_XXXXXV");
		Peacock peacock = new Peacock();
		peacock.fly();
		peacock.dance();
		
		Bird b = new Peacock();
		Peacock p = (Peacock)b;
		p.fly();
		p.dance();
	}
	
	private void teste_XXXXXVI() {
		System.out.println("\nteste_XXXXXVI");
		String ta = "A ";
		ta = ta.concat("B ");
		String tb = "C ";
		ta = ta.concat(tb);
		
		//ta.replace('C', 'D');// nenhuma das alternativas, correto seria assim
		ta = ta.replace('C', 'D');// correto seria assim
		
		ta = ta.concat(tb);
		System.out.println(ta);
	}
	
	private void teste_XXXXXVII() {
		System.out.println("\nteste_XXXXXVII");

		System.out.print("A - ");
		int x = 3;
		do {
			System.out.print("*");
			x--;
		} while (x >= 0);
		
		System.out.print("\nE - ");
		x = 0;
		do {
			System.out.print("*");
		} while (x++ < 3);

		System.out.println();
	}
	
	private void teste_XXXXXVIII() {
		System.out.println("\nteste_XXXXXVIII");
		String[] strs = {"A", "B"};
		int idx = 0;
		for (String s : strs) {
			strs[idx].concat(" element " + idx);
			idx++;
		}
		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}
	
	class MyField{
		int x, y;
		public void doStuff(int x, int y) {
			x = x;
			y = this.y;
		}
		void display() {
			System.out.print(x + " " + y + " : ");
		}
	}
	private void teste_XXXXXVIX() {
		System.out.println("\nteste_XXXXXVIX");
		MyField m1 = new MyField();
		m1.x = 100; m1.y = 200;
		MyField m2 = new MyField();
		m2.doStuff(m1.x, m1.y);
		m1.display();
		m2.display();

		System.out.println();
	}
	
	private void teste_XXXXXX() {
		System.out.println("\nteste_XXXXXX");
		int data[] = {2010, 2013, 2014, 2015, 2014};
		int key = 2014;
		
		//int count; //compilation fails 
		int count = 0;
		
		for (int e : data) {
			if (e != key) {
				//continue; //compilation
				//count++; //fails

				count++;
				continue;
			}
		}
		System.out.println(count + " Found");
	}
	
	private void teste_XXXXXXI() {
		System.out.println("\nteste_XXXXXXI");
		/*| 0 | 0 |   |
		 *|   | X | 0 |
		 *| X |   | X |*///adds an X into the grid so that the grid contains three consecutive X
		char[][] grid = new char[3][3];
		grid[0][0] = '0';
		grid[0][1] = '0';
		grid[1][1] = 'X';
		grid[1][2] = '0';
		grid[2][0] = 'X';
		grid[2][2] = 'X';
		
		grid[2][1] = 'X'; // three 'X' consecutive

		for (int x = 0; x < grid.length; x++) {
			System.out.print("|");
			for (int y = 0; y < grid[x].length; y++) {
				System.out.print(" " + grid[x][y] + " |");
			}
			System.out.println();
		}
	}
	
	class C_1{}
	class C_2 extends C_1{}
	class C_3 extends C_2{}
	private void teste_XXXXXXII() {
		System.out.println("\nteste_XXXXXXII");
		
		try {
			System.out.println("I");
			C_1 obj1 = (C_1) new C_2();
			System.out.println("II");
			C_2 obj2 = (C_2) new C_3();
			System.out.println("III");
			//C_2 obj3 = (C_2) new C_1(); //ClassCastException C_1 não possue C_2
			C_1 obj3 = (C_1) new C_2();
			System.out.println("IV");
			C_3 obj4 = (C_3) obj2;
		} catch (ClassCastException e) {
			System.out.println("ERRO " + e.getMessage());
		}
	}
	
	private void teste_XXXXXXIII() {
		System.out.println("\nteste_XXXXXXIII");
		
	}
}
