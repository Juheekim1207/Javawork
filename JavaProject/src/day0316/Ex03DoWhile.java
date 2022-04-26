package day0316;

public class Ex03DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println("while문");
		while(a<10) { //조건이 맞지 않기때문에 실행하지 않음
			System.out.println(a++);
		}
		
		a=10;
		System.out.println("do-while문");
		do { //먼저 실행후에 비교한다
			System.out.println(a++);
		}while(a<10);
		
		System.out.println("--------------");
		System.out.println("1부터 100까지 합계 구하기");
		a=0;
		int sum=0;
		while(++a<=100) {
			sum+=a; //sum=0+1=1, sum=1+2=3
		}
		System.out.println("총 합계 : "+sum);
		
		a=0;
		int esum=0, osum=0; //짝수합, 홀수합
		System.out.println("1부터 100까지 합 따로 구하기");
		while(++a<=100) {
			if(a%2==0) {
				esum+=a;
			}else {
				osum+=a;
			}
		}
		
		System.out.println("짝수 합계 : " + esum+"\n홀수 합계 : " + osum );
	}

}










