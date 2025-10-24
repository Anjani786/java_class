package LAB02;
import java.util.Scanner; 
public class Q8 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int eggs = in.nextInt();
		double dozen = eggs/12;
		double many = eggs %12;
		System.out.println(dozen);
		System.out.println(many);
	}

}
