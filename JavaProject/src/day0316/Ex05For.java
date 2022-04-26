package day0316;

public class Ex05For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		for(a=1;a<=5;a++) //;붙이지 않아야 값이 제대로 나온다
		{
			System.out.printf("%3d",a); //3칸 단위로 출력
		}
		System.out.println();
		/*
		for (a=5;a>=1;a--)
		{
			System.out.printf("%3d",a);
		System.out.println();
		/*
		for (a=1;a<=20;a+=3)
		{
			System.out.printf("%3d",a);
		}
		System.out.println();
		*/
		System.out.println("1부터 100까지중 짝수의 합 구하기");
		int sum=0;
		for(a=1;a<=100;a++)
		{
			if(a%2==1)
				continue; //홀수인경우 a++로 이동
			else
				sum+=a;
		}
		System.out.println(sum);

	}

}
  //계속도는 이유?
