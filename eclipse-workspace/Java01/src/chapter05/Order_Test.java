package chapter05;

public class Order_Test {

	public static void main(String[] args) {
		
		Order order = new Order();

		order.num = 201803120001L;
		order.id = "abc123";
		order.day = "2018�� 3�� 12��";
		order.name = "ȫ���";
		order.order = "PD0345-12";
		order.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + order.num);
		System.out.println("�ֹ��� ���̵� : " + order.id);
		System.out.println("�ֹ� ��¥ : " + order.day);
		System.out.println("�ֹ��� �̸� : " + order.name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.order);
		System.out.println("��� �ּ� : " + order.address);
		
	}

}
