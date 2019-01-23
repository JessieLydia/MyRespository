package 循环;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		//while:先判断再执行
//		int i = 0;
//		while(i<3) {
//			System.out.println("今天天气不错");
//			i++;
//		}
		
		//先让学生做作业，做完后检查是否合格，如果不合格就要继续做，合格的话就停止了
		//do-while:先做，再判断
		Scanner input = new Scanner(System.in);
		boolean b;
		do {
			//做
			System.out.println("张三做完了作业，合格吗？");
			b = input.nextBoolean();//nextBoolean():只能输入true/false
		}while(!b);//判断	
		System.out.println("张三顺利通过了测试！");
	}
	
}

