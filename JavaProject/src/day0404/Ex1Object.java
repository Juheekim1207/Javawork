package day0404;

public class Ex1Object {
	
	//instance 멤버 변수 선언 
	public int score = 78; // 접근지정자는 default(같은 패키지내에서만 가능)
	
	//static 멤버 변수 
	public static int jungdap = 90;
	
	//static 메서드는 자기자신을 의미하는 this라는 인스턴스 변수가 없다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1Object ex1 = new Ex1Object(); //여러개의 변수를 선언할 수 있다
		ex1.score = 80;
		
		System.out.println(ex1.score);
		
		Ex1Object ex2 = new Ex1Object();
		ex2.score = 90;
		
		Ex1Object ex3 = new Ex1Object();
		ex3.score = 100;
		
		System.out.println(ex2.score);
		System.out.println(ex3.score);
		
		System.out.println(jungdap); //같은 클래스이므로 클래스명이 생략
		System.out.println(Ex1Object.jungdap);
	}

} 