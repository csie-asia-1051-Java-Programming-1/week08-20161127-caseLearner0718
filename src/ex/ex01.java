package ex;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int val = scn.nextInt();
		System.out.println(fun(val));
	}
	public static String fun(int val){
		String a = "";
		while(val>0){
			a = Integer.toString(val%2) + a;
			val = val / 2;
		}
		return a;
	}
}