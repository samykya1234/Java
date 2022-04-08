package taskthree;
import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		n= sc.nextInt();
		
		for(i=0;i<=n;i++) {
			sum = sum+i;
		}
		System.out.println("Sum is : " +sum);
	}

}
