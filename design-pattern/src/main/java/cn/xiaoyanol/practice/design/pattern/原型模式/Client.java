package cn.xiaoyanol.practice.design.pattern.原型模式;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *  原型模式:
 *  Specify the kinds of objects to create using a prototypical instance, and create new objects
 *  by copying this prototype.
 *  用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-08
 * @Time: 下午3:06
 */
public class Client {
    // 发送账单的数量，这个值是从数据库中获得

    private static int MAX_COUNT = 6;

    public static void main(String[] args) throws CloneNotSupportedException {
        // 模拟发送邮件
        int i = 0;
        // 把模板定义出来，这个是从数据库中获得
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
            // 以下是每封邮件不同的地方
            Mail cloneMail = mail.clone();
            mail.setAppellation(getRandString(5)+" 先生（女士）");
            mail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
            // 然后发送邮件
            sendMail(mail);
            i++;
        }
    }

    // 发送邮件
    public static void sendMail(Mail mail) {
        System.out.println("标题："+mail.getSubject()+"\t收件人："+mail.getReceiver()+"\t...发送成功！");
    }


    public static String getRandString(int maxLength) {
        String source = "abdcefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
