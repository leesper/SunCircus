package imooc.homework;

import java.util.Scanner;

public class SunCircus {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			info();
			int input = s.nextInt();
			switch (input) {
			case 1:
				System.out.println("bear");
				break;
			case 2:
				System.out.println("lion");
				break;
			case 3:
				System.out.println("monkey");
				break;
			case 4:
				System.out.println("parrot");
				break;
			case 5:
				System.out.println("clown");
				break;
			case 0:
				return;
			default:
				System.out.println("请输入1-5的数字，输入0退出");
			}
			choice();
			input = s.nextInt();
			if (input == 0) {
				return;
			}
		}
	}
	
	private static void info() {
		System.out.println("****** 欢迎来到太阳马戏团 ******");
		System.out.println("****** 请选择表演者 ******");
		System.out.println("****** 1. 棕熊 ******");
		System.out.println("****** 2. 狮子 ******");
		System.out.println("****** 3. 猴子 ******");
		System.out.println("****** 4. 鹦鹉 ******");
		System.out.println("****** 5. 小丑 ******");
	}
	
	private static void choice() {
		System.out.println("****** 是否继续观看（1/0） ******");
	}

}
