package chapter05;

public class Circle_Con {
	
	int radius;		//����
	String name;	//����
	
	public Circle_Con () {			// ������ (�Ű������� ���� ������)
		radius = 1; name = "";		// radius�� �ʱⰪ�� 1
	}
	
	public Circle_Con(int r, String n) {	// ������ (�Ű� ������ ���� ������) , �����ڴ� ���ϰ��� ����
		radius = r; name = n;
	}
	
	public double getArea() {		//�޼ҵ�
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {

		Circle_Con pizza = new Circle_Con(10, "�ڹ�����");		// �Ű� ������ ���� �����ڸ� ȣ��
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������" + area + "�Դϴ�");
		
		Circle_Con donut = new Circle_Con();				// �Ű� ������ ���� �����ڸ� ȣ��
		donut.name = "���� ����";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������" + area + "�Դϴ�");
	}

}
