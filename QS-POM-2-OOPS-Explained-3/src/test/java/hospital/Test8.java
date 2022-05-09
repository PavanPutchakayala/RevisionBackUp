package hospital;

public class Test8 {
	int i;
	int j;

	public static void main(String[] args) {
		Test8 t1 = new Test8();
		t1.i = 200;
		t1.j = 100;
		add(t1);
		System.out.print(t1.i);
		System.out.print(t1.j);
	}

	public static void add(Test8 t) {
		t.i = t.i + 100;
		t.j = t.j + 100;
		System.out.print(t.i);
		System.out.print(t.j);

	}

}