package day0316;

public class Ex06MultiFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<=3;a++)
		{
			System.out.println("Hello!");
			for(int b=1;b<=4;b++)
			{
				System.out.print("\tKitty!");
			}
			System.out.println("*******");
		}
		System.out.println("---------------");
		for(int a=1;a<=3;a++)
		{
			System.out.println("Hello!");
			for(int b=1;b<=4;b++)
			{
				System.out.print("\tKitty!");
				if(b==2)
					break;
			}
			System.out.println("*******");
		}
		
			System.out.println("---------------");
			Loop:
			for(int a=1;a<=3;a++)
			{
				System.out.println("Hello!");
				for(int b=1;b<=4;b++)
				{
					System.out.print("\tKitty!");
					if(b==2)
						break Loop; //break 레이블; //바깥쪽 반복문을 빠져나온다
				}
				System.out.println("*******");
		}
	}

}




