package thisex;

public class Birthday {
	
	int day;
	int month;
	public int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);	//this�� ����Ű�� ��ü�� �� �޸� �ּ�
	}

	
	public static void main(String[] args) {
		
		Birthday bDay = new Birthday();
		bDay.setYear(2000);
		System.out.println(bDay);	// bDay ��ü�� RAM�� ���ּ� ���
		bDay.printThis();	// bDay�� ����Ű�� ���޸� �ּ�
		
		System.out.println(bDay.year);
		
	}

}