package s4_recursion;

public class Q1_POWER {
	
	
	
	public static void main(String[] args) {
		System.out.println(new Q1_POWER().power(9, 3));
	}
	
	public int power(int base, int exponent) {
	    if (exponent == 0) {
	      return 1;
	    }
	    return base * power(base,exponent-1);
	  }

}
