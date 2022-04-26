package day0315;

public class Ex2DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=127;
		byte b2=(byte)129; //강제로 구겨넣기 
		System.out.println(b1); //127 
		System.out.println(b2); //-127 마이너스 값 출력 (2의 보수)
		float f1=123.456789123f; //f를 붙이면 4바이트의 float으로 선언된다. 
		double d1=123.456789123454646545454; //소수점 포함 7자리까지는 float(마지막 자리 반올림)
								 //소수점 포함 15자리까지는 double
		System.out.println(f1);
		System.out.println(d1);
		
		boolean b=true;
		System.out.println(b);
		System.out.println(!b); 
		
		//printf는 변환기호를 이용해서 출력할 때 사용
		//정수:%d, 실수:%f, 문자:%c, 문자열%s
		System.out.printf("f1=%7.1f,d1=%7.2f", f1, d1);//소수점 한자리,두자리까지 준다.
		char ch='A';
		System.out.printf("\nch=%c\n",ch); // \n:엔터, \t:1탭 
		
		// "red","blue" ->이렇게 나오게 출력
		System.out.println("red"+"blue");
		
		//" 자체를 출력하려면 \" 이렇게 쓴다.
		System.out.println(" \"red\" + \"blue\" ");
	
		//파일의 경로를 나타낼때 /,\ 모두 가능 
		System.out.println("c:/image/sun.jpg");
		System.out.println("c:\\image\\sun.jpg"); // \는 두번 사용해야 함 
		
		
		
		
		
		
	}

}
