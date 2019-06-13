package prac;

/**
 * @author KELO
 * @date 2019/6/4 - 17:45
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
        return Integer.toBinaryString(n).replaceAll("0", "").length();
    }

}
