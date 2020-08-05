package day03;

import org.junit.Test;

import java.util.*;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    @Test
    public void m7() {
        Collection<Emp> col = new ArrayList<>();
        Calendar cal=Calendar.getInstance();
        Scanner console=new Scanner(System.in);
        System.out.println("请输入员工个数：");
        int n=console.nextInt();
        System.out.println("请分别输入员工信息，格式为张三,25,男,5000,2006-02-15，回车继续录入");
        for (int i = 0; i <n ; i++) {
            Scanner console1=new Scanner(System.in);
            String people=console1.nextLine();
            String regex="\\,";
            String[] info=people.split(regex);

            String regex1="\\-";
            String[] info1=info[4].split(regex1);
            cal.set(Calendar.YEAR,Integer.parseInt(info1[0]));
            cal.set(Calendar.MONTH,Integer.parseInt(info1[1])-1);
            cal.set(Calendar.DAY_OF_MONTH,Integer.parseInt(info1[2]));

            //i-- continue;
            for (Emp emp:col) {
                if (emp.getName().equals(info[0])){
                    i--;
                    System.out.println("该名员工的信息已存在！");
                    continue;
                }
            }

            col.add(new Emp(info[0],Integer.parseInt(info[1]),info[2],Integer.parseInt(info[3]),cal.getTime()));
        }
        Iterator<Emp> it = col.iterator();
        System.out.println("员工信息如下：");
        while (it.hasNext()) {
            Emp emp = it.next();
            System.out.println(emp);
        }
    }

}
