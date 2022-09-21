package programe.interview;

public class duplicateInArray {

	public static void main(String[] args) {
		
		int a[]= {10,1,2,3,4,21,21,54,0,1};
        
        for(int i=1;i<a.length;i++) 
        {
        	for(int j=i+1;j<a.length;j++) 
        	{
        		if((a[i]==a[j]) && (i!=j))
        		{
        		System.out.println(a[i]);
        		
        		}
        	}
        }
	}

}
