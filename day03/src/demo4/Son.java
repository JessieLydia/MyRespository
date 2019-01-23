package demo4;

public class Son extends Father {

	//@Override：注解，加在方法上面，表示这个方法重写自父类
	@Override
	public void useComputer() {
		System.out.println("玩游戏");
	}
}
