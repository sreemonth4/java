package corejavap;

public class TestVAR_ARG {
	
	public static void m1(int... x) {
		System.out.println("var-arg method: "+x.length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		m1(10,29,5,3,53);
	}

}
