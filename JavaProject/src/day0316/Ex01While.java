package day0316;

public class Ex01While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		while(++a<=5) { //증가후에 비교
			System.out.println(a); //1,2,3,4,5 
		}
		System.out.println("빠져나온 후의 a값 : " +a); //6
	
		a=0;
		while(a++<=5) { //비교후에 증가 
			System.out.println(a); //1,2,3,4,5,6
		}
		System.out.println("빠져나온 후의 값 : "+a);
		
		a=0;
		while(true) { //조건문은 무조건 true로
			System.out.println(++a);
			if(a==5)
				break; //a가 5가되면 while문을 빠져나온다
		}
		System.out.println("빠져나온 후의 값 : "+a);		
	}
}
