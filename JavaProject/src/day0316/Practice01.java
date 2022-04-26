package day0316;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 * 1부터 100사이의 난수를 변수 rnd에 저장 후 
	 * 그 숫자를 알아맞추는 프로그램을 작성하시오
	 * while문, if문, random 매서드 사용
	 * 
	 * (예)
	 *임의의 난수가 76이라고 가정, 
	 *(앞에 입력카운트를 출력하시오)
	 *1: 56
	 *56보다 큽니다
	 *2: 65
	 *65보다 큽니다
	 *3: 78
	 *78보다 작습니다
	 *4: 76
	 *맞았어요!! 정답은 76입니다(rnd값 출력)
	 *
	 *단, 10회 이내에 못 맞출 경우, "시간 초과!!" 출력후 프로그램 종료
	 */
		
		Scanner sc=new Scanner(System.in);
		
		//1에서 100사이 임의의 난수를 rnd에 저장
		int rnd= (int)(Math.random()*100)+1;
		int num,cnt=0;
		
		while(true) {
			System.out.print(++cnt + " : "); //카운트 입력 (n)
			num=sc.nextInt();	
			
			//1~100사이의 숫자를 입력하지 않은 경우 다시 입력
			if(num<1 || num>100) {
				System.out.println("1~100사이의 숫자가 아닙니다!!\n");
				continue;	
			}
			
			//비교연산
			if (rnd==num) {
				System.out.println("맞았어요!! 정답은 "+num+"입니다");
				break;
			}else if (rnd>num) {
				System.out.println(num+"보다 큽니다");
			}else {
				System.out.println(num+"보다 작습니다");
			}
			
			//10회이내 못 맞출 경우 
			if(cnt>=10) {
				System.out.println("시간 초과!!");
			break;}
			
			System.out.println();
		}		
	}

}
