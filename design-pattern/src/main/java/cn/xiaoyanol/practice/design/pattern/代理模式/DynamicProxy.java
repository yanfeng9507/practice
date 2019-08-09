package cn.xiaoyanol.practice.design.pattern.代理模式;


import java.lang.reflect.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-08
 * @Time: 下午12:04
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader,
                                       Class<?>[] interfaces, InvocationHandler h) {
        // 寻找JoinPoint连接点，AOP框架使用元数据定义
        if (true) {
            // 执行一个签字通知
            (new BeforeAdvice()).exec();
        }
        return (T)java.lang.reflect.Proxy.newProxyInstance(loader, interfaces, h);
  }
}
