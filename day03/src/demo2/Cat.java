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
		super(name,age);//���ø���Ĺ��캯��
		this.color = color;
	}

	public Cat() {
		
	}
}
