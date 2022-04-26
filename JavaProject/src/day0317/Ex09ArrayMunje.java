package day0317;

public class Ex09ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 int []score= {67,89,78,89,100};
		 int []rank=new int[5];
		
		 /*
		 *점수에 대한 등수 출력하기
		 *
		 *출력양식
		 *
		 *번호   점수    등수
		 *1      67     5 
		 *2      89     2
	 	 *3      78     4
		 *4
		 *
		 */
		 //등수는 다중 for 문 
		
		 	 
		//등수구하기 (상대방과 비)
			 
		 for(int i=0;i<score.length;i++) 
		 {    
			 rank[i]=1; //1등으로 시작해서 하나씩 밀림
			 for(int j=0;j<score.length;j++)
			 {
				 //상대방의 점수(j)가 나의 점수(i)보다 높으면 
				 //나의 등수를 1 증가 시킨다
				if(score[i]<score[j]) //i=자기자신 ,j=비교하는 상대방 
				rank[i]++; //내 등수 
			 }
		 }
		 System.out.println("\t\t성적 출력\n");
		 System.out.println("번호\t점수\t등수");
		 System.out.println("-----------------------");
		 
		 //점수 출력하기
		 for(int i=0;i<score.length;i++) //
		 { 
			 System.out.println(i+1+"\t"+score[i]+"\t"+rank[i]);
		 }
		 }
		 
		 
		 

	}


