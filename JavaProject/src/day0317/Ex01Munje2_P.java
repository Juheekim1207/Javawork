package day0317;

import java.util.Scanner;

public class Ex01Munje2_P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int rnd, num;
		int cnt = 0;
		
		//1~100사이의 난수 출력 
		rnd = (int)(Math.random()*100)+1;
		
		
		while(true) //반복
		{	
			System.out.print(++cnt+" : ");
			num = sc.nextInt();
			
			if(rnd > num)
			{
				System.out.println(num+"보다 큽니다");
			}else if(rnd < num)
			{
				System.out.println(num+"보다 작습니다");
			}else {
				System.out.println("맞았어요!! 정답은 "+num+"입니다");
				System.out.println("**프로그램을 종료합니다**");
				break;
			}
			
			if(cnt >= 10)
			{
				System.out.println("시간 초과!!");
				break;
			}
		
		}
			sc.close();
	}

}
