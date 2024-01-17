package corejavap;

public class TestVaraibles {

	int x=10;
	double d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instance varaibles
		//if the value varry from object to object is known as instance variable
		//they can be declare inside the class but outside of any method constructor, block
		//System.out.println(x);
		Test t=new Test();
		//System.out.println(t.d);
	}
	public void m1() {
		System.out.println(x);
	}
}
