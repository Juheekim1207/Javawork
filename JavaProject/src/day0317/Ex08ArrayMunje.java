package day0317;

import java.util.Scanner;

public class Ex08ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String []members= {"강소라", "이진", "강호동", "이효리","손미나"
				,"유재석","손철수","유미리","이제니","강민"};
		String name; //입력받을 이름
		int cnt; //인원수 구할 변수
		
		/*
		 * 검색할 이름 : 이진
		 *      이진님은 2번째에 있습니다. 
		 * 검색할 이름 : 이준
		 * 	    이준희님은 명단에 없습니다.
		 * 검색할 이름 : exit
		 * 	    **검색을 종료합니다.**
		 */
		
		
		while(true) {
			
			cnt=0; //초기값 설정 
			System.out.print("검색할 이름 : ");
			name=sc.nextLine();
			
			if(name.equalsIgnoreCase("exit")) //대소문자 상관없이 출력
			{
				System.out.println("**검색을 종료합니다**");
			    break;
			}
			
			for(int i=0;i<members.length;i++)
			{  
			    if(name.equals(members[i]))
			    {
					System.out.println("\t"+name+"님은 "+(i+1)+"번째 있습니다");
			    	cnt=1; //아래 조건문을 쓰기 위한 설정 값
			    	break;
			    }
				}
			
			if(cnt==0) 
				System.out.println("\t"+name+"님은 명단에 없습니다");
		    	System.out.println();
			
			}
			
			
			
		}
		
		
	}



