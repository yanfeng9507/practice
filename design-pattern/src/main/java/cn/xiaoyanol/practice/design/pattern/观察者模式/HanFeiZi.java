package cn.xiaoyanol.practice.design.pattern.观察者模式;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-15
 * @Time: 上午9:52
 */
public class HanFeiZi implements Observable, IHanFeiZi {
    // 定义个变长数组，存放所有的观察者
    private ArrayList<Observer> observerList = new ArrayList<>();

    // 增加观察则
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    // 删除观察者
    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    // 通知所有的观察者
    @Override
    public void notifyObserves(String context) {
        for (Observer observer : observerList) {
            observer.update(context);
        }
    }

    // 韩非子要吃饭了
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        notifyObserves("韩非子：开始吃饭了...");
    }

    // 韩非子开始娱乐了...
    @Override
    public void haveFun() {
        System.out.println("韩非子开始娱乐了...");
        notifyObserves("韩非子开始娱乐了...");
    }
}
