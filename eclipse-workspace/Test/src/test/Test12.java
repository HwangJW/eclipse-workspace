package test;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[10];
		
		System.out.println("���� ���� 10���� �Է��Ͻÿ� >>");
		for(int i = 0; i < array.length; i++ ) {
			array[i] = scanner.nextInt();
		}
		System.out.print("3�� ����� ");
		for(int i = 0; i < array.length; i++ ) {
			if(array[i] % 3 == 0) {
			
				System.out.print(array[i] + " ");
			}
			
		}
		scanner.close();
	}

}
