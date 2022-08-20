package one_dimension_array;

import java.util.*;

/**
 * 백준 )
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
 * 그 다음 서로 다른 값이 몇 개 있는지 출력하는
 * 프로그램
 * @author 김한수
 *
 */
public class Remainder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<Integer> remainder = new HashSet<>();
		for(int i = 0; i < 10; i++) {
			remainder.add(in.nextInt() % 42);
		}
		in.close();
		System.out.println(remainder.size());
	}

}
