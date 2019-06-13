package prac;

import java.util.Arrays;

/**
 * @author KELO
 * @date 2019/6/13
 *
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
 * 如果不存在则输出0。
 *
 * 先排序，若某个数字出现次数超过数组长度一半，则该数字必然是数组的中间元素。
 * 判断中间元素出现次数，大于一半则成立.
 */
public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int half = array.length/2;
        int count = 0;
        for (int i=0;i<array.length;i++){
            if (array[i]==array[half]){
                count++;
            }
        }
        if (count>half) return array[half];
        return 0;
    }

}
