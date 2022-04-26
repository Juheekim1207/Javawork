package day0315;

import java.util.Scanner;

public class Ex7Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술연산자 : +,-,*,/,%
		//급여를 입력후 만원, 천원, 백원, 십원, 일원의 갯수를 구분하여 출력하시오
		int money;
		Scanner sc=new Scanner(System.in);
		System.out.println("급여를 입력하세요");
		money=sc.nextInt();
		System.out.println("나의 월급여: "+ money +"원");
		System.out.println("만원: "+ money/10000);
		System.out.println("천원: "+ money%10000/1000);
		System.out.println("백원: "+ money%1000/100);
		System.out.println("십원: "+ money%100/10);
		System.out.println("일원: "+ money%10);
				
	}

}
