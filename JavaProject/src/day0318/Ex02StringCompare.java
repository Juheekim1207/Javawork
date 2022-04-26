package day0318;

public class Ex02StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Apple".compareTo("Apple")); //같을 경우 0 (CompareTo=equals)
		System.out.println("Apple".compareTo("Banana")); // -1
		System.out.println("Hello".compareTo("Hi")); // (아스키코드표를 보고)e와 i의 차이 값 출력 // -4
		System.out.println("Hello".compareTo("Apple")); //7 A~H까지의 차이
		
	}

}
