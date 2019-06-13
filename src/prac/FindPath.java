package prac;

import structure.TreeNode;

import java.util.ArrayList;

/**
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 *
 */
public class FindPath {
    private ArrayList<ArrayList<Integer>> rel = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        backtracking(root, target, new ArrayList<Integer>());
        return rel;
    }

    private void backtracking(TreeNode node, int target, ArrayList<Integer> path) {
        if (node==null) return;
        path.add(node.val);
        target -= node.val;
        if (node.left==null&&node.right==null&&target==0){
            rel.add(new ArrayList<>(path));
        }else {
            backtracking(node.left, target, path);
            backtracking(node.right, target, path);
        }
        path.remove(path.size()-1);//回退的时候记得弹出

    }
}
