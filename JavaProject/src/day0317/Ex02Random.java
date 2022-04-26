package day0317;

import java.util.Scanner;

public class Ex02Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 맞출때까지 무한으로 돌리기
		/*
		 * 1번 문제에 추가하기 : 계속 이어서 다른 숫자 맞추기
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int rnd, cnt, num;
		char ans;

		Exit: while (true) {
			System.out.println("*** 게임을 시작합니다 ***");
			cnt = 0;
			rnd = (int) (Math.random() * 100) + 1;

			while (true) {
				System.out.print(++cnt + " : ");
				num = Integer.parseInt(sc.nextLine()); // 뒤에 string타입이 나오기 때문에 enter를 인식하여 오류가 발생할 수 있어 문자열로 받고 int로
														// 변환시킨다.

				if (num > rnd) {
					System.out.println("\t" + num + "보다 작습니다");
				} else if (num < rnd) {
					System.out.println("\t" + num + "보다 큽니다");
				} else {
					System.out.println("***정답입니다. 정답은 " + rnd + "입니다***");
					System.out.println("***계속 하려면 y, 그만하려면 n을 눌러주세요**");

					ans = sc.nextLine().charAt(0); // 문자열 형태이므로 그중 첫 글자만 char로 얻는다
					if (ans == 'y' || ans == 'Y') {
						System.out.println("**새로운 난수를 발생합니다**");
						continue Exit; // 바깥 while문의 처음으로 이동
					} else {
						System.out.println("**프로그램을 종료합니다**");
						break Exit; // 바깥 while문을 빠져나가서 종료한다
					}

				}

			}
		}
		sc.close();

	}

}



