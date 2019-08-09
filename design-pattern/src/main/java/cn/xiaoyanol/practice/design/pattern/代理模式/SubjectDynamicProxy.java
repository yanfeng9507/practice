package cn.xiaoyanol.practice.design.pattern.代理模式;

import java.lang.reflect.InvocationHandler;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-08
 * @Time: 下午2:07
 */
public class SubjectDynamicProxy extends DynamicProxy{

    public static <T> T newProxyInstance(Subject subject) {
        // 获得ClassLoader
        ClassLoader loader = subject.getClass().getClassLoader();
        // 获得接口数组
        Class[] classes = subject.getClass().getInterfaces();
        // 获得handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, classes, handler);
    }
}
