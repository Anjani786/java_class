package LAB02;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the X Axis Point :");
		double X1 = in.nextDouble();
		double X2 = in.nextDouble();
		System.out.print("Enter the Y Axis Point :");
		double Y1 = in.nextDouble();
		double Y2 = in.nextDouble();
		double Distance = Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2));
		System.out.println("The Distance B/W The Given POints :" + Distance);
		
		

	}

}
