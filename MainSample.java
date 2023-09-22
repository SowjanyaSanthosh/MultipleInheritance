package multiple.org;

public class MainSample implements Sample1,Sample2 {

	public static void main(String[] args) {
		MainSample ms1=new MainSample();
		ms1.m1();
		ms1.m2();
	}

	@Override
	public void m2() {
		System.out.println("m2 method present in Sample2 interface");
		
	}

	@Override
	public void m1() {
		System.out.println("m1 method present in Sample1 interface");		
	}

}
