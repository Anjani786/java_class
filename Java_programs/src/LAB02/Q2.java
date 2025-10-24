package LAB02;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius :");
		double Radius = in.nextDouble();
		System.out.print("Enter the Length of the Cylinder :");
		double Length = in.nextDouble();
		double Area  = 2 * Math.PI * Radius * Length ;
		double Volume = Area * Length;
		System.out.print("Area of the Cylinder :" + Area);
		System.out.println(" ,Voulme of the Cylinder :" + Volume);
		
		
		
		

	}

}
