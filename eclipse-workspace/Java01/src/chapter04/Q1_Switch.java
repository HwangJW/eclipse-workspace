package chapter04;

import java.util.Scanner;

public class Q1_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ڸ� �Է��ϼ���. ��) +, -, *, /");
		
		int num1 = 10;
		int num2 = 2;
		String S = sc.next();
		char operator = S.charAt(0);
		

		
		switch(operator) {
		case '+' :
			System.out.println(num1 +  num2 );
			break;
		case '-' :
			System.out.println(num1 - num2 );
			break;
		case '*' :
			System.out.println(num1 * num2 );
			break;
		case '/' :
			System.out.println(num1 / num2 );
			break;
		default:
			System.out.println("������ �����Դϴ�.");
			sc.close();
			return;
		}
	
		sc.close();
	}

}
