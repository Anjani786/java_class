package Programs;

public class Q10_b {
	public static void main(String[] args) {
		int a = 12;
		int b = 43;
		int c = 56;
		a = a + b +c;
		c = a - b -c ;
		b = a - c - b;
		a = a -b -c;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

} 
