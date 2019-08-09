package cn.xiaoyanol.practice.design.pattern.中介者模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
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

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        // 采购人员采购电脑
        System.out.println("---采购人员采购电脑---");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);
        // 销售人员销售电脑
        System.out.println("---销售人员销售电脑---");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(89);
        // 库房管理人员管理库房
        System.out.println("---库房管理人员清库处理");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
