package nivea;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Simulated {

	public static int MIN = 1;
	public static void main(String[] args) {

		new Simulated().testing_3();
		
		if (args.length >= MIN) {
			System.out.println("Java...");
		}

		new Simulated().testing_4();
}

	private void testing_3() {
		ArrayList<String> arrayList = new ArrayList<String>();
		//List<String> arrayList = new ArrayList<>();
		arrayList.add("Tech");
		arrayList.add("Expert");
		arrayList.set(0, "Java");
		
		arrayList.forEach(a -> a.concat("Forum"));
		arrayList.replaceAll(s -> s.concat("Group"));

		System.out.println(arrayList);
	}

	private void testing_4() {
		
		String[] arr = {"Hi", "How", "Hi", "Are", "Hi", "You"};
		ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
		System.out.println(arrList);
		if (arrList.removeIf(s -> {System.out.println(s); return s.length() <= 2;})) {

			System.out.println(arrList);
			System.out.println("removed");
		}

		String[] arrI = {"Hi", "How", "Hi", "Are", "Hi", "You", "Hi"};
		ArrayList<String> arrListI = new ArrayList<>(Arrays.asList(arrI));

		System.out.print(arrListI);
		
		Predicate<String> sI = p -> p.length() <= 2;
		boolean remove = arrListI.removeIf(sI);

		System.out.print(arrListI);

		if (remove) {
			System.out.println(" removed I");
		}
	}
}
