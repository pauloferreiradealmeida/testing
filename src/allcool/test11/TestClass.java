package allcool.test11;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crazyLoop();
	}

	private static void crazyLoop() {
		int c = 0;
		JACK: while (c < 8) {
			System.out.println(c);
			if (c > 3) break JACK; else c++;
		}
	}
}
