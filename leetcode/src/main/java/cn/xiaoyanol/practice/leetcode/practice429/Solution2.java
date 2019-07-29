package cn.xiaoyanol.practice.leetcode.practice429;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-19
 * @Time: 下午12:31
 */
public class Solution2 {
    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> res = new ArrayList<>();
        dfs(root, 0, res);
        return res;
    }

    private void dfs(Node root, int depth, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        if (result.size() < depth + 1) {
            result.add(new ArrayList());
        }
        result.get(depth).add(root.val);
        depth++;
        if (root.children != null) {
            for (Node node : root.children) {
                dfs(node, depth, result);
            }
        }
    }
}
