package algorithm.math;

// 유클리드 호제법
public class EuclideanAlgorithm {
    public int getGCD(int bigNum, int smallNum) {
        if(bigNum % smallNum == 0) return smallNum;
        else return getGCD(smallNum, bigNum % smallNum);
    }

}
