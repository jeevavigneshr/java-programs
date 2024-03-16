package finding;
import java.util.Scanner;

public class multiplesofthree {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter the number:");
		Scanner num = new Scanner(System.in);
		number=num.nextInt();
		for(int i=1;i<=100;i++)
			System.out.println(number * i);

	}

}
