package javaProjectsPrograms;

import java.util.Arrays;

public class ReverseStringArray {

	public static void main(String[] args) {
		String arr[]= {"a","c","k","g","b"};
		System.out.println(Arrays.toString(arr));
		
	    System.out.println(arr.length);
	    for(int i=arr.length;i>0;i++)
	    {
	    	StringBuilder sb=new StringBuilder();
	    	sb.append(arr);

	    }
	    System.out.println("Reverse of the String arrray:" +Arrays.toString(arr));
	}
	
	    	
	
	    }


