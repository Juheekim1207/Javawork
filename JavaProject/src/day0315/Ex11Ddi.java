package day0315;

import java.util.Scanner;

public class Ex11Ddi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year;
		String ddi;
		//태어난 년도를 입력하면 해당하는 띠를 출력하는 프로그램 구현
		//if로 먼저 구하고 조건 연산자로도 구하기
		//힌트 : 서기 1년은 닭띠이다
		
		System.out.println("태어난 년도를 입력하세요");
		year=sc.nextInt();
		
		if(year%12==0)
			ddi="원숭이띠";
		else if(year%12==1)
			ddi="닭띠";
		else if(year%12==2)
			ddi="개띠";
		else if(year%12==3)
			ddi="돼지띠";
		else if(year%12==4)
			ddi="쥐띠";
		else if(year%12==5)
			ddi="소띠";
		else if(year%12==6)
			ddi="호랑이띠";
		else if(year%12==7)
			ddi="토끼띠";
		else if(year%12==8)
			ddi="용띠";
		else if(year%12==9)
			ddi="뱀띠";
		else if(year%12==10)
			ddi="소띠";
		else
			ddi="양띠";
		
		System.out.println(year + "년생은 " + ddi + "입니다");
	
		
		//조건연산자를 이용해서 구하기
		int a=year%12;
		ddi= a==0? "원숭이띠" : a==1?"닭띠": a==2?"개띠": 
			 a==3?"돼지띠": a==4?"쥐띠": a==5?"소띠": 
			 a==6?"범띠": a==7?"토끼띠": a==8?"용띠": 
			 a==9?"뱀띠": a==10?"말띠": "양띠";
				 
		System.out.println(year + "년생은 " + ddi + "입니다");					
	}
}
