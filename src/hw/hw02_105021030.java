package hw;
import java.util.*;
/*
 * Topic: 使用者輸入正整數 n 與 m 然後計算
 * Date: 2016/10/17
 * Author: 105021030	張廷毓
 */   
public class hw02_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入正整數 n 與 m 然後計算:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=1;
		int sum2=1;
		int sum3=1;
		for(int i=n;i>0;i--){
			sum*=i;
		}
		for(int i=m;i>0;i--){
			sum2*=i;
		}
		for(int i=n-m;i>0;i--){
			sum3*=i;
		}
		System.out.print(sum/sum2/sum3);
		
	}

}
