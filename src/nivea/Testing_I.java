package nivea;

public class Testing_I {

	public static void main(String[] args) {
		String[][] chs = new String[5][2];
		chs = new String[2][5];
		//chs[1] = new String[5];
		int i = 97;
		
		for (int a = 0; a < chs.length; a++) {
			for (int b = 0; b < chs.length; b++) {
				chs[a][b] = "" + i;
				i++;
			}
		}
		
		for (String[] ca : chs) {
			for (String c : ca) {
				System.out.println(c + " ");
			}
		}

		System.out.println();
	}

}
