package cn.xiaoyanol.practice.design.pattern.适配器模式;

/**
 * Created with IntelliJ IDEA.
 * Description: 员工信息接口
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 下午2:08
 */
public interface IUserInfo {
    // 获得用户姓名
    String getUsername();
    // 获得家庭地址
    String getHomeAddress();
    // 手机号码，这个太重要了，手机泛滥呀
    String getMobileNumber();
    // 办公电话，一般是座机
    String getOfficeTelNumber();
    // 这个人的职位是什么
    String getJobPosition();
    // 获得家庭电话，这个有点不好，我不喜欢打家庭电话讨论工作
    String getHomeTelNumber();
}
