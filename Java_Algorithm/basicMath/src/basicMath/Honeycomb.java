package basicMath;

import java.util.Scanner;

/**
 * 백준 ) 벌집
 * 이웃하는 방에 돌아가면서
 * 1씩 증가하는 번호를 주소로
 * 매길 수 있다.
 * 숫자 N이 주어졌을 때, 벌집의
 * 중앙 1에서 N번 방까지 최소 개수의 방을
 * 지나서 갈 때 몇 개의 방을 지나는지 계산하는 프로그램.
 * @author 김한수
 *
 */
public class Honeycomb {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int count = 1;
		int i = 1;
		while(true) {
			if(n > 6 * i) {
				count++;
			} else {
				break;
			}
			i++;
		}
		System.out.println(count);
	}
}
