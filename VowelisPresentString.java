package javaProjectsPrograms;

public class VowelisPresentString {

	public static void main(String[] args) {
		String s="ice";
		int count=0;
		System.out.println(s.length());
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
			}
			
		}
		System.out.println("The given string contains vowel");
		System.out.println(count);
		

	}

}
