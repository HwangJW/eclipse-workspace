package thisex;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {	// �޼ҵ��� �����̸��� ��ü ���� �̸��� ������ ���
		this.name = name;		// ��ü ���� �̸� �տ� this (heap)
		this.age = age;			// (heap)
	}
	Person(){
		this("�̸� ����", 1);		// this�� �̿��� Person(String,int)ȣ�� 
	}							// �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� this
	Person returnItSelf() {
		return this;			// this ��ȯ
	}
}
	// stack : this, noname
	// heap : name, age

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person noName = new Person();	// (stack)
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}

}
