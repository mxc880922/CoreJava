package com.corejava.base;

public class Operators {

	public static void main(String[] args) {
		//算术运算
		//关系运算
		int a = 10;
		int b = 9;
		
		System.out.println(a < b? a:b);
		
		int x = 0;
		
		if (x != 0 && 1/x < x+1) {	//注意 && 和 || 的短路效果
			
		} else {
			System.out.println("x是0，但是1/x并不会运行");
		}
		//位运算针对整型数值		
		int fourthBitFromRight = (10 & 0b1000) / 0b1000;
		
		if (fourthBitFromRight == 1) {
			System.out.println("10的二进制右数第四位是1");
		} else {
			System.out.println("10的二进制右数第四位是0");
		}
		
		fourthBitFromRight = 6 & (1 << 3) >> 3;
		
		if (fourthBitFromRight == 1) {
			System.out.println("6的二进制右数第四位是1");
		} else {
			System.out.println("6的二进制右数第四位是0");
		}
		//类型转换
		/**
		 *（1）
		 *  byte-->short-->int-->long(double)
		 *  char-->int
		 *  以上两种线路不会产生数据信息丢失
		 *  int-->float
		 *  long-->float
		 *  long-->double
		 *  以上三种线路会产生精度丢失
		 *（2）
		 *  c = a + b;	
		 *  if (a是double型 || b是double型 ) {
		 * 		a,b,c都转换成double型;
		 *  } else if (a是float型 || b是float型) {
		 *  	a,b,c都转换成float型;
		 *  } else if (a是long型 || b是long型) {
		 *  	a,b,c都转换成long型;
		 *  } else {
		 *  	a,b,c都转换成int型;
		 *  }
		 * 
		 * */
	}

}
