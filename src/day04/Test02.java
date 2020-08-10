package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Collection<String> c1=new ArrayList<>();
        c1.add("1");
        c1.add("$");
        c1.add("2");
        c1.add("$");
        c1.add("3");
        c1.add("$");
        c1.add("4");
        System.out.println(c1);
        //使用迭代器遍历集合，并在过程中删除所有的"$"
        Iterator<String> it=c1.iterator();
        while (it.hasNext()){
            String s=it.next();
            if (s.equals("$")){
                it.remove();
            }
        }

        //最后再将删除元素后的集合使用新循环遍历，并输出每一个元素
        for (String s:c1) {
            System.out.println(s);
        }
    }
}
