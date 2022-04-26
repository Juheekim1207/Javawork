package day0316;

public class Ex09ForGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2단부터 9단까지 출력
		 * [2단] [3단] [4단]  ... [9단]    - 단일 for
		 * 2x1=2 3x1=2 4x1=4              - 다중 for
		 * .
		 * .
		 * 2x9=18 
		 */

		
		   //단 출력 
			for(int dan=2;dan<=9;dan++)
			{
				System.out.print("["+dan+"단]\t");
			}
				System.out.println("\n"); //두 줄 띄우기

			for(int i=1;i<=9;i++)
			{
				for(int dan=2;dan<=9;dan++)
				{
				System.out.print(dan+"x"+i+"="+dan*i+"\t");
				}
				System.out.println();
			}
	}
}









