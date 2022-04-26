package day0317;

import java.util.Scanner;

public class Ex11Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);	
		int x,y;
		int sum = 0;
		
		System.out.print("두개의 숫자 입력 : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		for(int i=x;i<=y;i++) {
			sum+=i;		
		}
		System.out.print(x+"부터 "+y+"까지 더한 값 : "+sum);
	
	}

}
