package javaProjectsPrograms;

public class FindDuplicateArray {

	public static void main(String[] args) {
		int arr[]= {1,3,4,1,4};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("The duplicate values in an array :" + arr[j]);
				}
			}
		}

	}

}
