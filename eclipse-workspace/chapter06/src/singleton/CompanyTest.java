package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		//Compnay instance2 = new Company();		// �ܺο��� ���� �ȵ�, private�̶� �ȵ�
		
		Company myCompany1 = Company.getInstance();		//static�̶� ����		 
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1 == myCompany2);	// �ΰ��� �ν��Ͻ��� ����.
	}

}
