package javaProjectsPrograms;

public class RemoveDuplicateValuesarray {
	static int i;

	public static void main(String[] args) {
		int arr[]= {2,3,5,6,5,2};
		int rd=0;
		for( i=0;i<arr.length;i++)
		{
			if(arr[rd]!=arr[i])
			{
				rd++;
				  arr[rd]=arr[i];
			}
		}
		System.out.println("After removing duplicate values the array is :" +arr[i]);

	}

}
