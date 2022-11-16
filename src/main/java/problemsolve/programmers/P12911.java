package problemsolve.programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/12911
public class P12911 {
    public int solution(int n) {
        int s = n & -n;
        int r = n + s;

        return r | (((n ^ r) >> 2) / s);
    }

}
