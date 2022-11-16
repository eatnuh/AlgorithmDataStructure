package algorithm.math;

public class EuclideanAlgorithm {

    public int getGCD(int bigNum, int smallNum) {
        if(bigNum % smallNum == 0) return smallNum;
        else return getGCD(smallNum, bigNum % smallNum);
    }

}
