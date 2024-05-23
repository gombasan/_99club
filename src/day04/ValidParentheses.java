package day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	public static final Map<Character , Character> bracket = new HashMap<>();
	static {
		bracket.put(')', '(');
		bracket.put('}', '{');
		bracket.put(']', '[');
	}
	public boolean isValid(String s) {
		char[] charArray = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (char c : charArray) {
			if(bracket.containsKey(c)) {
				if(stack.empty()) {
					return false;
				} else {
					if(bracket.get(c) != stack.pop()){
						return  false;
					}
				}
			} else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}
}
