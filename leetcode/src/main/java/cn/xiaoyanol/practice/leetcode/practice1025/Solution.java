package cn.xiaoyanol.practice.leetcode.practice1025;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *游戏开始时，

 假设N=1，爱丽丝失败；

 假设N=2，她可以选择x=1，来使鲍勃遇到的N=2-1=1，无法操作，爱丽丝获胜；

 假设N=3，她只能选择x=1，鲍勃遇到的N=2，鲍勃获胜；

 假设N=4，她可以选择x=1，来使鲍勃遇到的N=3，爱丽丝获胜；

 ······

 奇数的因子只能是奇数，偶数的因子可以是奇数或偶数。

 点击应该能看到

 当爱丽丝遇到的N是偶数时，她总可以选到一个N的奇数因子x（比如1）， 使得传给对方的N-x为奇数，而对方遇到奇数N，只能选择N的奇数因子x， 又会将偶数的N-x传回给爱丽丝，最终爱丽丝会遇到N=2，然后获胜。
 当爱丽丝遇到的N是奇数时，只能传给对方偶数或无法操作(N=1)，无法获胜。

 * @Author: chenyanfeng
 * @Date: 2019-05-27
 * @Time: 下午7:20
 */
public class Solution {
    public boolean divisorGame(int N) {
        return N % 2 ==0;
    }
}
