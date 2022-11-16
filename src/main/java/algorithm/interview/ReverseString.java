package algorithm.interview;

// 문자열 뒤집기
public class ReverseString {

    // 간단한 방법
    public String reverseSimply(String origin) {
        String reversed = "";
        for(int i = 0; i < origin.length(); i++) {
            reversed = origin.charAt(i) + reversed;
        }

        return reversed;
    }

    // 재귀로 뒤집기
    // 꼬리재귀 X 콜스택이 계속쌓임 stackoverflow
    public String reverseByRecursion(String origin) {
        int len = origin.length();
        if(len == 0) return "";

        String forward = origin.substring(0, len - 1);
        String last = origin.substring(len - 1);

        return last + reverseByRecursion(forward);
    }

    // 꼬리재귀로 뒤집기
    // 콜스택이 쌓이는 문제 해결
    // String = immutable 이므로 호출 떄마다 객체생성 -> gc 대상 증가
    public String reverseByTailRecursion(String origin) {
        return doReverseByTailRecursion("", origin);
    }

    private String doReverseByTailRecursion(String cur, String remain) {
        int len = remain.length();
        if(len == 0) return cur;

        String forward = remain.substring(0, len - 1);
        String last = remain.substring(len - 1);

        return doReverseByTailRecursion(cur + last, forward);
    }

    // 꼬리재귀 + StringBuilder 사용
    // 콜스택이 쌓이는 문제 해결
    // StringBuilder로 객체생성 반복 해결
    public String reverseByTailRecursionAndStringBuilder(String origin) {
        return doReverseByTailRecursionAndStringBuilder(new StringBuilder(), new StringBuilder(origin));
    }

    private String doReverseByTailRecursionAndStringBuilder(StringBuilder cur, StringBuilder remain) {
        int len = remain.length();
        if(len == 0) return cur.toString();

        char lastChar = remain.charAt(len - 1);
        remain.deleteCharAt(len - 1);


        return doReverseByTailRecursionAndStringBuilder(cur.append(lastChar), remain);
    }

}
