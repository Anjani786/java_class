package LAB02;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			System.out.print("Enter the Temprature in Celsius :");
			double Celsius = in.nextDouble();
			double Fahrenheit = Celsius * 9.0/5 + 32;
			System.out.println("Temprature in Fahrenheit :" + Fahrenheit);
		}
	}

}
