package LAB02;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the side of the Hexagon :");
		int Sides  = in.nextInt();
		double Area  = (3*Math.sqrt(3))/2 * Math.pow(Sides, 2);
		System.out.println("The Area of the Hexagon is :" + Area);
		
	}

}
