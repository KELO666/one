package prac;


import structure.TreeNode;

/**
 * @author KELO
 * @date 2019/6/5 - 11:03
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if (root1==null||root2==null) return false;
        if (root1.val==root2.val){
            //如果找到了对应Tree2的根节点的点
            result = doesTree1HaveTree2(root1, root2);
        }
        if (!result){
            //如果找不到，那么就再去root的左儿子当作起点，去判断时候包含Tree2
            result = doesTree1HaveTree2(root1.left, root2);
        }
        if (!result){
            //如果还找不到，那么就再去root的右儿子当作起点，去判断时候包含Tree2
            result = doesTree1HaveTree2(root1.right, root2);
        }
        return result;
    }

    public boolean doesTree1HaveTree2(TreeNode node1,TreeNode node2){
        if (node2==null){
            //如果Tree2已经遍历完了都能对应的上，返回true
            return true;
        }
        if (node1==null){
            //如果Tree2还没有遍历完，Tree1却遍历完了。返回false
            return false;
        }
        if (node1.val!=node2.val){
            //如果其中有一个点没有对应上，返回false
            return false;
        }

        return doesTree1HaveTree2(node1.left, node2.left) && doesTree1HaveTree2(node1.right, node2.right);
    }

}
