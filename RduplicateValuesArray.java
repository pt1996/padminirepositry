package javaProjectsPrograms;

public class RduplicateValuesArray {
	static void removeduplicate(int[] ar)
	{
		int rd=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[rd]!=ar[i])
			{
				rd++;
				ar[rd]=ar[i];
			}
		}
	}
	
	
	
}

	public static void main(String[] args) {
		int[] ar= {1,3,4,1,6,7,3,4};
		removeduplicate(ar);
	}
	


