package Day9112022;

import java.util.Scanner;

//Write a program the given string is palindrome nor not?
public class CheckPalindromeString {
	public static void main(String[]arfs)
	{
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String word :");
		String p=sc.nextLine();
		
		for(int i=p.length()-1;i>=0;i--)
		{
	        reverse=reverse+p.charAt(i);
		}
		if(reverse.equals(p))
		{
			System.out.println("The input String is palindrome");
		}
		else
		{
			System.out.println("The input String is Not palindrome");
		}
	}

}
