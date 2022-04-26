package day0405;

//interface는 상수와 추상 메서드만 구현이 가능하다
interface InterA
{
	int SPEED = 100; //final 상수임
	public void speedWrite(); //abstract 메소드임
}

//인터페이스를 구현하는 클래스
class My implements InterA
{
	@Override
	public void speedWrite() {
		// TODO Auto-generated method stub
		//SPEED = 120; //상수이므로 값변경 할수없음
		System.out.println("나의 스피드는" + SPEED + "입니다");
	}
}
public class Ex9Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterA a = new My();
		a.speedWrite();
	}

}
