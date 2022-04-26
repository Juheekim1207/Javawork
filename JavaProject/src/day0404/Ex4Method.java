     package day0404;

public class Ex4Method {
	private String name;
	private int age;

	//setter method : 값 변경시 필요한 메서드 
	public void setName(String name) 
	{
		this.name = name; //인자가 같은 이름일 경우 멤버변수명 앞에 반드시 this를 붙인다
						  // 같은구역내 같은 이름이 없을 경우는 안써도됨
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	//getter method : 멤버변수 값을 반환하기 위한 메서드 
	public String getName()
	{
		return this.name; //this는 생략 가능 
	}
	public int getAge()
	{
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4Method ex1 = new Ex4Method();
		ex1.setName("이기자");
		ex1.setAge(25);
		
		Ex4Method ex2 = new Ex4Method();
		ex2.setName("강기자");
		ex2.setAge(30);
		
		System.out.println("이름 : " + ex1.getName());
		System.out.println("나이 : " + ex1.getAge());
		System.out.println();
		
		System.out.println("이름 : " + ex2.getName());
		System.out.println("나이 : " + ex2.getAge());
	}
}
