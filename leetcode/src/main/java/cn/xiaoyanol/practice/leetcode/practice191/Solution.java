package cn.xiaoyanol.practice.leetcode.practice191;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-16
 * @Time: 下午7:45
 */
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n >> 1;
            count++;
        }
        return count;
    }


//    //除K取余法
//    int hammingWeight(int n) {
//        int ans=0;
//        while(n)
//        {
//            ans+=n%2;
//            n>>=1;
//        }
//        return ans;
//    }
//    //直接判断二进制最低为的数是不是1
//    int hammingWeight(int n) {
//        int ans=0;
//        while(n)
//        {
//            ans+=n&1;
//            n>>=1;
//        }
//        return ans;
//    }
//    //技巧：直接去掉二进制中位置最靠后的1
////可以分情况讨论n末尾是1还是0来验证这个算法
//    int hammingWeight(int n) {
//        int ans=0;
//        while(n)
//        {
//            ans++;
//            n&=n-1;
//        }
//        return ans;
//    }
}
