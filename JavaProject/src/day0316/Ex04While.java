package day0316;

import java.util.Scanner;

public class Ex04While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 점수를 입력받아 총점과 평균과 입력받은 갯수를 구하시오
		 * 단, 점수가 1~100이 아닐경우 다시 입력(갯수에서 빠짐) //조건2
		 *     점수가 0일 경우 반복문 종료후 입력 //조건1
		 */
		Scanner sc=new Scanner(System.in); 
		int score, tot, cnt;
		double avg;
		//초기값 지정
		tot=cnt=0;
		
		while(true) 
		{
			System.out.println("점수 입력하기");
			score=sc.nextInt();
			if(score==0) 
				break;
			else if(score<0 || score>100) { //if도 가능 
				System.out.println("\t다시 입력 바람!!");
				continue; // 조건식으로 이동, 하던 작업을 멈추고 처음부터 다시시작
			}
			
			tot+=score; //조건이 성립된 후에 더하기 
			cnt++; //갯수 구하기
		}
		avg=(double)tot/cnt; //강제형변환
		System.out.println("총입력갯수 : "+cnt);
		System.out.println("총합계 : "+tot);
		System.out.printf("평균 : %7.2f",avg);

	}

}
