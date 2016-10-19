package hw;
import java.util.*;
/*
 * Topic: 使用者輸入 n 產生 n 個 費氏數列 (例 n = 5 ) 	1, 1, 2, 3, 5
 * Date: 2016/10/17
 * Author: 105021030	張廷毓
 */        //v3=v1+v2   v1=v2  v2=v3
public class hw01_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int v1=1,v2=1,v3=0;
		if(n==1)
			System.out.print("1");
		else if(n==2)
			System.out.print("11");
		
		else{
			System.out.print("1, 1, ");
		for(int i=0;i<n;i++){
			v3=v1+v2;   
			v1=v2;
			v2=v3;
			System.out.print(v3+", ");
			}
		}
			
	}

}
