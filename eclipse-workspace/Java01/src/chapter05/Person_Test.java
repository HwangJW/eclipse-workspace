package chapter05;

public class Person_Test {

	public static void main(String[] args) {
		
		Person person = new Person();	// Person ��ü ����
		person.age = 40;		
		person.name = "James";	
		person.single = true;
		person.cildren = 3;
		
		System.out.println("�� ����� ���̴� " + person.age + "�� �Դϴ�.");
		System.out.println("�� ����� �̸��� " + person.name + "�Դϴ�.");
		System.out.println("�� ����� ��ȥ ���δ� " + person.single + "�Դϴ�.");
		System.out.println("�� ����� �ڳ� ���� " + person.cildren + "�� �Դϴ�.");
		
	}

}
