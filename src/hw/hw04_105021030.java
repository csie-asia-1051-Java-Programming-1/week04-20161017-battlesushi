package hw;
import java.util.*;
/*
 * Topic: ���ϥΪ̿�J1, 2, 3, �P4�ﶵ�A
��J n ����ܹϧ� (ex: n = 5)
��J n ����ܹϧ�
��J n (�����O�_��)����ܹϧ�
�����{��
 * Date: 2016/10/17
 * Author: 105021030	�i�ʷ�
 */   
public class hw04_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�п�Jn(�Y�ϥ�3�п�J�_��):");
		int num=sc.nextInt();
		System.out.print("�п�J1~4:");
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
		System.out.println("����!!");				
	}
}