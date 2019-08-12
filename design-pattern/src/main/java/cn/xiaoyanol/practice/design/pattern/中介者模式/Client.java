package cn.xiaoyanol.practice.design.pattern.中介者模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Define an object that encapsulates how a set of objects interact.
 * Mediator promotes loose coupling by keeping objects from referring to each other explicitly,
 * and it lets you vary their interaction independently.
 * 用一个中介对象封装一系列的对象交互，中介者使各对象不需要显式地相互作用，从而使其耦合松散，而且可以独立地改变他们之间的交互。
 * @Author: chenyanfeng
 * @Date: 2019-08-08
 * @Time: 下午4:13
 */
public class Client {
//    public static void main(String[] args) {
//        // 采购人员采购电脑
//        System.out.println("----------采购人员采购电脑----------");
//        Purchase purchase = new Purchase();
//        purchase.buyIBMComputer(100);
//        // 销售人员销售电脑
//        System.out.println("----------销售人员销售电脑----------");
//        Sale sale = new Sale();
//        sale.sellIBMComputer(1);
//        // 库房管理人员管理库存
//        System.out.println("----------库房管理人员清库处理------------");
//        Stock stock = new Stock();
//        stock.clearStock();
//    }

//    public static void main(String[] args) {
//        AbstractMediator mediator = new Mediator();
//        // 采购人员采购电脑
//        System.out.println("---采购人员采购电脑---");
//        Purchase purchase = new Purchase(mediator);
//        purchase.buyIBMComputer(100);
//        // 销售人员销售电脑
//        System.out.println("---销售人员销售电脑---");
//        Sale sale = new Sale(mediator);
//        sale.sellIBMComputer(89);
//        // 库房管理人员管理库房
//        System.out.println("---库房管理人员清库处理");
//        Stock stock = new Stock(mediator);
//        stock.clearStock();
//    }

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        // 采购人员采购电脑
        System.out.println("---采购人员采购电脑---");
        Purchase purchase = mediator.getPurchase();
        purchase.buyIBMComputer(100);
        // 销售人员销售电脑
        System.out.println("---销售人员销售电脑---");
        Sale sale = mediator.getSale();
        sale.sellIBMComputer(89);
        // 库房管理人员管理库房
        System.out.println("---库房管理人员清库处理");
        Stock stock = mediator.getStock();
        stock.clearStock();
    }
}
