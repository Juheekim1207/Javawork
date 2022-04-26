package day0318;

public class Ex01ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,5,1,4,2};
		//selection sort
		
		//오름, 내림 차순으로 정리 
		//temp = templete
		
		int min;
		
		for(int i=0; i<data.length-1; i++)
		{	
			for(int j=i+1; j<data.length; j++)
			{
				//기준값(i)이 더 클 경우 서로 바꾼다(오름차순 기준)
				//if(data[i] > data[j])
				
				//내림차순으로 정렬하고자 하는 경우
				if(data[i] < data[j])
				{
					//임시변수를 이용해서 변수 안의 값만 바꾼다
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		//출력
		for(int i=0; i<data.length; i++)
		{
			System.out.println(i + "=>" + data[i]);
		}
	}

}
