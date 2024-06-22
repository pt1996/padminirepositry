package javaProjectsPrograms;

public class StringPalindrome123 {

	public static void main(String[] args) {
		String s="padmini";
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
			
		}
		System.out.println(r);
		if(r.equals(s))
		{
			System.out.println("The given string is a palindrome");
		}
		else
		{
			System.out.println("The given string is not a  palindrome");
		}

	}

}
