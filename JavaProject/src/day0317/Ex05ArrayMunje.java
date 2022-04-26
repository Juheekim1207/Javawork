package day0317;

public class Ex05ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 56, 67, 79, 89, 100 };
		int sum = 0; // 합계 구할 변수
		double avg; // 합계 구할 평균

		// for문에서 sum 구하기

		// 방법 1
		/*
		 * for(int i=0;i<data.length;i++) sum+=data[i];
		 */

		// 방법 2
		for (int n : data)
			sum += n;

		// avg구하기
		avg = (double) sum / data.length; // int를 double타입으로 형변환해준다

		// 출력
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
