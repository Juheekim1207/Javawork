package day0407;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ex3FileObject {
	public static final String FilENAME = "/Users/gimjuhui/bitjava0314/javawork/shop.txt";;
	
	public static void shopSave()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명");
		String sang = sc.nextLine();
		System.out.println("색상");
		String color = sc.nextLine();
		System.out.println("단가");
		int price = Integer.parseInt(sc.nextLine());
		
		//Shop 객체 생성
		Shop shop = new Shop(sang,color,price);
		
		//Object 단위로 저장하는 방법
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(FilENAME);
			oos = new ObjectOutputStream(fos);
			//object 단위로 저장하기
			oos.writeObject(shop);
			System.out.println("저장완료!!");
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) oos.close();
				if(fos != null) oos.close();
			} catch (IOException e) {
				
			}
		}
	}
	public static void shopRead()
	{
		System.out.println("파일에서 읽은 shop 데이터 출력");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(FilENAME);
			ois = new ObjectInputStream(fis);
			
			//파일에서 shop 단위로 읽기
			Shop shop = (Shop)ois.readObject();
			System.out.println("상품명:" + shop.getSang());
			System.out.println("색상:" + shop.getColor());
			System.out.println("단가:" + shop.getPrice());
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}finally {
			try {
				if(ois != null) ois.close();
				if(fis != null) fis.close();
			} catch (IOException e) {
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shopSave();
		shopRead();
	}

}
