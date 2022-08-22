package string;

import java.util.Scanner;

/**
 * 백준 ) 알파벳 찾기 
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
 * 각각의 알파벳에 대해 단어에 포함되어 있는 경우에는 
 * 처음 등장하는 위치를, 포함되지 않는 경우에는 
 * -1을 출력하는 프로그램.
 * 
 * @author 김한수
 *
 */
public class FindAlphabet {

	public static void main(String[] args) {
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int[] array = new int[alpha.length()];
		for(int i = 0; i < array.length; i++) {
			array[i] = -1;
		}
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < alpha.length(); j++) {
				if(s.charAt(i) == alpha.charAt(j)) {
					if(array[j] == -1)
					array[j] = i;
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
