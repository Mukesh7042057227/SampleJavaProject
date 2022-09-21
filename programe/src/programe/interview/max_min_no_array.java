package programe.interview;

public class max_min_no_array {
	
	public static void main(String []args) {
		
		int a[]= {2,5,6,8,1,10};
		int max=a[0];
		
		for(int i=1;i<a.length;i++) 
		{
			
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
