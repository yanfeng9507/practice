package cn.xiaoyanol.practice.design.pattern.组合模式;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 组合模式（Composite Pattern）也叫合成模式，有时又叫做部分-整体模式（Part-Whole),主要是用来描述部分
 * 与整体的关系，其定义如下
 * Compose objects into tree structures to represent part-whole hierarchies.Composite lets
 * clients treat individual objects and compositions of objects uniformly.
 * 将对象组合成树形结构以表示"部分-整体"的层次结构，使得用户对单个对象的使用具有一致性。
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 下午6:02
 */
public class Client {
    public static void main(String[] args) {
        // 首先是组装一个组织结构出来
        Branch ceo = compositeCorpTree();
        // 首先把CEO的信息打印出来啊
        System.out.println(ceo.getInfo());
        // 然后是所有员工信息
        System.out.println(getTreeInfo(ceo));
    }

    // 把整个树组装出来
    public static Branch compositeCorpTree() {
        // 首先产生总经理CEO
        Branch root = new Branch("王大麻子", "总经理", 10000);
        // 把三个部门经理产生出来
        Branch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
        Branch salesDep = new Branch("马二拐子", "销售部门经理", 100000);
        Branch financeDep = new Branch("赵三驼子", "财务部经理", 100000);

        // 再把三个小组长产生出来
        Branch firstDevGroup = new Branch("杨三", "开发一组组长", 10000);
        Branch secondDevGroup = new Branch("吴大", "开发二组组长", 50000);

        // 把所有小兵都产生出来
        Leaf a = new Leaf("a", "开发人员", 2000);
        Leaf b = new Leaf("b", "开发人员", 2000);
        Leaf c = new Leaf("c", "开发人员", 2000);
        Leaf d = new Leaf("d", "开发人员", 2000);
        Leaf e = new Leaf("e", "开发人员", 2000);
        Leaf f = new Leaf("f", "开发人员", 2000);
        Leaf g = new Leaf("g", "开发人员", 2000);
        Leaf h = new Leaf("h", "销售人员", 2000);
        Leaf i = new Leaf("i", "销售人员", 2000);
        Leaf j = new Leaf("j", "财务人员", 2000);
        Leaf k = new Leaf("k", "CEO秘书", 2000);
        Leaf zhenglaoliu = new Leaf("", "研发部副经理", 2000);

        // 开始组装
        // CEO小面有三个部门经理和一个秘书
        root.addSubordinate(k);
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);
        // 研发部经理
        developDep.addSubordinate(zhenglaoliu);
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);

        // 看看连个开发小组下有什么
        financeDep.addSubordinate(a);
        financeDep.addSubordinate(b);
        financeDep.addSubordinate(c);
        financeDep.addSubordinate(d);
        financeDep.addSubordinate(e);
        financeDep.addSubordinate(f);

        // 再看看销售部门下的人员情况
        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);

        // 最后一个财务
        financeDep.addSubordinate(j);

        return root;
    }

    public static String getTreeInfo(Branch root) {
        ArrayList<Corp> subordinateList = root.getSubordinate();
        String info = "";
        for (Corp s : subordinateList) {
            if (s instanceof Leaf) {
                //是员工就直接获得信息
                info = info + s.getInfo() + "\n";
            }else {
                // 是个小兵头目
                info = info + s.getInfo() +"\n" + getTreeInfo((Branch)s);
            }
        }
        return info;
    }
}
