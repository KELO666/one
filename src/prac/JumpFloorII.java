package prac;

/**
 * @author KELO
 * @date 2019/6/4 - 17:15
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 *        | 0       ,(n=0 )
 * f(n) = | 1       ,(n=1 )
 *        | 2*f(n-1),(n>=2)
 */
public class JumpFloorII {
    public int JumpFloorII(int target) {
        if (target <= 0){
            return 0;
        }
        if (target == 1){
            return 1;
        }
        return 2*JumpFloorII(target-1);
    }
}
