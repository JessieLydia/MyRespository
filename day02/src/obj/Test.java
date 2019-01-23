package obj;

public class Test {

	public static void main(String[] args) {
		// 类是模板，我们可以用类创建出任意多个对象

		// 创建一个Man的空对象
		Man people1 = new Man();
		// 给对象赋值
		people1.name = "张三";
		people1.age = 30;
		people1.sex = "男";

		people1.play();//调用方法

		// --------------------------------------------

		// 创建一个Man的空对象
		Man people2 = new Man();
		// 给对象赋值
		people2.name = "李四";
		people2.age = 50;
		people2.sex = "男";

		people2.smoke();//调用方法
	}
}
