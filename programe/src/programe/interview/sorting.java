package programe.interview;

public class sorting {

	public static void main(String []args) {
		
		int a[]= {10,6,7,3,4,6,2};
		int temp;
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j]) 
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			System.out.println(a[i]);

		}
		
	}
}
