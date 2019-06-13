package prac;

/**
 * @author KELO
 * @date 2019/6/7 - 12:49
 *
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class VerifySquenceOfBST {
    public static boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length==0) return false;
        if (sequence.length==1) return true;
        return judge(sequence,0,sequence.length-1);
    }

    public static boolean judge(int [] sequence,int start,int end){
        if (start>=end) return true;
        int root = sequence[end];
        int temp = end-1;
        //找到区分左右子树的结点
        while (temp>=1&&root < sequence[temp]){
            temp--;
        }
        //判断左子树是否都比根节点小
        for (int i=0;i<temp;i++){
            if (sequence[i]>root) return false;
        }
        //递归剩下的左右子树
        return judge(sequence, start, temp-1)&&judge(sequence, temp, end-1);
    }

    public static void main(String[] args) {
        int[] s = {4,8,6,12,16,14,10};
        int[] s1 = {5,4,3,2,1};
        System.out.println(VerifySquenceOfBST(s1));
    }

}
