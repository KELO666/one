package prac;

/**
 * @author KELO
 * @date 2019/6/4 - 16:47
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 *
 * 其实也是一个斐波那契数列
 */
public class JumpFloor {
    public int JumpFloor(int target) {
        int sum=0,a=1,b=2;
        if (target <= 0){
            return 0;
        }
        if (target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        for (int i=2;i<target;i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}
