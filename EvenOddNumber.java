package finding;

public class EvenOddNumber {

	public static void main(String[] args) {
		int berlin=100;
		int evencount=0;
		int oddcount=0;
		for(int i = 0; i < berlin; i++) {
			if(i%2==0) {
				evencount++;
				System.out.println("Even number:" +i);
			} else {
				oddcount++;
				System.out.println("Odd number:" +i);
				
			}
		}
System.out.println("Even number:" +evencount+"Odd number :"+oddcount);
	}

}
