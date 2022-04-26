package day0406;

public class Ex10Throws {

	public static void Test1(String su1, String su2) throws NumberFormatException
	{
		int sum = Integer.parseInt(su1)*Integer.parseInt(su2);
		System.out.println(su1 + "과 " + su2 + "의 곱한 값은" + sum + "입니다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Test1("4a","5");
			Test1("100","200");
			Test1("백","삼백"); //여기서 이셉션이 발생
			Test1("2","3"); //이부분은 실행 안됨
		}catch (NumberFormatException e){
			System.out.println("문자가 전달되었어요!!!" + e.getMessage());
		}
		
		System.out.println("**정상 종료**");
	}

}
