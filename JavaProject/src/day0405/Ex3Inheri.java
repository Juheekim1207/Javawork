package day0405;

class Apple{ //부모클래스 
	private void methodA()
	{
		System.out.println("super 메서드 A");
	}
	
	public void methodB()
	{
		System.out.println("super 메서드 B");
	}
}

//////////////////////
class Banana extends Apple //실제로 호출 가능한 변수 methodB, methodC
{
	public void methodC()
	{
		System.out.println("sub 메서드 C");
	}
}

public class Ex3Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana b = new Banana();
		b.methodB(); //상속된 메서드
		b.methodC();

	}

}
