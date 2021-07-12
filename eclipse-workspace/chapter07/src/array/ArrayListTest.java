package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<Book>();		// ArrayList ����
		
		library.add(new Book("�¹���", "������"));		// add �޼ҵ带 ���ؼ� �߰�
		library.add(new Book("���̾�", "������ �켼"));
		library.add(new Book("��� �� ���ΰ�", "���ù�"));
		library.add(new Book("����", "�ڰ渮"));
		library.add(new Book("�����", "�������丮"));
		
		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		
		System.out.println();
		System.out.println("=== ���� for�� ��� ===");
		for(Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("=== library.size() : " + library.size());
		
	}

}