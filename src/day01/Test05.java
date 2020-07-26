package day01;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		String str1=ranCode();
		System.out.println("验证码为:"+str1);
		str1=str1.toUpperCase();
		Scanner console=new Scanner(System.in);
		String str2=console.nextLine();
		str2=str2.toUpperCase();
		if (str1.equals(str2)){
			System.out.println("有效");
		}else{
			System.out.println("无效");
		}

	}
	public static String ranCode(){
		String code="";
		Random ran=new Random();
		for (int i = 0; i < 5; i++) {
			code+=(ran.nextInt(2)==0)?(char)(ran.nextInt(26)+65):(char)(ran.nextInt(26)+97);
		}
		return code;
	}

}
