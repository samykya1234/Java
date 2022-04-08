package tasktwo;
import java.util.Scanner;
public class One {

	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		
		x= sc.nextInt();
		
		
		if(x%5==0&& x%3==0) {
			System.out.println("Consultadd JAVA Training");
		}else if(x%5==0) {
			System.out.println("JAVA Training");
		}else if(x%3==0){
			System.out.println("Consultadd");
		}else {
			System.out.println("The entered value is not divided by both 5 and 3");
		}

	}

}
