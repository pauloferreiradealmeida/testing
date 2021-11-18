package allcool.topic_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
	public void update(Product product, double price) {
		price = price * 2;
		product.price = product.price + price;
	}

	public static void main(String[] args) {

		/** Question 1*/
		Product prt = new Product();
		prt.price = 200;
		double newPrice = 100;
		
		Test t = new Test();
		t.update(prt, newPrice);
		System.out.println(prt.price + " : " + newPrice);

		/** Question 3*/
		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);
		System.out.println(date);
		String date_I = LocalDateTime.parse("2014-05-04T14:49:23").format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date_I);
		String date_II = OffsetDateTime.parse("2014-05-04T14:49:23-04:00").format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date_II);
		
		/** Question 4*/
		Short s1 = 200;
		Integer s2 = 400;
		Long s3 = (long) s1 + s2;
		String s4 = String.valueOf(s3 * s2);
		//String s4 = (String) (s3 * s2);
		System.out.println(s4);

		/** Question 9 - r AC - correto seria ABC*/
		new Test().test_9(10);

		System.out.println();
		new Test().test_18();

		System.out.println();
		new Test().test_20();

		System.out.println();
		new Test().test_23();

		new Test().test_79();

		System.out.println();
		new Test().test_81();
	}

	private double kWh;
	private double rate = .07;
	private double bill;
	private void test_9(double kWh) {
		this.kWh += kWh;
		this.bill = this.kWh*this.rate;

		System.out.println(this.kWh + " " + bill);
	}

	private void test_18() {
		String shirts[][] = new String[2][2];
		shirts[0][0] = "red";
		shirts[0][1] = "blue";
		shirts[1][0] = "smal";
		shirts[1][1] = "medium";

		for (int index = 0; index < 2;) {
			for (int idx = 0; idx < 2;) {
				System.out.print(shirts[index][idx] + ":");
				idx++;
			}
			index++;
		}
	}

	private void test_20() {
		int x = 5;
		while (isAvailable(x)) {
			System.out.print(x);
			x--;
		}
	}

	private boolean isAvailable(int x) {
		boolean ret = x-- > 0; 
		return ret;
	}

	private void test_23() {
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		
    	//int f = (a < b) ? (a < c) ? a: (b < c) ? b: c;
		int d = (a < b && a < c) ? a: (b < c) ? b: c;
		int e = (a < b) && (a < c) ? a: (b < c) ? b: c;

		System.out.println(d + " - " + e);
	}

	private void test_79() {
		int n[][] = {{1,3},{2,3}};
		for (int i = n.length-1; i >= 0; i--) {
			for (int y : n[i]) {
				System.out.print(y);
			}
		}
	}

	private void test_81() {
		int ans = 0;
		try {
			int nim = 10, div = 0;
			ans = nim / div;
		}
		catch(ArithmeticException ari) {
			ans = 0;
		}
		catch(Exception e) {
			System.out.println("Invalid");
		}
		System.out.println("Answer " + ans);
	}
}
