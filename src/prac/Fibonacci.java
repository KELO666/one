package prac;

/**
 * @author KELO
 * @date 2019/5/30 - 8:41
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Fibonacci {
    int sum=0,a=1,b=1;
    public int Fibonacci(int n) {
        if (n==0){
            return 0;
        }
        if (n==1||n==2){
            return 1;
        }
        for(int i=2;i<n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }

}