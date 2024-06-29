package finding;
import java.util.Scanner;
public class sumofnumbers {

	public static void main(String[] args) {
		int num1;
		int num2;
		System.out.println("Enter the first number:");
		Scanner sc =new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		num2 = sc.nextInt();
		System.out.println("Sum of two numbers are:" + (num1 + num2));

	}

}
