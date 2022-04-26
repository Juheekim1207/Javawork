package day0316;

public class Ex11Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 임의의 수(랜덤) 구하는 방법 2가지
		 * Math.random //static 일땐 직접 호출 가능 (new없이)
		 * Random 클래스
		 */
		
		for(int i=1;i<=5;i++)
		{
			double a=Math.random();
			System.out.println(a);
		}
		
		System.out.println("**0부터 9사이의 난수 구하기");
		for(int i=1;i<=5;i++)
		{
			int a=(int)(Math.random()*10);
			System.out.println(a);
		}
		System.out.println("**0부터 99이의 난수 구하기");
		for(int i=1;i<=5;i++)
		{
			int a=(int)(Math.random()*100);
			System.out.println(a);
		}
		System.out.println("**1부터 100사이의 난수 구하기");
		for(int i=1;i<=5;i++)
		{
			int a=(int)(Math.random()*100)+1;
			System.out.println(a);
		}
		System.out.println("**임의의 알파벳 A~Z 구하기"); //65~90 출력후 char
		for(int i=1;i<=5;i++)
		{
			int a=(int)(Math.random()*26)+65; //길이 곱하기 시작하는 값만큼 밀기
			System.out.println((char)a);
		}

	}

}
