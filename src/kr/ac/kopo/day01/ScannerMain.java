package kr.ac.kopo.day01;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("���ڸ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch : " + ch);
		
		//System.out.print("���ڿ��� �Է� : ");
		//String str = sc.next(); //�ܾ������ next , ���� �ȵ�
		//System.out.println("str : " + str);
		
		System.out.print("���ڿ��� �Է� : ");
		String str = sc.nextLine(); //��������� nextLine
 		System.out.println("str : " + str);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int a = sc.nextInt(); // nextchar�� ���� (�����Է� x)
		System.out.println("a : " + a);
		
	}
}
