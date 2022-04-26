package day0404;

class Apple{ //같은 파일내 클래스가 여러개 올때 public은 패키지 이름과 동일한 클래스만 사용 가능
	//접근지정자 연습 (같은 패키지내에서는 private을 제외하고 모두 접근 가능)
	int a = 10;
	protected int b = 20;
	private int c = 30;
	public int d = 40;
	
	public final static String MESSAGE = "Hello";
}

public class Ex2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple a1 = new Apple();
		System.out.println(a1.a);
		System.out.println(a1.b);
		//System.out.println(a1.c); //error? private은 같은 클래스 내에서만 접근 가능 
		System.out.println(a1.d);
		
		System.out.println(Apple.MESSAGE); //static변수는 클래스명으로 호출 


	}

}
