package finding;
import java.util.Scanner;
public class fibonacciseries {

	public static void main(String[] args) {
		int num;
		int a=0,b=1;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the Range:");
		num=x.nextInt();
		System.out.print(a + " , "+ b + " , ");
		int nextTerm;
		for(int i=2;i<num;i++)
		{
			nextTerm=a+b;
			a=b;
			b=nextTerm;
			System.out.print(nextTerm + " , ");
		}

	}

}
