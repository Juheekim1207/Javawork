package day0405;

class Fruit{
	private int danga;
	
	public Fruit() {
		// TODO Auto-generated method stub
		danga = 1000;
	}
	
	Fruit(int danga)
	{
		this.danga = danga;
	}
	
	public int getDanga() {
		return danga;
	}
}

//////////////////////////////////
class Orange extends Fruit
{
	private String name;
	
	public Orange() {
		name = "오렌지";
	}
	
	Orange (String name)
	{
		this.name = name;
	}
	
	Orange (String name,int danga)
	{
		super(danga);
		this.name = name;
	}
	
	public void write()
	{
		System.out.println("과일명 : " + name + ", 단가 : " + this.getDanga());
	}
}

public class Ex5Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange[] or = new Orange[3];
		or[0] = new Orange();
		or[1] = new Orange("키위");
		or[2] = new Orange("딸기",3000);
		
		for(Orange o:or)
		{
			o.write();
		}

	}

}











