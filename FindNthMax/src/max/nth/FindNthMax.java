package max.nth;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class FindNthMax {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] numbers = {1, 45, 2, 44, -2, -453, 34, 5, 6};
			int nthMax = sc.nextInt();
			
			if (nthMax < 1 || numbers.length < nthMax) {
				System.err.println(nthMax + " is outside of the range of the array!");
				return;
			}
			
			TreeSet<Integer> maxNums = new TreeSet<Integer>((a, b) -> b - a);
			
			for (int index = 0; index < numbers.length; index++) {				
				maxNums.add(numbers[index]);
			}
			
			System.out.println(maxNums.toArray(new Integer[maxNums.size()])[nthMax - 1]);
			System.out.println(Arrays.toString(maxNums.toArray(new Integer[maxNums.size()])));
		}
	}

}
