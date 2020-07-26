package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		String str=console.nextLine();
		cut(str);
	}
	public static void cut(String str){
		int i=str.indexOf('@');
		String str2=str.substring(0,i);
		System.out.println(str2);
	}
}
