package tasktwo;
import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value");
	double i =sc.nextDouble();
	
	if(i>0) {
		if(i<1) {
			System.out.println("Positive small");
		}else if(i>1000000) {
			System.out.println("Positive large");
		}else
			System.out.println("Positive");
	}else if(i<0) {
//		if(i>-1) {
//			System.out.println("Negative large");
//		}else if (i<-1000000) {
//			System.out.println("Negative small");
//		}else
		System.out.println("Negative");
	}else 
		System.out.println("Zero");
	
	}

}
