package prac;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author KELO
 * @date 2019/6/13
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 *
 * 排序，找前K个
 */
public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (input==null||k<1) return list;
        if (input.length<k) return list;
        Arrays.sort(input);
        for (int i=0;i<k;i++){
            list.add(input[i]);
        }
        return list;
    }
}
