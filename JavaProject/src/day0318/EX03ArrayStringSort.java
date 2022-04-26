package day0318;

public class EX03ArrayStringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"한가인", "강호동", "유재석", "Adams","한경"};
		for(int i=0; i<names.length-1; i++)
		{
			for(int j=i+1; j<names.length; j++)
			{
				//i번지값이 작을 경우 -값이 나오므로
				//더 클 경우에만 변경(양수값)
	
				if(names[i].compareTo(names[j]) > 0) //j가 우선일 경우 
				{
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}

		//출력
		for(int i=0; i<names.length; i++)
		{
			System.out.println(i + "=>" + names[i]);
		}
	}

}
