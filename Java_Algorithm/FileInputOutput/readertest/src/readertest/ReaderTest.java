package readertest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderTest {
	public static void main(String[] args) {
		File f = new File("tesk.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			
			for(int i = 0; i<9; i++)
			bw.write(i+1 + "번째 줄입니다. \n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( bw != null) bw.close();
				if( fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}