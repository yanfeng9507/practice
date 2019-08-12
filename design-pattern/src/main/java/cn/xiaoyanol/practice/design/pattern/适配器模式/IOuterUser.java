package cn.xiaoyanol.practice.design.pattern.适配器模式;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 下午2:16
 */
public interface IOuterUser {
    // 基本信息，比如名称、性别、手机号码等
    Map getUserBaseInfo();
    // 工作区域信息
    Map getUserOfficeInfo();
    // 用户的家庭信息
    Map getUserHomeInfo();
}
