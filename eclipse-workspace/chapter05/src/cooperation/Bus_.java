package cooperation;

public class Bus_ {

	int busNumber;
	int peaple;
	int money;
	
	public Bus_ (int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take (int money) {
		this.money += money;
		peaple++;
	}
	
	public void showInfo() {
		System.out.println("����" + busNumber + "���� �°��� " + peaple + " ���̰�, ������ " + money + "�Դϴ�.");
	}
	
}
