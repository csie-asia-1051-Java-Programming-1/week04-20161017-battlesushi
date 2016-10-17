package ex;
import java.util.*;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021030	張廷毓
 */    										//n直排  m橫排
public class ex02_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0,m=0;
		boolean run=true;
		char run2='0';
		while(run){
			System.out.println("請輸入兩個正整數 n 與 m:");
			 n=sc.nextInt();
			 m=sc.nextInt();	
			for(int i=1;i<=n;i++){		
				for(int j=1;j<=m;j++){
					System.out.print(i*j+"	");
				}
				System.out.println();
			}
			System.out.println("是否繼續(Y/n)");
			run2=sc.next().charAt(0);
			if(run2=='N'||run2=='n')
				run=false;
			else
				continue;
		}
		System.out.println("結束!!");
		
		
		
		
		
	}

}
