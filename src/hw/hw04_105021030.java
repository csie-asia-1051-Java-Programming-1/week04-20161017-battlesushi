package hw;
import java.util.*;
/*
 * Topic: 讓使用者輸入1, 2, 3, 與4選項，
輸入 n 並顯示圖形 (ex: n = 5)
輸入 n 並顯示圖形
輸入 n (必須是奇數)並顯示圖形
結束程式
 * Date: 2016/10/17
 * Author: 105021030	張廷毓
 */   
public class hw04_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入n(若使用3請輸入奇數):");
		int num=sc.nextInt();
		System.out.print("請輸入1~4:");
		int choose=sc.nextInt();
		int n=(num+1)/2;
		switch(choose){
		case 1:
			for(int i=0;i<n;i++){
				for(int j=n;j>i;j--){
					System.out.print("@");
				}
				System.out.println();
			}
			for(int i=1;i<n;i++){
				for(int j=0;j<i+1;j++){
					System.out.print("@");
				}
				System.out.println();
			}
			break;
		case 2:
			for(int i=0;i<n;i++){
				for(int j=0;j<i+1;j++){
					System.out.print("%");
				}
				System.out.println();
			}
			for(int i=1;i<n;i++){
				for(int j=n;j>i;j--){
					System.out.print("%");
				}
				System.out.println();
			}
			break;
		case 3:
			
			for(int i=1;i<=n;i++){
				for(int j=n;j>=i;j--){
					System.out.print(" ");
				}
				for(int k=1;k<=(i*2)-1;k++){
				System.out.print("#");
				}
				System.out.println();
			}
			for(int i=2;i<=num;i++){
				for(int j=1;j<=i;j++){
					System.out.print(" ");
				}
				for(int k=num;k>=(i*2)-1;k--){
				System.out.print("#");
				}
				System.out.println();
			}
		case 4:
			break;
		}
		System.out.println("結束!!");				
	}
}