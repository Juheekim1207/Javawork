package day0317;

import java.util.Scanner;

public class Ex02Munje_P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 맞출때까지 무한으로 돌리기
		/*
		 * 1번 문제에 추가하기 : 계속 이어서 다른 숫자 맞추기
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		// 1~100사이의 난수 출력

		Exit: while (true) {
			System.out.println("**게임을 시작합니다**");
			int rnd, num;
			int cnt = 0;
			char ans;

			rnd = (int) (Math.random() * 100) + 1;

			while (true) // 반복
			{
				System.out.print(++cnt + " : ");
				num = Integer.parseInt(sc.nextLine());

				if (rnd > num) {
					System.out.println(num + "보다 큽니다");
				} else if (rnd < num) {
					System.out.println(num + "보다 작습니다");
				} else {
					System.out.println("맞았어요!! 정답은 " + num + "입니다");
					
					while(true){
						System.out.println("**게임을 이어서 하시겠습니까?**");
						ans = sc.nextLine().charAt(0);
						if (ans == 'y' || ans == 'Y') {
							System.out.println("**새로운 난수를 생성합니다**");
							continue Exit;
						} else if (ans == 'n' || ans == 'N') {
							break Exit;
						} else {
							System.out.println("**잘못 입력하셨습니다**");
							continue;
						}	
					}

				}

			}
			
		}
		System.out.println("**프로그램을 종료합니다**");
	}
}
