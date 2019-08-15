package cn.xiaoyanol.practice.design.pattern.观察者模式;

/**
 * Created with IntelliJ IDEA.
 * Description: 被观察者模式
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-15
 * @Time: 上午9:46
 */
public interface Observable {
    // 增加一个观察者
    void addObserver(Observer observer);
    // 删除一个观察者
    void deleteObserver(Observer observer);
    // 既要观察，我发生改变了他也应该有所动作，通知观察者
    void notifyObserves(String context);


}
