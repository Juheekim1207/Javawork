package day0317;

public class Ex03Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch; // 배열 선언 (메모리 할당 없음)
		ch = new char[4]; // 0이 초기값으로 들어감

		System.out.println("length=" + ch.length);

		System.out.println("**초기값 출력**");
		for (int i = 0; i < ch.length; i++) { // 같다(=)를 주면 절대 안됨!!!
			System.out.println((int) ch[i]);
		}
		ch[0] = 'A';
		ch[1] = 67; // C
		ch[2] = 90; // Z
		ch[3] = '*';

		System.out.println("**배열 출력 방법 1");
		for (int i = 0; i < ch.length; i++) {
			System.out.printf("%3c", ch[i]); // c=char , 3칸 띄우고 출력
		}

		System.out.println();
		System.out.println("**배열 출력 방법 2");
		for (char a : ch) // 배열 횟수만큼 자동으로 돈다
			System.out.printf("%3c", a);
	}

}












