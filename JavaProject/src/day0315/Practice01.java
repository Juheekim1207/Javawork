package day0315;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상품명과 갯수, 금액을 입력받아 계산해야 할 총 금액을 출력하는데 
		//만약 5개 이상일 경우, 총 금액의 10%를 DC한 금액으로 출력하시오
		// 예) 상품명 사과, 수량 6, 단가 1000
		//    총 금액은 10% DC한 5400원 입니다 (if문 사용)
		
		Scanner sc=new Scanner(System.in);
		
		String name; //상품명
		int num,money,total;// 갯수, 금액
		
		System.out.println("상품명을 입력하시오");
		name=sc.nextLine();
		
		System.out.println("수량을 입력하시오");
		num=sc.nextInt();
		
		System.out.println("단가를 입력하시오");
		money=sc.nextInt();
		
		System.out.println();
		
		System.out.println("상품명 \n" + name);
		System.out.println("수량 \n" + num);
		System.out.println("단가 \n" + money);
		
		total=num*money;
		if (num>=5){
			System.out.println("총 금액은 10% DC한 " + (int)(total*0.9) + "원입니다");
		}else {
		System.out.println("총 금액은 " + total + "원입니다");
		}
		}

}
