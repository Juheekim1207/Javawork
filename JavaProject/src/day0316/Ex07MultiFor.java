package day0316;

public class Ex07MultiFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<=5;a++) //행
		{
			for(int b=1;b<=5;b++) //열
			{
				System.out.print("★");
		}
		System.out.println();
		
		}
		System.out.println("--------------------");
		
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print("★");
			}
			System.out.println();
			
		}
		System.out.println("--------------------");
		
		for(int a=1;a<=5;a++) //행
		{
			for(int b=a;b<=5;b++) //열
			{
				System.out.print("★");
			}
			System.out.println();
			
		}
		System.out.println("--------------------");
		
		/*
		 *              *
		 *             **
		 *            ***
		 *           ****
		 *          *****
		 */
		
		for(int a=1;a<=5;a++)
		{	for (int sp=a;sp<5;sp++)
			{
			System.out.print(" ");
			}
			for(int b=1;b<=a;b++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
}
}

