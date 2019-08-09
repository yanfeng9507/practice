package cn.xiaoyanol.practice.design.pattern.中介者模式;

/**
 * Created with IntelliJ IDEA.
 * Description: 采购管理
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-08
 * @Time: 下午3:57
 */
public class Purchase extends AbstractColleague{
    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

//    // 采购IBM电脑
//    public void buyIBMComputer(int number) {
//        // 访问库存
//        Stock stock = new Stock();
//        // 访问销售
//        Sale sale = new Sale();
//        // 电脑的销售情况
//        int saleStatus = sale.getSaleStatus();
//        if (saleStatus > 80) {
//            // 销售情况良好
//            System.out.println("采购IBM电脑："+number+" 台");
//            stock.increase(number);
//        }else {
//            // 销售情况不好
//            int buyNumber = number/2; // 折半采购
//            stock.increase(buyNumber);
//            System.out.println("采购IBM电脑："+buyNumber+" 台");
//        }
//    }
//
//    public void refuseBuyIBM() {
//        System.out.println("不再采购IBM电脑");
//    }

    // 采购IBM电脑
    public void buyIBMComputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    // 不再采购IBM电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
