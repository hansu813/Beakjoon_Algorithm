package function;

import java.util.Scanner;
/**
 * 백준 ) 한수
 * 어떤 양의 정수 n의 각 자리가 등차수열을 이룬다면,
 * 그 수를 한수라고 한다. 등차수열은 연속된
 * 두 개의 수의 차이가 일정한 수열을 말한다.
 * 한수의 개수를 출력하는 프로그램
 * @author 김한수
 *
 */
public class ArithmeticSequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(hansoo(in.nextInt()));
		in.close();
	}
	public static int hansoo(int number) {
		int count = 0;
		if(number < 100) return number;
		else {
			count = 99;
			for(int i = 100; i <= number; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if((hun - ten) == (ten - one)) {
					count++;
				}
			}
		}
		return count;
	}
}
