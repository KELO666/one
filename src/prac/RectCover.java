package prac;

/**
 * @author KELO
 * @date 2019/6/4 - 17:29
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 * 其实找下规律，依旧是斐波那契数列
 */
public class RectCover {
    public int RectCover(int target) {
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
