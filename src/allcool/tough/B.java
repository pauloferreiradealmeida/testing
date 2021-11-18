package allcool.tough;

public class B extends A{
	public int i = 20;

	public void mlB() {
		mlA();
		System.out.println("mlB");
	};

	public int getValue() {return 1;};

	protected int mlAP() {return i;}
}
