package nivea;

import java.util.List;
import java.util.function.Predicate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Testing {
	public static int MIN = 1;
	public static void main(String[] args) {
/*		
		System.out.println("Testing args " + args[0]);
		int x = args.length;
		if (checkLimit(x)) {
			System.out.println("Java SE");
		} else {
			System.out.println("Java EE");
		}
*/
		/*
		Car c1 = new Car("Auto");
		Car c2 = new Car("4W", 150, "Manual");
		
		System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
		System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);

		int array[] = new int[] {};
		
		new Testing().testing_I();
		new Testing().testing_II("Movie");
		new Testing().testing_46();
		*/
		new Testing().testing_III();/*
		new Testing().testing_71();
		new Testing().testing_75();
		new Testing().testing_IV();
		new Testing().testing_V();
		new Testing().testing_VI();
		new Testing().testing_VII();
		new Testing().testing_110();
		new Testing().testing_VIII();
		new Testing().testing_IX();
		new Testing().testing_X();
		new Testing().testing_XI();
		new Testing().testing_XII();
		new Testing().testing_XIII();
		new Testing().testing_XIV();
		new Testing().testing_XV();
		new Testing().testing_XVI();
		new Testing().testing_XVII();
		new Testing().testing_XVIII();
		new Testing().testing_XVIX();
		new Testing().testing_XX();
		new Testing().testing_XXI();
		new Testing().testing_XXII();
		new Testing().testing_XXIII();

		args = new String[2];
		args[0] = "1"; args[1] = "null";
		new Testing().testing_XXIV(args);

		new Testing().testing_XXV();
		new Testing().testing_XXVI();
*/
}

	public static boolean checkLimit(int x) {
		return (x >= MIN ? true : false);
	}
	
	private void testing_I() {
		List<String> ist = Arrays.asList("EM", "FR", "CH", "JP");
		Iterator<String> itr = ist.iterator();
		
		while (itr.hasNext()) {
			String e = itr.next();
			if (e.equals("CH")) {
				break;
			}

			System.out.print(e + " ");
		}

		System.out.println();
		
		float flt = 100.00F;
		System.out.println(flt);

		double d = 23.22;
		//float f = d;
		float fI = (float) 1_1_1.00;
		//Float fII = 100.00;
		int i = 100;
		float fIII = (float)i;
		System.out.println(d + " " + fI + " " + fIII);
		
	}

	private void testing_II(String stuff) {
		String res = stuff.equals("TV")? "Walter" : stuff.equals("Movie") ? "While" : "No result";
		System.out.println(res);
	}

	private void testing_III() {
		Employee e1 = new Employee();
		Employee e2 = new Employee("Jack", 50);
		Employee e3 = new Employee("Chloe", 40, 5000);
		
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}
	
	private void testing_46() {
		List<String> st1 = Arrays.asList("EN", "FR", "CH", "JP");
		Iterator<String> itr = st1.iterator();
		while(itr.hasNext()) {
			String e = itr.next();
			if (e == "CH") {
				break;
			}
			System.out.print(e + " ");
		}
	}
	
	private void testing_71() {
		List<String> lst = Arrays.asList("A", "B", "C", "D");
		Iterator<String> itr = lst.iterator();
		while(itr.hasNext()) {
			String e = itr.next();
			if (e == "C") {
				break;
			}
			else {
				//continue;
				System.out.print(e);
			}
		}
		System.out.println();
	}

	private void testing_75() {
		int[] stack = {10,20,30};
		int size = 3;
		int idx = 0;

		do {
			idx++;
		} while (idx < size - 1);
		
		System.out.println("The top element " + stack[idx]);

		idx = 0;
/*		
		while (idx <= size - 1) {
			idx++;
		}

		System.out.println("The top element " + stack[idx]);*/
	}

	private void testing_IV() {
		String myStr = "Helo Worde ";
		myStr.trim();
		int i1 = myStr.indexOf(" ");

		System.out.println(i1);
	}

	private void testing_V() {
		String str1 = "Java";
		String str2 = new String("Java");

		str1.toLowerCase();
		if (str1.equals(str2)) {
			System.out.println("Equal");
		} else {
			System.out.println("No Equal");
		}
	}

	private void testing_VI() {
		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);
		System.out.println(date);
	}

	private void testing_VII() {
		ArrayList<Integer> points = new ArrayList<>();
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		points.add(null);
		points.add(null);

		points.remove(null);
		points.remove(1);
		points.remove(null);

		System.out.println(points);
	}

	private void testing_110() {
		ArrayList myList = new ArrayList();
		String[] myArray;
		
		try {
			while(myList.size() < 10){//while(true) {//java.lang.OutOfMemoryError: Java heap space
				myList.add("My String");
			}
		}
		catch (RuntimeException re) {
			System.out.println("Caught a Exception");
		}
		catch(Exception e){
			System.out.println("Caught a Exception");
		}

		System.out.println("REad to use");
	}

	private void testing_VIII() {
		String str = " ";
		str = str.trim();
		
		System.out.println(str.equals("") + " " + str.isEmpty());
	}

	private void testing_IX() {
		String[] arr = {"Hi"};
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
		if (arrList.removeIf((String s) -> s.length() <= 2))
			System.out.println("s " + "removed");
		else
			System.out.println("s " + "no removed");
			
	}

	private void testing_X() {
		int x = 6;
		while (isAvailable(x)) {
			System.out.print(--x);
		}
			
		System.out.println();
	}

	private boolean isAvailable(int x) {
		return --x > 0 ? true : false;
	}

	private void testing_XI() {
		int wd = 0;
		String days[] = {"sun", "mon", "wed", "sat"};
		
		for (String s:days) {
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

	private void testing_XII() {
		doSum(10, 20);
		doSum(10.0, 20.0);
	}

	private void doSum(Integer x, Integer y) {
		System.out.println("Integer " + (x + y));
	}

	private void doSum(double x, double y) {
		System.out.println("double " + (x + y));
	}

	private void doSum(float x, float y) {
		System.out.println("float " + (x + y));
	}

	private void testing_XIII() {
		int[] arr = {1,2,3,4};
		int i = 0;
		do {
			System.out.print(arr[i] + " ");
			i++;
		} while (i < arr.length - 1);//(i < arr.length + 1);//java.lang.ArrayIndexOutOfBoundsException: 4

		System.out.println();
	}

	private void testing_XIV() {
		Testing ex = new Testing();
		int card = 12344;
		
		try {
			ex.readCard(card);
		}catch(Exception e) {
			e.getMessage();
		}

		ex.checkCard(card);
	}

	void readCard(int cardNo) throws Exception{
		System.out.println("Reading Card");
	}

	void checkCard(int cardNo) throws RuntimeException{
		System.out.println("Checking Card");
	}

	private void testing_XV() {
		System.out.println("Hello " + new StringBuilder("Java SE 8"));
		System.out.println("Hello " + new MyString("Java SE 8").msg);
	}

	private void testing_XVI() {
		String str = "Sweet Sweat";
		String str2 = str.trim().charAt(6) + "" + str.indexOf("Sw",1);
		System.out.println(str2);
	}

	private void testing_XVII() {
		List<Person> iList = Arrays.asList(new Person("Hank", 45), new Person("Charlie", 40), new Person("Smith", 38));
		checkAge(iList, predicate -> predicate.getAge() >= 40 && predicate.getAge() <= 50);
	}

	private static void checkAge(List<Person> list, Predicate<Person> predicate) {
		for (Person p : list) {
			if (predicate.test(p)) {
				System.out.println(p.name);
			}
		}
	}

	private void testing_XVIII() {
		String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				if (arr[i][j].equals("B")){
					continue;
				}
			}
			continue;
		}
		
		System.out.println();
	}

	private void testing_XVIX() {
		String[][] shirts = new String[2][2];
		shirts[0][0] = "red";
		shirts[0][1] = "blue";
		shirts[1][0] = "small";
		shirts[1][1] = "medium";
		
		for (String[] c : shirts) {
			for (String s : c) {
				System.out.print(s + ":");
			}
		}
		
		System.out.println();
	}

	private void testing_XX() {
		
		LocalDate date = LocalDate.of(2012, 1, 30);
		
		date = date.plusDays(10);
		
		System.out.println(date);
	}

	private void testing_XXI() {
		int x = 100; //103
		int a = 0;//x++; //100
		int b = 1;//++x; //102
		int c = 1;//x++; //102
		int d = (a == b) ? (a < c) ? 1 : (b < c) ? 2 : 3 : x;
		
		System.out.println(d);
	}

	private void testing_XXII() {
		Short s1 = 200;
		Integer s2 = 400;
		String s3 = String.valueOf(s1 + s2);
		Long s4 = Long.valueOf(s1 + s2);
		
		System.out.println("Sum is " + s4);
	}

	private void testing_XXIII() {
		List colors = new ArrayList();
		colors.add("green");
		colors.add("blue");
		colors.add("red");
		colors.add("yellow");
		colors.remove(2);
		colors.add(2,"cian");
		
		System.out.println(colors);

		colors.remove("cian");
		
		System.out.println(colors);
	}
	
	private void testing_XXIV(String[] args) {
		boolean a = new Boolean(Boolean.valueOf(args[0]));
		boolean b = new Boolean(args[1]);
		System.out.println(a + " " + b);
	}

	private void testing_XXV() {
		String ta = "A ";
		ta = ta.concat("B ");
		String tb = "C ";
		ta = ta.concat(tb);
		ta = ta.replace('C', 'D');
		ta = ta.concat(tb);
		System.out.println(ta);
	}

	private void testing_XXVI() {
		String[] strs = {"A", "B"};
		int idx = 0;
		for (String s : strs) {
			strs[idx].concat(" elenebt " + idx);
			idx++;
		}
		
		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}
}
