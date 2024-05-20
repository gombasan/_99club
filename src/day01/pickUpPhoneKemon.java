package day01;

import java.util.Arrays;

public class pickUpPhoneKemon {
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,4};
		int i = pickUp(nums);
		System.out.println(i);
	}

	private static int pickUp(int[] nums) {
		int pickupNum = nums.length / 2;
		long distinctNums = Arrays.stream(nums).distinct().count();
		return (int) Math.min(pickupNum, distinctNums);
	}
}