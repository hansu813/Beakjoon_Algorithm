package function;

import java.util.ArrayList;
import java.util.List;

/**
 * 백준 ) 셀프 넘버 
 * 양의 정수 n이 주어졌을 때, 
 * 이 수를 시작해서 
 * n, d(n), d(d(n)), ...과 같은 
 * 수열을 만들 수 있다.
 * 
 * @author 김한수
 *
 */

public class SelfNumber {
	public static void main(String[] args) {
		List<Integer> selfNum = new ArrayList<>();
		for(int i = 0; i < 10001; i++) {
			int n = d(i);
			if(n < 10001) {
				selfNum.add(n);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < 10001; i++) {
			if(selfNum.contains(i)) {
				continue;
			}
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
	
	public static int d(int num) {
		int sum = num;
		while(num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
