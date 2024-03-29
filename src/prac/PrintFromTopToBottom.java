package prac;

import structure.TreeNode;

import java.util.ArrayList;

/**
 * @author KELO
 * @date 2019/6/7 - 12:27
 *
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印
 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        if (root==null) return list;
        TreeNode temp;
        queue.add(root);
        while (queue.size()!=0){
            temp = queue.remove(0);
            if (temp.left!=null){
                queue.add(temp.left);
            }
            if (temp.right!=null){
                queue.add(temp.right);
            }
            list.add(temp.val);
        }
        return list;
    }
}
