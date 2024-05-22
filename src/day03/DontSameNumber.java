package day03;

import java.util.Stack;

public class DontSameNumber {
	public int[] solution(int []arr) {
		Stack<Integer> stack = new Stack<>();

		for (int num : arr) {
			// 스택이 비어있거나 스택의 마지막 숫자와 현재 숫자가 다르다면 스택에 추가
			if (stack.isEmpty() || stack.peek() != num) {
				stack.push(num);
			}
		}

		// 스택에 저장된 숫자들을 배열로 변환
		int[] answer = new int[stack.size()];
		for (int i = stack.size() - 1; i >= 0; i--) {
			answer[i] = stack.pop();
		}

		return answer;
	}
}
