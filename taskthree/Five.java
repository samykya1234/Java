package taskthree;
import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		long i, sum;  
		int count=0;
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a number: ");  
		i=sc.nextLong();  
		
		for(sum=0; i!=0; i=i/10)  
		{      
		sum = sum + i % 10;  
		++count;
		
		}    
		System.out.println("Sum of digits: "+sum); 
		System.out.println("Number of digits : "+count);
		
	}

}
