package cn.xiaoyanol.practice.design.pattern.原型模式;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-08
 * @Time: 下午3:04
 */
@Data
public class Mail implements Cloneable{

    // 收件人
    private String receiver;

    // 邮件名称
    private String subject;

    // 称谓
    private String appellation;

    // 邮件内容
    private String context;

    // 邮件的尾部，一般都是加上"XXX版权所有"等信息
    private String tail;

    // 构造函数
    public Mail(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    protected Mail clone() throws CloneNotSupportedException {
        Mail mail = null;
        mail = (Mail)super.clone();
        return mail;
    }
}
