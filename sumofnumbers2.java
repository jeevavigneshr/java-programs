package finding;
import java.util.Scanner;
public class sumofnumbers2 {

	public static void main(String[] args) {
		int count;
		System.out.println("Enter the count of numbers:");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		int number , sum = 0;
		for(int i=0; i<count; i++) {
			number = sc.nextInt();
			sum = sum + number;
		}
 		System.out.println("Sum of all these numbers:" + sum);
		
	

	}

}
