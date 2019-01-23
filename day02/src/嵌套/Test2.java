package 嵌套;

public class Test2 {

	public static void main(String[] args) {
		//打印三行六列的矩形
		//外层循环控制打印的行数
		for(int i = 0; i<3; i++) {
			//内层循环控制每行的个数
			for(int j=0; j<6; j++) {
				System.out.print("*");
			}
			System.out.println();//打印完一行以后要换行
		}
		
	}
}
