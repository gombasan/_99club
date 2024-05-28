package day08;

import java.util.List;

public class CountPairs {

	public int solution(List<Integer> nums, int target) {
		int count = 0;
		for (int i = 0; i < nums.size(); i++) {
			for (int j = 0; j < i; j++) {
				if(nums.get(i) + nums.get(j) < target) {
					count++;
				}
			}
		}
		return count;
	}
}
