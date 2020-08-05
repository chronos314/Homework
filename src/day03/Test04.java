package day03;

import org.junit.Test;

import java.util.Calendar;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    @Test
	public void m4(){
        //控制台输入+正则表达式
        String str1="2020-10-1";
        Calendar cal1=Calendar.getInstance();
        cal1.set(Calendar.YEAR,2020);
        cal1.set(Calendar.MONTH,9);
        cal1.set(Calendar.DATE,1);
        cal1.add(Calendar.DATE,35);
        cal1.add(Calendar.WEEK_OF_MONTH,-2);
        cal1.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        System.out.println(cal1.getTime());
    }
}
