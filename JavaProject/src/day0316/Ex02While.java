package day0316;

public class Ex02While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A~Z까지 대문자로 출력할 떄
		int a=65; //A
		while(true) 
		{
			System.out.println((char)a);
			a++; //출력 후 증가
			if(a>90) // 90=Z
				break; //91일때 빠져 나온다
		}
		System.out.println();
		char b='A';
		while(true) {
			System.out.println(b++); //A출력후 증가 
			if(b>'Z')
				break;
		}
		System.out.println();
	}

}
