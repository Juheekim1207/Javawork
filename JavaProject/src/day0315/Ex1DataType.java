package day0315;

public class Ex1DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본형 연습 
		char ch='A';//char는 문자를 주어도 10진수로 변환되어 인식함 (아스키코드표 참고)
		char ch2='가';
		char ch3=67;//'C'출력 
		char ch4=(char) (ch3+2); //char + int = int (묵시적 형변환) -> 강제로 char타입으로 변환 
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch3+2);// char + int = int (묵시적 형변환) 69출력 
		System.out.println((char)(ch3+2)); // E 출력 
		
		int a=7;
		int b=4;
		System.out.println(a+b);
		System.out.println(a/b); // 결과도 int가 되어 소수점 자리수가 잘림 
		System.out.println((double)a/b); // a를 계산할 때만 double로 변환하여 계산, b앞에 붙여도 무관 
		//System.out.println((double)(a/b); (a/b)값이 1.0이기 때문에 계산 후에 타입 변환해도 1만 출력됨
		
	} 

}
