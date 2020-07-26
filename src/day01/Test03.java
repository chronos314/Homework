package day01;

import java.util.Scanner;

/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上
 * 
 * @author Bonnie
 *
 */
public class Test03 {
	public static void main(String[] args) {
		/*
		 * 编写一个回文字符串，然后调用check方法检查
		 * 该字符串是否为回文，然后输出检查结果。
		 * 若是回文则输出:是回文
		 * 否则输出:不是回文
		 */
		Scanner console=new Scanner(System.in);
		String str=console.nextLine();
		System.out.println(check(str));
	}
	/**
	 * 判读该方法是否是回文
	 * @param str 需要判断的字符串
	 * @return true表示是回文，false表示不是回文
	 */
	public static boolean check(String str){
		//String类转换成StringBuilder类
//		StringBuilder str2=new StringBuilder(str);
//		StringBuilder str3=str2.reverse();
//		if (str2.equals(str3)) {
//			return true;
//		}
//		return false;
		//StringBuilder类转换成String类
		StringBuilder str4=new StringBuilder();
		str4.append(str);
		str4.reverse();
		String str5=str4.toString();
		if(str.equals(str5)){
			return true;
		}
		return false;
	}
}
