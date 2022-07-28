package readertest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReaderTesk {
	public static void main(String[] args) {
		// 사용자에게 인덱스 번호와 문자열을 입력받아서
		// task.txt 파일에서 해당 인덱스 번호 다음줄에 해당 문자열을 삽입하여
		// 출력하고 저장하기
		// ex) 5, 안녕하세요
		// 6번째 줄에 안녕하세요가 삽입된 후 메모장에 저장되면 된다.
		
		
		File f = new File("tesk.txt");
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		String line = "";
		String[] strings = new String[9];

		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);

			for (int i = 0; i < 9; i++) {
				strings[i] = (line + br.readLine());
			}
			System.out.println("원하는 줄을 입력해주세요.");
			int input = sc.nextInt();
			sc.nextLine();
			System.out.println(strings[input - 1]);
			System.out.println("추가하실 문자열을 입력해주세요.");
			
			String input2 = sc.nextLine();
			sc.nextLine();
			try {
				fw = new FileWriter(f, true);
				bw = new BufferedWriter(fw);
				
				bw.write(strings[input] = (input2));
				
				for (int i = 0; i < strings.length; i++) {
					System.out.println(strings[i]+"\n");
				}
				
			}catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(bw != null)
						br.close();
					if(fw != null)
						fw.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}