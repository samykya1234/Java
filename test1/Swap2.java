package test1;

public class Swap2 {

	public static void main(String[] args) {
		
		 int x, y;
		   x = 5;
		   y = 10;
		   
		   System.out.println("Before swapping : a, b = "+x+", "+ + y);
		   x = x + y;
		   y = x - y;
		   x = x- y;
		   System.out.println("After swapping : a, b = "+x+", "+ + y);

	}

}
