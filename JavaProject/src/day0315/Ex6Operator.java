package day0315;

public class Ex6Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**증감연산자 연습**");
		int a=5,b=5,x,y;
		x=a++; //후치증감연산자 (마지막)
		y=++b; //전치증감연산자 (1순위)
		
		System.out.println(a+","+b); //6,6 ??
		System.out.println(x+","+y); //5,6
		
		a=b=x=3;
		y=++a+b--*++x; //y=4+3*4 // 16
		System.out.println(y);
		
		a=3;
		System.out.println(a++); // 3 (메모리:4)
		System.out.println(++a); // 5
		
		System.out.println("**대입연산자 연습**");
		a=5; //초기값!! 
		a+=3;
		System.out.println(a);//a=5+3 8
		a*=5;
		System.out.println(a);//a=8*5 40
		a-=2;
		System.out.println(a); // a=40-2 38
		a/=3;
		System.out.println(a); // a=38/3 12
		a%=5;
		System.out.println(a); // a=12%5 2
		
	}

}

