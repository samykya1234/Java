package taskthree;
import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 10 values");
	float j =0;
	for(int i=0;i<10;i+=1) {
		j+= sc.nextInt();
	}
 System.out.println("Sum is :" +j);
 float x =j/10;
 System.out.println("The average of 10 values is " +x);
	}

}
