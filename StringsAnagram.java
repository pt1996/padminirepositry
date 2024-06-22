package javaProjectsPrograms;

import java.util.Arrays;

public class StringsAnagram {

	public static void main(String[] args) {
		String s1="race";
		String s2="acer";
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2))=true)
		{
			System.out.println("The given strings are anagram ");
		}
		else
		{
			System.out.println("The given strings are not anagram ");
		}

	}

}
