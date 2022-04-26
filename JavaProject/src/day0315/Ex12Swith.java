package day0315;

import java.util.Scanner;

public class Ex12Swith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("n?");
		n=sc.nextInt();	
		switch(n) { //break를 만나지 않으면 아래까지 자동 실행
		case 1:
			System.out.println("One!!");
			break;
		case 2:
			System.out.println("Two!!");
			break;
		case 3:
			System.out.println("Three!!");
			break;
		default: //break 필요없음 (마지막이니까)
			System.out.println("1,2,3 제외!!");
		}
		
		sc.nextLine();
		
		String s;
		System.out.println("노랑,빨강,파랑중 입력");
		s=sc.nextLine();
		switch(s){ //7이후 버전은 문자열도 인식 가능
			case "노랑":
				System.out.println("노랑색은 희망의 색!!");
				break;
			case "빨강":
				System.out.println("빨강색은 정렬의 색!!");
				break;
			case "파랑":
				System.out.println("파랑색은 사랑의 색!!");
				break;
			default:
				System.out.println("모든색은 아름다워요!!");
		}
		
	}
}
