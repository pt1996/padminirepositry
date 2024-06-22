package javaProjectsPrograms;

public class RevString {
	static String s="hello";

	public static void main(String[] args) {
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
