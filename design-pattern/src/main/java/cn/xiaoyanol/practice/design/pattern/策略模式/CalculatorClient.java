package cn.xiaoyanol.practice.design.pattern.策略模式;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午11:19
 */
public class CalculatorClient {
//    public static void main(String[] args) {
//        args = new String[3];
//        args[0] = "100";
//        args[1] = "+";
//        args[2] = "200";
//
//         // 输入的两个参数是数字
//        int a = Integer.parseInt(args[0]);
//        String symbol = args[1];
//        int b = Integer.parseInt(args[2]);
//        System.out.println("输入的参数为："+ Arrays.toString(args));
//        // 生成一个运算器
//        Calculator calculator = new Calculator();
//        System.out.println("运行的结果为："+a+symbol+b+"="+ calculator.exec(a,b, symbol));
//    }


//    // 加符号
//    public final static String ADD_SYMBOL = "+";
//    // 减符号
//    public final static String SUB_SYMBOL = "-";
//
//    public static void main(String[] args) {
//        args = new String[3];
//        args[0] = "100";
//        args[1] = "+";
//        args[2] = "200";
//
//        // 输入的两个参数是数字
//        int a = Integer.parseInt(args[0]);
//        String symbol = args[1];
//        int b = Integer.parseInt(args[2]);
//
//        System.out.println("输入的参数为："+ Arrays.toString(args));
//
//        // 上下文
//        Context context = null;
//        // 判断初始化哪一个策略
//        if (symbol.equals(ADD_SYMBOL)) {
//            context = new Context(new Add());
//        }else if (symbol.equals(SUB_SYMBOL)) {
//            context = new Context(new Sub());
//        }
//        System.out.println("运行的结果为："+a+symbol+b+"="+ context.exec(a,b, symbol));
//    }


    public static void main(String[] args) {
        args = new String[3];
        args[0] = "100";
        args[1] = "+";
        args[2] = "200";

        // 输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);

        System.out.println("输入的参数为："+ Arrays.toString(args));
        System.out.println("运行的结果为："+a+symbol+b+"="+ CalculatorEnum.ADD.exec(a,b));
    }
}
