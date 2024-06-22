package javaProjectsPrograms;

public class FindEvenOdd {

	public static void main(String[] args) {
		int even_odd[]= {21,25,70,46};
		System.out.println("the even numbers are ");
		for(int i=0;i<even_odd.length;i++)
		{
			if(even_odd[i]%2==0)
			{
				System.out.println(even_odd[i]);
			}
			
		}

	}

}
