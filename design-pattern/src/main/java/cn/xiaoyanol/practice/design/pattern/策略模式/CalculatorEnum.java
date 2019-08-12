package cn.xiaoyanol.practice.design.pattern.策略模式;

/**
 * Created with IntelliJ IDEA.
 * Description: 策略枚举
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午11:35
 */
public enum  CalculatorEnum {
    // 加法运算
    ADD("+"){
        public int exec(int a, int b) {
            return a + b;
        }
    },
    // 减法枚举
    SUB("-"){
        public int exec(int a, int b) {
            return a - b;
        }
    };

    String value = "";

    // 定义成员值类型
    private CalculatorEnum(String _value) {
        this.value = _value;
    }
    // 获得枚举成员的值
    public String getValue() {
        return value;
    }
    // 声明一个抽象函数
    public abstract int exec(int a, int b);
}
