package LAB02;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the 1st  Coodinate of the Triangle :");
		double X1 = in.nextDouble();
		double Y1 = in.nextDouble();
		System.out.print("Enter the 2nd  Coodinate of the Triangle :");
		double X2 = in.nextDouble();
		double Y2 = in.nextDouble();
		System.out.print("Enter the 3rd  Coodinate of the Triangle :");
		double X3 = in.nextDouble();
		double Y3 = in.nextDouble();
		double a = Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2));
		double b = Math.sqrt(Math.pow((X3-X1), 2) + Math.pow((Y3-Y1), 2));
		double c = Math.sqrt(Math.pow((X3-X2), 2) + Math.pow((Y3-Y2), 2));
		
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of the Triaangle :" + area);
		
		
		

	}

}
