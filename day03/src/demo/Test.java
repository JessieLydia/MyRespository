package demo;

public class Test {

	public static void main(String[] args) {
		//����ֱ�ӱ�¶�����棬���.,����ȫ����Ҫѧϰ��װ
		Student s = new Student();
		//��������
//		s.name = "zhangsan";
//		s.age = 30;
		s.setName("����");
		s.setAge(30);
		
		//��ȡ����
		String a = s.getName();//��ȡ�����֣����浽����a����
		System.out.println(a);//��a��ӡ����
		
		s.show("adsfadsf");
	}
}
