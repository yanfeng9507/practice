package cn.xiaoyanol.practice.design.pattern.代理模式;

import java.lang.reflect.*;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 代理模式定义:
 * Provide a surrogate or placeholder for another object to control access to it
 * （为其他对象提供一种代理以控制对这个对象的访问）
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-08
 * @Time: 上午10:46
 */
public class Client {
//    public static void main(String[] args) {
//
//        // 定义一个痴迷的玩家
//        IGamePlayer player = new GamePlayer("张三");
//        // 开始打游戏，记下时间戳
//        System.out.println("开始时间是："+ new Date());
//        player.login("zhangSan", "password");
//        //开始杀怪
//        player.killBoss();
//        // 升级
//        player.upgrade();
//        // 记录结束游戏时间
//        System.out.println("结束时间是："+ new Date());
//
//    }

//    public static void main(String[] args) {
//
//        // 定义一个痴迷的玩家
//        IGamePlayer player = new GamePlayer("张三");
//        // 然后再定义一个代练者
//        IGamePlayer proxy = new GamePlayerProxy(player);
//        // 开始打游戏，记下时间戳
//        System.out.println("开始时间是："+ new Date());
//        proxy.login("zhangSan", "password");
//        //开始杀怪
//        proxy.killBoss();
//        // 升级
//        proxy.upgrade();
//        // 记录结束游戏时间
//        System.out.println("结束时间是："+ new Date());
//
//    }

//    public static void main(String[] args) {
//
//        // 定义一个痴迷的玩家
//        // 然后再定义一个代练者
//        IGamePlayer proxy = new GamePlayerProxy("张三");
//        // 开始打游戏，记下时间戳
//        System.out.println("开始时间是："+ new Date());
//        proxy.login("zhangSan", "password");
//        //开始杀怪
//        proxy.killBoss();
//        // 升级
//        proxy.upgrade();
//        // 记录结束游戏时间
//        System.out.println("结束时间是："+ new Date());
//
//    }

//    public static void main(String[] args) {
//
//        // 定义一个痴迷的玩家
//        IGamePlayer player = new GamePlayer("张三");
//
//        // 获得指定的代理
//        IGamePlayer proxy = player.getProxy();
//
//        // 开始打游戏，记下时间戳
//        System.out.println("开始时间是："+ new Date());
//        proxy.login("zhangSan", "password");
//        //开始杀怪
//        proxy.killBoss();
//        // 升级
//        proxy.upgrade();
//        // 记录结束游戏时间
//        System.out.println("结束时间是："+ new Date());
//
//    }

//    public static void main(String[] args) {
//
//        // 定义一个痴迷的玩家
//        IGamePlayer player = new GamePlayer("张三");
//
//        // 定义一个handler
//        InvocationHandler handler = new GamePlayIH(player);
//
//        // 开始打游戏，记下时间戳
//        System.out.println("开始时间是："+ new Date());
//
//        // 获得类的class loader
//        ClassLoader classLoader = player.getClass().getClassLoader();
//
//        // 动态产生一个代理者
//
//        IGamePlayer proxy = (IGamePlayer) java.lang.reflect.Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, handler);
//
//        proxy.login("zhangSan", "password");
//        //开始杀怪
//        proxy.killBoss();
//        // 升级
//        proxy.upgrade();
//        // 记录结束游戏时间
//        System.out.println("结束时间是："+ new Date());
//
//    }

    public static void main(String[] args) {

        // 定义一个主题
        Subject subject = new RealSubject();

        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        // 代理的行为
        proxy.doSomething("Finish");

        Object o = Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Hello!!!");
                Object invoke = method.invoke(subject, args);
                return invoke;
            }
        });

        Subject s = (Subject)o;
        s.doSomething("Test");


    }
}
