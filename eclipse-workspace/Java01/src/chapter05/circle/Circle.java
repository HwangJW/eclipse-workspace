package chapter05.circle;

public class Circle {

	int radius;		// ���� ������ �ʵ�		[����]
	String name;	// ���� �̸� �ʵ�		[����]
	
	public Circle() {}	// Circle Ŭ������ �⺻ ������(Ŭ������� ������ �̸��� �޼ҵ�)	[������]
						// ��ǲ �Ű������� ����, ����ΰ� ���� ������ : �⺻ ������, �⺻�����ڴ� ������ ����
	
	public double getArea() {	// ���� ���� ��� �޼ҵ�	[�޼ҵ�]
		return 3.14 * radius * radius;
	}

}
