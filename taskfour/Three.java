package taskfour;

public class Three {
	
	public int getSecondSmallest(int[] a, int n){  
		int temp;  
		for (int i = 0; i < n; i++)   
		        {  
		            for (int j = i + 1; j < n; j++)   
		            {  
		                if (a[i] < a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[n-2];  
}


	public static void main(String[] args) {

		int a[]={-1,0,5,6,7,2};  
		
		Three t1 = new Three();
		
		System.out.println("Second Smallest: "  +t1.getSecondSmallest(a, 6)); 

	}

}
