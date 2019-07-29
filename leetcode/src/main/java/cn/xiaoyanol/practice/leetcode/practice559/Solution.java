package cn.xiaoyanol.practice.leetcode.practice559;


import cn.xiaoyanol.practice.leetcode.practice429.Node;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-20
 * @Time: 下午8:23
 */
public class Solution {
    /**
     * 递归查找
     * @param root
     * @return
     */
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int maxDepth = 0;
        if (root.children != null) {
            for ( int i = 0; i < root.children.size(); i++) {
                maxDepth = Math.max(maxDepth, maxDepth(root.children.get(i))) ;
            }
            maxDepth++;
        }
        return maxDepth;
    }
}
