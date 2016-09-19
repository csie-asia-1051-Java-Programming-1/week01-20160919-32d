package ex;
import java.util.Scanner ;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 105021055 王浚維
 */

public class ex02_105021055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = new Scanner (System.in);
		int kg = 88 ; 
		double  gg =  (kg /0.45359) ;
		System.out.println (gg + "磅");
	}

}
