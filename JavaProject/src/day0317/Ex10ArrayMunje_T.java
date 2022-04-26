package day0317;

public class Ex10ArrayMunje_T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []lotto=new int[6];
		/*
		 * lotto 배열에 1~45 사이의 난수 6개를 넣은 후 출력하기
		 * 
		 * 단, 중복 숫자가 있으면 안됨
		 */
		
		
		
		for(int i=0;i<lotto.length;i++) 
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) 
			{
			if(lotto[i]==lotto[j])
				  continue;
			lotto[j]=(int)(Math.random()*45)+1;
			}
		}
		
		for(int i=0;i<lotto.length;i++)
			System.out.println(lotto[i]);
	}

}
