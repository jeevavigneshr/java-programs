package finding;
import java.util.Scanner;
public class smallestofthree {

	public static void main(String[] args) {
	int	a,b,c;
	System.out.println("Enter three numbers");
	Scanner in = new Scanner(System.in);
	 a=in.nextInt();
	 b=in.nextInt();
	 c=in.nextInt();
	if(a<b && a<c)
		System.out.println("The smallest number is:"+a);
	else if(b<a && b<c)
		System.out.println("The smallest valur is:"+b);
	else if(c<a && c<b)
		System.out.println("The smallest valur is:"+c);
	else
		System.out.println("all are equal numbers");
	
		
		

	}

}
