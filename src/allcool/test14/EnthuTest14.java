package allcool.test14;

public class EnthuTest14 {

	private int myValue = 0;
	
	public void showOne(int myValue) {
		myValue = myValue;
	}
	
	public void showTwo(int myValue) {
		this.myValue = myValue;
	}
	
	public static void main(String[] args) {
		EnthuTest14 ct = new EnthuTest14();
		ct.showTwo(200);
		System.out.println(ct.myValue);
		ct.showOne(100);
		System.out.println(ct.myValue);
	}

}
