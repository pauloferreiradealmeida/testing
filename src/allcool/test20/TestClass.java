package allcool.test20;

public class TestClass {
	public static void main(String[] args) {
		System.out.println(getMsg((char)10));
	}

	public static String getMsg(char x) {
		String msg = "Imput value must be ";
		msg = msg.concat("smaller than X");
		msg.replace('X', x);
		String rest = " and larger than 0";
		msg.concat(rest);
		return msg;
	}
}
