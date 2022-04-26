package day0405;

//추상(abstract)메서드를 한개이상 포함한 경우
//반드시 클래스도 추상화시켜야한다. 
//abstract 클래스는 일반 메서드와 추상 메서드에서도 모두 구현이 가능하다

abstract class Parent
{
//	public void process()
//	{
//		System.out.println("부모가 딱히 하는일이 없음");
//	}
	
	public void title()
	{
		System.out.println("부모만이 하는일 처리");
	}
	
	//process가 하는일은 없지만 오버라이드를 위해서 메서드 존재는 필요한다
	abstract public void process(); //미완성의 메서드 (abstract:추상화)로 구현한다
}
/////////////////////////////////////////
class ChildA extends Parent
{
	//@Override
	public void process() {
		System.out.println("페인트칠을 합니다");
	}
}
/////////////////////////////////////////
class ChildB extends Parent
{
	//@Override
	public void process() {
	System.out.println("집안 청소를 합니다");
	}
}
/////////////////////////////////////////
public class Ex7Abstract {
	
	public static void process(Parent p)
	{
		//다형성 처리
		p.process(); //오버라이드된 메서드만 호출 가능 (예외:부모만 가진 경우도 호출 가능)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//process
		process(new ChildA());
		process(new ChildB());

	}

}
