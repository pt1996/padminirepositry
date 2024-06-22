package javaProjectsPrograms;

public class FindDuplicateValuesArray {

	public static void main(String[] args) {
		int[] n= {10,20,30,20,10};
		int count=0;
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					System.out.println("The duplicate values in given array :" +n[j]);
				}
			}
		}
		

	}

}
