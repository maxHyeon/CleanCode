package chapter01.section06.orr;

import java.util.Arrays;

public class NumberSortingTest2 {

	public static void main(String[] args) {
		int[] array = { 0, 3, 5, 2, 6, 7, 8, 9, 1, 4 };
		int[] sortedArray = new int[array.length];
		Arrays.sort(array);
		
		System.arraycopy(array, 0, sortedArray, 0, array.length);
		System.out.println("최종 결과");
		for (int num : sortedArray) {
			System.out.print(num + " ");
		}
	}
}
