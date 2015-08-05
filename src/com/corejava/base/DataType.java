package com.corejava.base;

enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE};

public class DataType {
	public static final double CM_PR_INCH = 2.54;	//java中用final指定常量
	public static void main(String[] args) {
		/* java 8种基本数据类型 ， java不存在无符号的数据类型*/
		//整型 4种
		int vacationDays = 40;	//4字节，最常用(20亿以下的数字)
		short indexOfCountry = 100;	//2字节
		long earthPopulation = 6_100_000_000L;	//8字节，需要加L后缀
		byte indexOfWeekday = 2;	//1字节
		//浮点型 2种，注意，浮点数不适用于禁止出现舍入误差的金融计算中，如2.0-1.1结果并非0.9，而是0.899999...
		//原因是计算机系统的二进制系统无法精确表示分数的1/10
		float rate = 1.05F;	//6~7位有效数字，很少使用，需要加F后缀，没有F后缀默认为double类型
		double salary = 8000.00;	//15位有效数字，绝大部分浮点类型数据都用double型
		//字符型 1种
		char cChar = '\u005B';
		//布尔型 1种
		boolean done = true;
		
		System.out.println("The population on earth now reaches "+earthPopulation);
	
		Size size = Size.SMALL;
	}

}
