package day03;

import org.junit.Test;

import java.util.Calendar;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    @Test
    public void m3(){
        Calendar cal=Calendar.getInstance();
        //输入+正则表达式
        String str1="2000-12-13";
        Calendar cal2=Calendar.getInstance();
        cal2.set(Calendar.YEAR,2020);
        cal2.set(Calendar.MONTH,6);
        cal2.set(Calendar.DATE,23);
        long b=cal.getTimeInMillis()-cal2.getTimeInMillis();
        int week= (int) (b/(1000*60*60*24*7));
        System.out.println(week);
    }
    //改：输入字符串，根据格式转换成date，Date date=new(....);
    /*String s = "19980228";
    SimpleDateFormat sf1 = new
            SimpleDateFormat("yyyy-MM-dd");
    Date date1 = sf1.parse(s);*/

}
