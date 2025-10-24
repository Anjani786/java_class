package LAB02;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Salary :");
		double Salary = in.nextDouble();
		double DA = 0.4 * Salary;
		double Home = 0.2  * Salary;
		double Gross_Salary = Salary + DA + Home;
		System.out.println("Base Salary :" + Salary);
		System.out.println("DA is  :" + DA);
		System.out.println("HRA is  :" + Home);
		System.out.println("Gross Salary:" + Gross_Salary);
		

	}

}
