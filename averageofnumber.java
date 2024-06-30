package finding;
import java.util.Scanner;
public class averageofnumber {

	public static void main(String[] args) {
		int count;
		System.out.println("Enter the numbers:");
		Scanner input = new Scanner(System.in);
		count = input.nextInt();
		int number,sum = 0;
		float average = 0;
		for(int i = 0; i  < count; i++) {
			number = input.nextInt();
			sum = sum + number;
		}
		average = sum / count;
		System.out.println("average is:" + average);
		

	}

}
