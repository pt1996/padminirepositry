package javaProjectsPrograms;

public class StringNonspaceCharacter {

	public static void main(String[] args) {
		String s="This is a java class";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
