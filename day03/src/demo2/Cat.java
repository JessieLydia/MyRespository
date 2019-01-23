package demo2;

public class Cat extends Pet{

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Cat(String name, int age, String color) {
		super(name,age);//调用父类的构造函数
		this.color = color;
	}

	public Cat() {
		
	}
}
