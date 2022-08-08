package io;

import java.util.Scanner;
/**
 * 백준 ) 불기년도를 서기년도로 바꾸는 프로그램을 만드시오.
 * @author 김한수
 *
 */
public class AnnoDominiCast {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int y = scanner.nextInt();
		
		if(1000 <= y && y <= 3000) {
			System.out.println(y - 543);
		}
	}

}
