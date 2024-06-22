package javaProjectsPrograms;

import java.util.Arrays;

public class ArraysEqual {

	public static void main(String[] args) {
		String a[]= {"yamu","ramu","siri"};
		String b[]= {"yamu","ramu","siri"};
		for(int i=0;i<a.length;i++) {
			if(Arrays.equals(a, b))
			{
				System.out.println("The given two arrays are equal");
			}
			else
			{
				System.out.println("The given two arrays are not equal");
			}
		}
		
		
	}

}
