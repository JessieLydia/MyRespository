package obj;

public class Test {

	public static void main(String[] args) {
		// ����ģ�壬���ǿ������ഴ��������������

		// ����һ��Man�Ŀն���
		Man people1 = new Man();
		// ������ֵ
		people1.name = "����";
		people1.age = 30;
		people1.sex = "��";

		people1.play();//���÷���

		// --------------------------------------------

		// ����һ��Man�Ŀն���
		Man people2 = new Man();
		// ������ֵ
		people2.name = "����";
		people2.age = 50;
		people2.sex = "��";

		people2.smoke();//���÷���
	}
}
