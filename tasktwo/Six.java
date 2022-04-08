package tasktwo;
import java.util.Scanner;
public class Six {

	public static void main(String[] args) {
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer");
		i=sc.nextInt();
		
		
		if(i%2==0) {
			if((i>=2 && i<=5)|| i>30) {
				System.out.println("OLd");
			}else if(i>=6 && i<=30) {
				System.out.println("NEW");
			}
		}else
			System.out.println("NEW");
	
	}

}
