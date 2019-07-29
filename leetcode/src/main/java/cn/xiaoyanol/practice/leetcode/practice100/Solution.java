package cn.xiaoyanol.practice.leetcode.practice100;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-08
 * @Time: 上午11:28
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        StringBuffer pString = new StringBuffer();
        StringBuffer qString = new StringBuffer();
        print(p, pString);
        print(q, qString);
        return pString.toString().equals(qString.toString());
    }

    private void print(TreeNode p, StringBuffer stringBuffer) {
        if (p != null && stringBuffer != null) {
            stringBuffer.append(p.val);
        }
        if (p == null && stringBuffer != null) {
            stringBuffer.append("#");
            return;
        }
        print(p.left, stringBuffer);
        print(p.right, stringBuffer);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
//        treeNode.left = new TreeNode(2);
//        treeNode.right = new TreeNode(3);

        TreeNode treeNode1 = new TreeNode(1);
        System.out.println(        new Solution().isSameTree(treeNode, treeNode1));

    }
}
