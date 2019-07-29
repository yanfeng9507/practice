//package cn.xiaoyanol.practice.source.spring;
//
//import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * Created with IntelliJ IDEA.
// * Description:
// *
// * @Author: chenyanfeng
// * @Date: 2019-06-23
// * @Time: 下午5:26
// */
//public class Main {
//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
//        Object obj1 = applicationContext.getBean("student");
//        Object obj2 = applicationContext.getBean("&student");
//
//        System.out.println(obj1);
//        System.out.println(obj2);
//
//
//        MessageService bean = applicationContext.getBean(MessageService.class);
//        System.out.println(bean.sayHello());
//    }
//}
