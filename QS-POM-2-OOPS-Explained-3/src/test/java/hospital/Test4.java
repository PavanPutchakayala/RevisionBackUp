package hospital;

public class Test4 {
	int m_x, m_y;

	public Test4(int x, int y) {
		m_x = x;
		m_y = y;
	}

	public static void main(String args[]) {
		Test4 p = new Test4(1, 2);
		System.out.println(p.m_x + p.m_y);

	}

}