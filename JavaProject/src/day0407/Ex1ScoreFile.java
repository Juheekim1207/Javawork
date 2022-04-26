package day0407;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex1ScoreFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		BufferedReader br = null;
		int sum = 0, cnt = 0, score;
		double avg =0;
		
		try {
			fr = new FileReader("/Users/gimjuhui/bitjava0314/javawork/score.txt");
			br = new BufferedReader(fr);
			while(true)
			{
				String line = br.readLine();
				//null일 경우 while문 종료
				if(line == null)
					break;
				//입력한 점수를 계산이 가능한 int로 변환
				//만약 문자가 섞여있을 경우 0점 처리해보자
				try {
					score = Integer.parseInt(line);
				}catch (NumberFormatException e) { //숫자가 아닌경우
					score = 0;
				}
				score = Integer.parseInt(line);
				cnt++;//갯수 증가
				sum += score; //합계구하기
				System.out.printf("%5d",score);
			}
			//평균
			avg = (double)sum/cnt;
			System.out.println();
			System.out.println("갯수 :" + cnt);
			System.out.println("총점 :" + sum);
			System.out.println("평균 :" + avg);
			
		}catch(IOException e) { //reader인 경우에 FileNotFoundException
			System.out.println("파일을 찾을 수 없어요 : " + e.getMessage());
		}finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			}catch(IOException e){
				
			}
		}
	}

}
