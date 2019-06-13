package prac;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KELO
 * @date 2019/6/4 - 18:51
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class reOrderArray {
    public static void reOrderArray(int [] array) {
        int n = 0;
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<array.length;i++){
            if ((array[i]%2)==1){
                //奇数
                list.add(array[i]);
            }
        }
        for (int i=0;i<array.length;i++){
            if ((array[i]%2)==0){
                //偶数
                list.add(array[i]);
            }
        }
        for (Integer index : list) {
            array[n] = index;
            n++;
        }
    }

    public static void main(String[] args) {
        int[] array = {2,5,6,4,7,9};
        reOrderArray(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
