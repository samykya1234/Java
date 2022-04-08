package taskthree;
import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter a number to get the muktiplication table : ");
		i = sc.nextInt();
		for(int j=1;j<=10;j++) {
			System.out.println(i+ " X " +j+ " = " +i*j);
		}

	}

}
