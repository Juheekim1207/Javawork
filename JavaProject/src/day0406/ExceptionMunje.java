package day0406;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMunje {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("/Users/gimjuhui/bitjava0314/javawork/score.txt");
			br = new BufferedReader(fr);
			String s, str="";
			int cnt = 0; 
			int sum = 0;
			int num;
			
			while(true) 
			{
				s = br.readLine();
				if(s == null)
					break;
				str += s + " ";
				num = Integer.parseInt(s);
				cnt++;
				sum += num;
			}
								
			System.out.println("점수들: \n" + str);
			System.out.println("\n총 "+ cnt + "개");
			System.out.println("총점 : "+ sum + "점");
			System.out.println("평균 :  "+ (sum/(double)cnt) + "점");
					
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없어요:" + e.getMessage());
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch(IOException e) {
			}
		}	
	}
}
