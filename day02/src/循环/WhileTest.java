package ѭ��;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		//while:���ж���ִ��
//		int i = 0;
//		while(i<3) {
//			System.out.println("������������");
//			i++;
//		}
		
		//����ѧ������ҵ����������Ƿ�ϸ�������ϸ��Ҫ���������ϸ�Ļ���ֹͣ��
		//do-while:���������ж�
		Scanner input = new Scanner(System.in);
		boolean b;
		do {
			//��
			System.out.println("������������ҵ���ϸ���");
			b = input.nextBoolean();//nextBoolean():ֻ������true/false
		}while(!b);//�ж�	
		System.out.println("����˳��ͨ���˲��ԣ�");
	}
	
}

