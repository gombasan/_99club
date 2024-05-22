package day02;

import java.util.HashMap;
import java.util.Map;

public class NotCompleteRace {
	public String solution(String[] participants, String[] completions) {
		String answer = "";
		Map<String, Integer> participantCount = new HashMap<>();

		// 각 참가자의 이름을 카운트하여 맵에 저장
		for (String participant : participants) {
			participantCount.put(participant, participantCount.getOrDefault(participant, 0) + 1);
		}

		// 완주한 참가자의 카운트를 감소
		for (String completion : completions) {
			participantCount.put(completion, participantCount.get(completion) - 1);
		}

		// 카운트가 0이 아닌 참가자를 찾아 반환
		for (Map.Entry<String, Integer> entry : participantCount.entrySet()) {
			if (entry.getValue() != 0) {
				answer = entry.getKey();
			}
		}

		return answer;
	}
}
