package day0315;

import java.util.Scanner;

public class Practice02_T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3개의 숫자 a,b,c를 입력받아 가장 큰 수를 출력하시오
		// 예) 3개의 숫자 입력 / 3,5,7 / 가장 큰 숫자는 7입니다
		
		Scanner sc=new Scanner(System.in);
		int a,b,c,max;
		System.out.println("3개의 숫자를 입력하세요");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		//조건연산자(삼항연산자)
		max = a>b&&a>c?a : b>a&&b>c?b : c;
		System.out.println("가장 큰 숫자는 " + max + "입니다");		
	}

}
