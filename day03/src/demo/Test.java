package demo;

public class Test {

	public static void main(String[] args) {
		//属性直接暴露在外面，随便.,不安全，我要学习封装
		Student s = new Student();
		//设置名字
//		s.name = "zhangsan";
//		s.age = 30;
		s.setName("张三");
		s.setAge(30);
		
		//获取名字
		String a = s.getName();//获取到名字，保存到变量a里面
		System.out.println(a);//把a打印出来
		
		s.show("adsfadsf");
	}
}
