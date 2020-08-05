package day03;

import org.junit.Test;

import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Bonnie
 *
 */
public class Test01 {
    @Test
    public void m1(){
        Date date=new Date();
        System.out.println(date);
        Date date1=new Date(date.getTime()+3l*24*60*60*1000);
        System.out.println(date1);
    }
}
