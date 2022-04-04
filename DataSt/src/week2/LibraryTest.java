package week2;

import java.util.Arrays;
import java.util.Comparator;

public class LibraryTest {
	public static void main(String args[]) {
		
		Book[] book = { new Book("�Ѹ����б�", 1, 2010, 3, 15), 	 new Book("IT���", 2, 2018, 8, 11),
						new Book("�ڹ� ���α׷���", 3, 2011, 1, 1), new Book("C ���α׷���", 4, 1999, 12, 18),
						new Book("�ΰ�����", 5, 2019, 2, 22), 	 new Book("����н�", 6, 2015, 9, 30),
						new Book("�ΰ��� �̷�", 7, 2017, 5, 21)};
						
		Arrays.sort(book);
		System.out.print("�̸� ���� : ");
		for(int i = 0; i<book.length; i++)
			System.out.print(book[i].title+"  ");
		System.out.println();
		
		Arrays.sort(book, Book.WITH_NAME);
		System.out.print("NAME ���� : ");
		for(int i = 0; i<book.length; i++)
			System.out.print(book[i].title+"  ");
		System.out.println();
		
		Arrays.sort(book, Book.WITH_SERIAL);
		System.out.print("SERIAL ���� : ");
		for(int i = 0; i<book.length; i++)
			System.out.print(book[i].title+"  ");
		System.out.println();
		
		Arrays.sort(book, Book.WITH_DATE);
		System.out.print("DATE ���� : ");
		for(int i = 0; i<book.length; i++)
			System.out.print(book[i].title+"  ");
		System.out.println();
		
	}
}
