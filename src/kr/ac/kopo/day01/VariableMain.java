package kr.ac.kopo.day01;

public class VariableMain {

/*
 	�⺻�ڷ���
 	���� : boolean 
 	������ : char
 	������ : byte, short, int(�⺻), long
 	�Ǽ��� : float, double(�⺻)
 	
 	���� ����
 	�ڷ��� ������;
 	
 	���� ����
 	������ = ��;
 	
 	���� �ʱ�ȭ(����� ���ÿ� �� ����)
 	�ڷ��� ������ = ��;
 	
 	���� �ڷ����� ���� ������ ����
 	�ڷ��� ������1, ������2, ������3, ...;
 	
 */
	char b; //�������, �ڵ��ʱ�ȭ o(class �Ʒ�)
	
	public static void main(String[] args) {
		
		//�빮�� A�� �����ϱ� ���� ���� a ����
		char a; // ��������, �ʱ�ȭ ���� x(main �޼ҵ� �Ʒ�)
		a = 'A';
		
		// ���� 123�� �����ϱ� ���� ���� c����
		int c = 123;
		
		//�Ǽ� 3���� �����ϱ� ���� ���� d1, d2, d3 ����;
	//	double d1;
	//	double d2;
	//	double d3;
		
		double d1, d3, d2 = 12.34;
		// ����� ������ �ڷ� �̷�� �ƴϸ� d3�� �ʱ�ȭ �����ֱ� d3=0
		
		System.out.println(a);
		System.out.println(c);
	}
}
