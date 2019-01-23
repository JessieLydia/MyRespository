package demo3;

public class Calculate {
	
	/*
	        方法的模板：
	 
	         修饰符  返回值  方法名(参数列表){
	                   方法体
	   }
	  
	 */

	// 无参，无返回值方法
	public void show() {
		System.out.println("今天天气真好");
	}

	// 有参，无返回值的方法
	public void show(String msg) {
		System.out.println("接收到的消息参数为：" + msg);
	}
	
	//有参，有返回值的方法
	public int add(int a,int b) {
		int result = a+b;
		return result;
	}
}
