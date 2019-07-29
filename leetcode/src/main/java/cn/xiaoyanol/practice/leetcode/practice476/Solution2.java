package cn.xiaoyanol.practice.leetcode.practice476;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-20
 * @Time: 下午6:06
 */
public class Solution2 {
    /**
     * 位运算 任何数和1 异或得到相反数
     * @param num
     * @return
     */
    public int findComplement(int num) {
        int temp = num, c = 0;
        while(temp > 0){
            temp >>= 1;
            c =  (c << 1) + 1;
        }
        return num ^ c;
    }
}
