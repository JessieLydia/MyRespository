package demo2;

public class Dog extends Pet {

	private String pinzhong;// Æ·ÖÖ


	public String getPinzhong() {
		return pinzhong;
	}

	public void setPinzhong(String pinzhong) {
		this.pinzhong = pinzhong;
	}

	public Dog(String name, int age, String pinzhong) {
		super(name,age);
		this.pinzhong = pinzhong;
	}

	public Dog() {

	}

}
