package day0315;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3개의 숫자 a,b,c를 입력받아 가장 큰 수를 출력하시오
		// 예) 3개의 숫자 입력 / 3,5,7 / 가장 큰 숫자는 7입니다
		
		Scanner sc=new Scanner(System.in);
		
		int a,b,c;
		int max;
		
		System.out.println("3개의 숫자를 입력하시오");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b&&a>c)
			max=a;
		else if(b>a&&b>c)
			max=b;
		else
			max=c;
		
		System.out.println("가장 큰 숫자는 " + max + "입니다");
		
		//삼항연산자
		max = a>b&&a>c?a : b>a&&b>c?b : c;
		System.out.println("가장 큰 숫자는 " + max + "입니다");	
		
		
		
		
	}

}
