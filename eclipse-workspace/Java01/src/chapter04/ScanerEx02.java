package chapter04;

import java.util.Scanner;

public class ScanerEx02 {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int time = scanner.nextInt();	// ���� �Է�
		int second = time % 60;			// 60���� ���� �������� ��
		int minute = (time / 60) % 60;	// 60���� ���� ���� �ٽ� 60���� ���� �������� ��
		int hour = (time / 60) / 60;	// 60���� ���� ���� �ٽ� 60���� ���� ���� �ð�
		
		System.out.println(time + "�ʴ� ");
		System.out.println(hour + "�ð�, ");
		System.out.println(minute + "��, ");
		System.out.println(second + "���Դϴ�.");
		
		scanner.close();
		
	}

}