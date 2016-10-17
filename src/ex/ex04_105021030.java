package ex;
import java.util.*;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021030	張廷毓
 */
public class ex04_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		for(int i=1;i<=x;i++){
			for(int j=x;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}	

	}

}
