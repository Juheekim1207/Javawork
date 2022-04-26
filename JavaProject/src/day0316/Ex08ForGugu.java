package day0316;

import java.util.Scanner;

public class Ex08ForGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 구구단 숫자를 입력받아 해당단을 출력하시오
		 * 단 0입력시 종료
		 * while문 안에 for문을 이용해서 구구단 출력
		 */
		
	Scanner sc=new Scanner(System.in);
	int dan;
	
	while(true) 
	{	
		//구구단 입력
		System.out.println("구구단 입력");
		dan=sc.nextInt();
		
		//0일 경우 break
		if(dan==0)
			break;
		//2~9가 아닐경우 다시 입력(continue)
		if (!(2<=dan && dan<=9))// (dan<2 || dan>9)
		{	System.out.println("**다시 입력해주세요**");
			continue;//다시 처음으로
		}
		
	    //단 제목 출력
			System.out.println(dan+"단");
		//for문을 이용해서 구구단 출력 
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan+"X"+i+"="+dan*i);	
		}
			System.out.println();
		}
	}

}
