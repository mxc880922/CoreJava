package com.corejava.base;

enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE};

public class DataType {
	public static final double CM_PR_INCH = 2.54;	//java����finalָ������
	public static void main(String[] args) {
		/* java 8�ֻ����������� �� java�������޷��ŵ���������*/
		//���� 4��
		int vacationDays = 40;	//4�ֽڣ����(20�����µ�����)
		short indexOfCountry = 100;	//2�ֽ�
		long earthPopulation = 6_100_000_000L;	//8�ֽڣ���Ҫ��L��׺
		byte indexOfWeekday = 2;	//1�ֽ�
		//������ 2�֣�ע�⣬�������������ڽ�ֹ�����������Ľ��ڼ����У���2.0-1.1�������0.9������0.899999...
		//ԭ���Ǽ����ϵͳ�Ķ�����ϵͳ�޷���ȷ��ʾ������1/10
		float rate = 1.05F;	//6~7λ��Ч���֣�����ʹ�ã���Ҫ��F��׺��û��F��׺Ĭ��Ϊdouble����
		double salary = 8000.00;	//15λ��Ч���֣����󲿷ָ����������ݶ���double��
		//�ַ��� 1��
		char cChar = '\u005B';
		//������ 1��
		boolean done = true;
		
		System.out.println("The population on earth now reaches "+earthPopulation);
	
		Size size = Size.SMALL;
	}

}
