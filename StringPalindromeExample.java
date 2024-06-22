package javaProjectsPrograms;

public class StringPalindromeExample {

	public static void main(String[] args) {
		String s1="madam";
		String rev=" ";
		System.out.println(s1.length());
		for(int i=s1.length()-1;i>=0;i--)
		{
			
			rev=rev+s1.charAt(i);
		}
	
		if(s1.equals(rev))
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is  not a palindrome");
		}
		

	}

}
