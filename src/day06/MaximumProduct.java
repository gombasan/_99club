package day06;

import java.util.Arrays;

public class MaximumProduct {
	public int solution(int[] nums) {
		Arrays.sort(nums);
		return (nums[nums.length - 2] - 1) * (nums[nums.length - 1] - 1);
	}
}
