package upcasting;

public class DowncastingEx {

	public static void main(String[] args) {

		Person p = new Student("�����");		// �� ĳ����
		Student s = (Student)p;				// �ٿ� ĳ����, �ݵ�� �ڷ����� ����ؼ� �ٿ�
		
		System.out.println(p.name);
		
		//p.grade = "A";				// ������ ����
		//p.department = "Com";		// ������ ����
		p.name = "ȫ�浿";
		p.id = "ID";
		
		s.grade = "A";					
		s.department = "Com";			
		s.name = "ȣȥ";
		s.id = "Hr";
		
	}

}
