package com.corejava.base;

public class Operators {

	public static void main(String[] args) {
		//��������
		//��ϵ����
		int a = 10;
		int b = 9;
		
		System.out.println(a < b? a:b);
		
		int x = 0;
		
		if (x != 0 && 1/x < x+1) {	//ע�� && �� || �Ķ�·Ч��
			
		} else {
			System.out.println("x��0������1/x����������");
		}
		//λ�������������ֵ		
		int fourthBitFromRight = (10 & 0b1000) / 0b1000;
		
		if (fourthBitFromRight == 1) {
			System.out.println("10�Ķ�������������λ��1");
		} else {
			System.out.println("10�Ķ�������������λ��0");
		}
		
		fourthBitFromRight = 6 & (1 << 3) >> 3;
		
		if (fourthBitFromRight == 1) {
			System.out.println("6�Ķ�������������λ��1");
		} else {
			System.out.println("6�Ķ�������������λ��0");
		}
		//����ת��
		/**
		 *��1��
		 *  byte-->short-->int-->long(double)
		 *  char-->int
		 *  ����������·�������������Ϣ��ʧ
		 *  int-->float
		 *  long-->float
		 *  long-->double
		 *  ����������·��������ȶ�ʧ
		 *��2��
		 *  c = a + b;	
		 *  if (a��double�� || b��double�� ) {
		 * 		a,b,c��ת����double��;
		 *  } else if (a��float�� || b��float��) {
		 *  	a,b,c��ת����float��;
		 *  } else if (a��long�� || b��long��) {
		 *  	a,b,c��ת����long��;
		 *  } else {
		 *  	a,b,c��ת����int��;
		 *  }
		 * 
		 * */
	}

}
