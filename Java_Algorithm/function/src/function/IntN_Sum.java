package function;
/**
 * 백준 )
 * 정수 N개의 합
 * 정수 n개가 주어졌을 때, n개의 
 * 합을 구하는 함수를 작성하시오.
 * @author 김한수
 *
 */
public class IntN_Sum {
	public long Test(int[] a) {
		long sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
