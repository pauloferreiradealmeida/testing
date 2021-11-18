package enthuware.tough_I;

public class Tough_Test_I {

	public static void main(String[] args) {

		//new Tough_Test_I().test_I();//testing Exception
		new Tough_Test_I().test_II();//testing numeric
	}

	class MyException extends Exception{}
	private void m1() throws MyException{
		throw new MyException();
	}
	private void m2() throws RuntimeException{
		throw new NullPointerException();
	}
	private void test_I() {
		try {
			m1();
		} catch (MyException ex) {
			//m1(); //no compile
		} finally {
			m2();
		}
	}

	private int out_1() {return 1;};
	private int out_2() {return 2;};
	private int out_3() {return 3;};
	private void test_II() {
		short s = 9;
		int i = 9;
		Short so = new Short(s);
		so = new Short((short)9);
		Integer io = new Integer(9);
		
		System.out.println(s == so);
		System.out.println(so == s);
		System.out.println(so.equals(io));
		System.out.println(s == io);
		System.out.println(s == i);

		System.out.println(i < 20 ? i > 10 ? out_1() : out_2() : out_3());
	}
}
