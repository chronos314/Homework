package day03;

import org.junit.Test;

import java.util.Calendar;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {//身份证18位
    @Test
    public void m5(){
        String str="33012719980314321X";
        String str1=str.substring(6,10);
        String str2=str.substring(10,12);
        String str3=str.substring(12,14);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR,1998);
        cal.set(Calendar.MONTH,2);
        cal.set(Calendar.DATE,14);
        cal.add(Calendar.YEAR,20);
        cal.set(Calendar.DAY_OF_WEEK,Calendar.THURSDAY);
        System.out.println(cal.getTime());
    }

}
