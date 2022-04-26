package day0315;

public class Ex3String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Happy"; //방법1
		String s2= new String("Apple"); //방법2
		System.out.println(s1);
		System.out.println(s2);
		
		int a=5,b=5;
		System.out.println(a==b); //비교 연산자 == 사용 
		System.out.println(s1==s2); //class타입에서는 주소 비교 (값을 비교해도 false가 나옴)
		//문자열에서 값이 같은지 비교하려면 equals라는 매서드 사용
		System.out.println(s1.equals("Happy"));
		System.out.println(s1.equals("happy"));
		
		//만약에 대소문자 상관없이 철자만 비교하고자 할 경우 .equalsIgnoreCase 사용하여 정확하게 비교한다.
		System.out.println(s1.equalsIgnoreCase("happy"));
		System.out.println(s2.equalsIgnoreCase("aPPle"));
		
		//문자열의 길이 구하기 .length
		System.out.println(s1.length()); //매서드이기 떄문에 괄호가 있음
		
		//문자열의 첫글자 구하기 .charAt(0)
		char startChar=s1.charAt(0);
		System.out.println(startChar);
	
		//전체를 무조건 대문자 또는 소문자로 출력 .toUpperCase/.toLowerCase
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s3="Have a Nice Day!!";
		System.out.println(s3.startsWith("Have")); //s3문자열이 Have로 시작할 경우, true (자동검색어 뜨는 경우)
		System.out.println(s3.endsWith("!")); //s3문자열이 !로 끝날 경우, true
		System.out.println(s3.startsWith("Happy"));
		System.out.println(s3.endsWith("*"));
		
		
	}

}









