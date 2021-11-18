package nivea.revision.clothing;

class A1 {
	protected static int i;
	private final int ii = 0;
	public void doStuff(int ii) {this.i = ii;}
	private A1() {}

	interface Down_I {
		public void down_I();
	}
	interface Down_II extends Down_I {
		public void down_II();
	}
	class DownL implements Down_II {

		public void down_I() {}
		public void down_II() {}
		
	}
}
