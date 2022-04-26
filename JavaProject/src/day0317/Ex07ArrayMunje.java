package day0317;

import java.util.Scanner;

public class Ex07ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String []members= {"강소라", "이진", "강호동", "이효리","손미나"
				,"유재석","손철수","유미리","이제니","강민"};
		String name; //입력받을 이름
		int cnt; //인원수 구할 변수
		/*
		 * 문제 : 성을 입력하면 해당 성을 가진 사람을 출력하고
		 * 총 몇명인지 출력하기
		 * (예) 검색할 성
		 *      1:이진
		 *      2:이효리
		 *      8:이제니
		 *   검색할 성 : 박
		 *   박씨성은 없음
		 *   검색할 성 : 끝 
		 *   ***종료합니다**
		 *   
		 *   
		 *  String의 startsWith 사용 
		 *  끝은 equals 사용
		 */
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
			{
		//성입력 
		   cnt=0;
		   System.out.print("검색할 성 ");
		   name=sc.nextLine();
		   
		//종료
		if(name.equals("끝"))
		{
			System.out.println("**프로그램을 종료합니다**");
			break;
		}
		
		//배열 돌리기
		   for(int i=0;i<members.length;i++)
		   {
			   if(members[i].startsWith(name)) 
			   { //해당 성으로 실행할 경우 true
				System.out.println(i+" : "+members[i]);
			    cnt++;
			    }
		   }
		   
		   if(cnt==0) //위 조건이 한번도 성립되지 않았을 경우 
		   {
			   System.out.println(name+"성은 없음");
		   }else {
			   System.out.println("총 "+cnt+"명");
			System.out.println();
		   }
		   sc.close();	
		}
	}
}

