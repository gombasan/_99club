package day07;

import java.util.Arrays;

public class KthNumber {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0] - 1;
			int end = commands[i][1];
			int pickNumber = commands[i][2] - 1;

			int[] temp = Arrays.copyOfRange(array, start, end);
			Arrays.sort(temp);

			answer[i] = temp[pickNumber];
		}

		return answer;
	}

}
