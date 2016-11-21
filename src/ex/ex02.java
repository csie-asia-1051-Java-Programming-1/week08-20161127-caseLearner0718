package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入要轉換的數");
		int val = scn.nextInt();
		System.out.println("請輸入這是幾進制");
		double how = scn.nextInt();
		System.out.println("請輸入你要轉成幾進制");
		int how2 = scn.nextInt();
		System.out.println(fun(val,how,how2));
	}
	public static String fun(int val,double how,int how2){
		String a = "";
		double tal=0,c;
		a = Integer.toString(val);
//		System.out.println(a);
		c=a.length()-1;
		for(int b=0;b<a.length();b++){
			tal = tal + (int)(a.charAt(b)-48)*(Math.pow(how, c));
//			System.out.println(Math.pow(how, c));
			c--;
//			System.out.println(c);
		}
//		System.out.println(tal);
		a="";
		int tal2 = (int)tal;
		while(tal2>0){
			a = Integer.toString(tal2%how2) + a;
//			System.out.println(tal2%how2 + " " + tal2 + " " + how2);
			tal2 = tal2 / how2;
//			System.out.println(tal2);
		}
		return a;
	}
}
