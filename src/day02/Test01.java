package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        double sum=0;
        System.out.println("请输入字符串：");
        Scanner console=new Scanner(System.in);
        String str=console.nextLine();
        String regex1="^\\d+$";
        String regex2="^\\d+\\.\\d+$";
        boolean m1=str.matches(regex1);
        boolean m2=str.matches(regex2);
        if(m1){
            int i=Integer.parseInt(str);
            sum=i*10;
            System.out.println("整数，计算结果为："+sum);
        }else if (m2){
            double j=Double.parseDouble(str);
            sum=j*5;
            System.out.println("小数，计算结果为："+sum);
        }else {
            System.out.println("不是数字！");
        }
    }
}
