package cn.xiaoyanol.practice.leetcode.practice929;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-27
 * @Time: 上午11:48
 */
public class Solution {

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email: emails) {
            String[] split = email.split("@");
            String name = split[0].replace(".", "");
            int index = name.indexOf('+');
            if (index != -1) {
                name = name.substring(0, index);
            }
            set.add(name+split[1]);
        }
        return set.size();
    }
}
