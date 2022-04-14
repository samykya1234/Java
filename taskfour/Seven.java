package taskfour;



public class Seven {

	public static void main(String[] args) {
		int[] a = {5, 7, 1, 4, 9, 10, 15, -1};
		int max = a[0];
		int min = a[0];
		for(int i = 1; i < a.length; i++)
		{
			if(a[i] > max)
				max = a[i];
			else if(a[i] < min)
				min = a[i];
		}
		System.out.println("Difference between the largest and smallest values of the said array: "+(max-min));

	}

}
