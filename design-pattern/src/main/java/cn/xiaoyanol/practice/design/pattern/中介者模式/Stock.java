package cn.xiaoyanol.practice.design.pattern.中介者模式;

/**
 * Created with IntelliJ IDEA.
 * Description: 库存管理
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-08
 * @Time: 下午4:03
 */
public class Stock extends AbstractColleague{
    // 刚开始有100台电脑
    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMediator _mediator) {
        super(_mediator);
    }
//
//    // 增加库存
//    public void increase(int number) {
//        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
//        System.out.println("库存数量为："+COMPUTER_NUMBER);
//    }
//    // 降低库存
//    public void decrease(int number) {
//        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
//        System.out.println("库存数量为："+COMPUTER_NUMBER);
//    }
//
//    // 获得库存数量
//    public int getStockNumber() {
//        return COMPUTER_NUMBER;
//    }
//
//    // 存货压力大了，就要通知采购人员不要采购，销售人员要尽快销售
//    public void clearStock() {
//        Purchase purchase = new Purchase();
//        Sale sale = new Sale();
//        System.out.println("清理存货数量为："+COMPUTER_NUMBER);
//        // 要求折价销售
//        sale.offSale();
//        // 要求采购人员不要采购
//        purchase.refuseBuyIBM();
//    }
    // 库存增加
    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为："+ COMPUTER_NUMBER);
    }

    // 库存降低
    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为："+ COMPUTER_NUMBER);
    }
    // 获得库存数量
    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    // 存货压力大力，就要通知采购人员不要采购，销售人员要尽快销售
    public void clearStock() {
        System.out.println("清理存货数量为："+COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }

}
