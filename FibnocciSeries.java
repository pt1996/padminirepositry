package javaProjectsPrograms;

public class FibnocciSeries {

	public static void main(String[] args) {
		int a[]= {12,56,78,34,18};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		
		System.out.println("The Maximimum array element is :" +max);
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];
		}
		
		System.out.println("The Minimum array element is :" +min);
	}


}

