//class DivideString {
//
//    public int solution(String s) {
//        char prev = '1';
//        int same = 0, different = 0, answer = 0;
//        for (char c : s.toCharArray()) {
//            if (prev == '1') {
//                prev = c;
//                same++;
//                answer++;
//            } else if (prev == c) {
//                same++;
//            } else {
//                different++;
//            }
//
//            if (same == different) {
//                prev = '1';
//                same = 0; different = 0;
//            }
//        }
//
//        return answer;
//    }
//}

class DivideString {
    public int solution(String s) {
		char first = s.charAt(0);
		int firstNum = 0;
		int diff = 0;
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (firstNum == diff) {
				result++;
				first = s.charAt(i);
			}
			if (s.charAt(i) == first) firstNum++;
			else diff++;
		}
		return result;
    }
}

public class Test_04 {

	public static void main(String[] args) {
		DivideString divideString = new DivideString();
		System.out.println(divideString.solution("banana"));
		System.out.println(divideString.solution("abracadabra"));    // 6
		System.out.println(divideString.solution("aaabbaccccabba"));    // 3d
	}

}
