package nivea;

import java.util.function.Predicate;

public class Testint_II {
	
	public static int MIN = 1;
	
	public static void main(String[] args) {
		testing_II(args);
		testing_III();
	}
	
	public static void testing_II(String[] args) {
		int x = args.length;
		if (checkLimit(x)) {
			System.out.println("Java SE");
		} else {
			System.out.println("Java EE");
		}
	}
	
	private static boolean checkLimit(int x) {
		return (x >= MIN ? true : false);
	}
	
	public static void testing_III() {
		Predicate<Integer> p = (n) -> n % 2 == 0;
		System.out.println(p.test(4));
	}
}
