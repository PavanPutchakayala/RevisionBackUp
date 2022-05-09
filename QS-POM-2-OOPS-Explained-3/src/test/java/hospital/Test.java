package hospital;

public class Test {
	int i;

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.i = 100;
		Test t2 = new Test();
		t2.i = 200;
		Test t3 = new Test();
		t3.i = 300;
		t1 = t3;
		t3.i = 200 + t1.i;
		System.out.print(t1.i);
		t3 = new Test();
		t2 = t3;
		System.out.print(t2.i);
	}

}