package javaProjectsPrograms;

import java.util.Arrays;

public class PrinttheReverseofeachwordArray {
	static int i=0;

	public static void main(String[] args) {
		  String s[]= {"java","automation","class"};
		  System.out.println("The original array");
		 for(i=0;i<s.length;i++)
		 {
			 System.out.println(s[i]+" ") ;
		 }
		 System.out.println("The reversed array");
		 for(i=s.length-1;i>=0;i--)
		 {
			 String p=s[i];
			System.out.println( p.charAt(0));
			 
		 }
		 
		 
		
	

}
}
