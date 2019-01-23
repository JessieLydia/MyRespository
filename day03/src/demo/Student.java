package demo;

public class Student {
	private String name;
	private int age;

	public void show(String msg) {
		System.out.println("我的名字是：" + name+msg);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
