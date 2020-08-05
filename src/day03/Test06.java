package day03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Bonnie
 *
 */
public class Test06 {
    @Test
    public void m6() {
        Collection<String> col = new ArrayList<>();
        col.add("one");
        col.add("two");
        col.add("three");
        //集合元素个数
        System.out.println(col.size());
        //输出该集合是否包含字符串"four"
        System.out.println(col.contains("four"));
        //输出集合是否不含有任何元素
        System.out.println(col.isEmpty());
        //清空集合
        col.clear();
        System.out.println(col.size());
        System.out.println(col.isEmpty());
    }
}
