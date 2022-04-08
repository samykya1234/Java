package tasktwo;
import java.util.Scanner;
public class Two {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float first, second, result;
		
		System.out.println("Enter the first value :");
		first = sc.nextFloat();
		
		System.out.println("Enter the second value :");
		second = sc.nextFloat();
		
		System.out.println("Choose a value to perform operation: 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for division, 5 for Average");
		//result = sc.nextFloat();
		
		int value = sc.nextInt();
		switch(value) {
		
		case 1:
			result = first+second;
			if(result<0) {
				System.out.println("Oops option 1 is returning the negative number which is: "+result);
			}else {
			System.out.println("Addition of Two Entered numbers is : " +result);
			}
			break;
			
		case 2:
			result= first-second;
			if(result<0) {
				System.out.println("Oops option 2 is returning the negative number which is: "+result);
			}else {
			System.out.println("Subtraction of two entered numbers is : "+result);
			}
			break;
			
		case 3:
			result= first*second;
			if(result<0) {
				System.out.println("Oops option 3 is returning the negative number which is: "+result);
			}else {
			System.out.println("Multiplication of two entered numbers is : "+result);
			}
			break;
			
		case 4:
			if(second==0) {
				System.out.println("Any value divided by 0 is infinity");
			}else if(second!=0) {
			result= first/second;
			if(result<0) {
				System.out.println("Oops option 4 is returning the negative number which is: "+result);
			}else {
			System.out.println("Divison of two entered numbers is :" +result);
			}
			}
			break;
			
		case 5:
			Scanner average = new Scanner(System.in);
			float first1,second2;
			System.out.println("Enter two more values for the average");
			System.out.println("Enter first number for average");
			first1 = average.nextFloat();
			System.out.println("Enter second number for average");
			second2 = average.nextFloat();
			result = (first+second+first1+second2)/4;
			if(result<0) {
				System.out.println("Oops option 5 is returning the negative number which is: "+result);
			}else {
			System.out.println("The average is : " +result);
			}
			break;
			
		default:
			System.out.println("invalid option");
		}
		
	}

}
