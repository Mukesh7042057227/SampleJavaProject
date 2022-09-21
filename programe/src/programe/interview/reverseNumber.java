package programe.interview;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter username");

		int no=sc.nextInt();
		int temp=no;
		int rev=0;
		int rem;
		while(temp!=0) 
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;			
		}
		System.out.println(rev);
		
		if(temp==rev) 
		{
		System.out.println("no is polindrome");	
		}
		else {
			
			System.out.println("no is not polindrome");	

		}

		}
	
		
		
	}


