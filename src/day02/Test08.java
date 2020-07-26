package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {

        System.out.println("请输入员工信息，格式为name,age,gender,salary;name,age,gender,salary;");
        Scanner console=new Scanner(System.in);
        String str1=console.nextLine();
        String regex1="\\;";
        String[] person=str1.split(regex1);

        ArrayList<Person> arr=new ArrayList();
        for (int i = 0; i <person.length ; i++) {
            String str2=person[i];
            String regex2="\\,";
            String[] single=str2.split(regex2);
            arr.add(new Person(single[0],Integer.parseInt(single[1]),single[2],Integer.parseInt(single[3])));
        }
        for (int i = 0; i <arr.size() ; i++) {
            Person gets=arr.get(i);
            System.out.println(gets);
        }

    }
}
