package day0315;

import java.util.Scanner;

public class Ex9Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int kor;//국어 점수
		String msg; //결과 메세지 
		//국어점수를 입력후 90이상이면 "Excellent!"라고 msg에 저장
		//80이상이면 "Good!!" 저장
		//90미만이면 "Try!!"라고 저장
		System.out.println(" 국어점수");
		kor=sc.nextInt();
		
		//if문으로 해보기
		if(kor>=90)
			msg="Excellent!!";	
		else if(kor>=80)
			msg="Good!!";			
		else
			msg="Try!!";
		
		System.out.println(kor+"=>"+msg);
		
		//조건 연산자로 해보기
		msg= kor>=90?"Excellent!!": kor>=80?"Good!!":"Try!!"; // kor가 90이상이면,Excellent를 msg로 줘라 
		System.out.println(kor+"=>"+msg);		
	}

}















