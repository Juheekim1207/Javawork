package day0317;

public class Ex06ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 100, -56, 67, 89, 230, -800, 32, 39, 69, 11, -9, 8, 25, 33, 77 };
		int max, min;
		// 최댓값, 최솟값 구하기

		max = data[0];
		min = data[0];

		for (int i = 1; i < data.length; i++) // 1과 비교부터 시작
		{
			if (max < data[i])
				max = data[i];

			if (min > data[i])
				min = data[i];
		}

		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);

	}
}
