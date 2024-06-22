package javaProjectsPrograms;

import java.util.Arrays;

public class PrintEveryWordFirstLetterString {

	public static void main(String[] args) {
		String s="welcome to java ";
		    String a[]=  s.split(" ");
		    System.out.println(Arrays.toString(a));
		         for(int i=0;i<a.length;i++)
		         {
		        	 String f=a[i];
		        	 System.out.println(f.charAt(0));
		         }

	}

}
