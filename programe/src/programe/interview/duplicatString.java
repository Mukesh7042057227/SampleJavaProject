package programe.interview;

public class duplicatString {

	public static void main(String[] args) {

		String str="mukesh";
		int len=str.length();
		String reverse="";
		for(int i=len-1;i>=0;i--) 
		{
		reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);

		
	}

}
