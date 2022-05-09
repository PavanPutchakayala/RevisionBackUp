package s2_recursion;

public class Delete {
	
	public static void main(String[] args) {
		System.out.println(new Delete().factorial(4));
		System.out.println(new Delete().factorial(7));
		System.out.println(new Delete().factorial(-4));
		System.out.println(new Delete().factorial(1));
		System.out.println(new Delete().factorial(0));
	}
	
	
	public int factorial(int n) {
		if(n==0 || n==1) return 1;
		if (n<1) return -1;
		return n * factorial(n-1);
	}

}
