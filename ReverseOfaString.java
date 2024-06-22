package javaProjectsPrograms;

public class ReverseOfaString {

	public static void main(String[] args) {
		String e="level";
		String rev="";
		System.out.println("Rverse  string");
		for(int i=e.length()-1;i>=0;i--)
		{
			rev=rev+e.charAt(i);
			
		}
		System.out.println(rev);
		if(rev.equals(e))
		{
			System.out.println("The string is palindrome");
		}
		else
		{
			System.out.println("The string is not a  palindrome");
		}
		

	}

}
