package day0315;

import java.util.Scanner;

public class Ex4Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //ctrl + 1 누르면 import 됨 
		String msg=""; //main함수의(지역변수)들은 자동 초기화가 안되기때문에 초기값을 설정하는게 좋음 (멤버변수가 없을 경우)
		System.out.println("당신의 이름을 입력하세요");
		msg=sc.nextLine(); // 입력한 한줄을 통째로 읽어온다 (문자열 타입)
		//msg=sc.next(); // 한 단어만 읽어온다 (공백 뒤에 문자는 생략됨)
		System.out.println("내 이름은 "+ msg + "입니다");
		
		int age;
		age=sc.nextInt(); //int 타입으로 읽어온다
		System.out.println("당신의 나이는?");
		System.out.println(msg + "님의 나이는" + age +"세 입니다.");

	} 

}
