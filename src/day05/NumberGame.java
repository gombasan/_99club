package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberGame {

	public static void main(String[] args) {
		int[] solution = solution(new int[] {2,5});
		System.out.println(Arrays.toString(solution));
	}

	public static int[] solution(int[] nums) {
		int round = nums.length / 2;
		List<Integer> result = new ArrayList<>();
		List<Integer> alicePick = new ArrayList<>();
		List<Integer> bobPick = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				alicePick.add(nums[i]);
			} else {
				bobPick.add(nums[i]);
			}
		}

		for (int i = 0; i < round; i++) {
			result.add(bobPick.get(i));
			result.add(alicePick.get(i));
		}
		return result.stream().mapToInt(i -> i).toArray();
	}
}
