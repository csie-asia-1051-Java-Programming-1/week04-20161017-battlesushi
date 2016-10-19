package hw;
import java.util.*;
/*
 * Topic: 寫個程式讓使用者連續輸入整數 (正數、負數及零)，直到使用者輸入 999 時停止，
 * 然後顯示正數有多少個，0 有幾個，負數總共有幾個，使用者可以重覆執行直到使用者輸入n
 * Date: 2016/10/17
 * Author: 105021030	張廷毓
 */   
public class hw03_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=0;
		int a=0;
		int b=0;
		int c=0;
		char run='y';
		while(run=='y'||run=='Y'){
			x=0;
			a=0;
			b=0;
			c=0;
		while(x!=999){
			run='0';
			if(x>0)
				a++;
			else if(x<0)
				b++;
			else
				c++;
			System.out.print("請輸入一個整數:");
				x=sc.nextInt();
			if(x==999){	
				c--;
				System.out.println("正數:"+a);
				System.out.println("負數:"+b);
				System.out.println("零:"+c);	
			}
		}
		System.out.println("是否繼續(Y/n)?");
		run=sc.next().charAt(0);
		}
		System.out.println("結束!!");
		
	}
}