package hw;
import java.util.*;
/*
 * Topic: �g�ӵ{�����ϥΪ̳s���J��� (���ơB�t�Ƥιs)�A����ϥΪ̿�J 999 �ɰ���A
 * �M����ܥ��Ʀ��h�֭ӡA0 ���X�ӡA�t���`�@���X�ӡA�ϥΪ̥i�H���а��檽��ϥΪ̿�Jn
 * Date: 2016/10/17
 * Author: 105021030	�i�ʷ�
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
			System.out.print("�п�J�@�Ӿ��:");
				x=sc.nextInt();
			if(x==999){	
				c--;
				System.out.println("����:"+a);
				System.out.println("�t��:"+b);
				System.out.println("�s:"+c);	
			}
		}
		System.out.println("�O�_�~��(Y/n)?");
		run=sc.next().charAt(0);
		}
		System.out.println("����!!");
		
	}
}