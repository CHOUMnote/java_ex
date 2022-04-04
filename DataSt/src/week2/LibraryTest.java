package week2;

import java.util.Arrays;
import java.util.Comparator;

public class LibraryTest {
	public static void main(String args[]) {
		
		Book[] book = { new Book("한림대학교", 1, 2010, 3, 15), 	 new Book("IT기술", 2, 2018, 8, 11),
						new Book("자바 프로그래밍", 3, 2011, 1, 1), new Book("C 프로그래밍", 4, 1999, 12, 18),
						new Book("인공지능", 5, 2019, 2, 22), 	 new Book("기계학습", 6, 2015, 9, 30),
						new Book("인간의 미래", 7, 2017, 5, 21)};
						
		Arrays.sort(book);
		System.out.print("이름 정렬 : ");
		for(int i = 0; i<book.length; i++)
			System.out.print(book[i].title+"  ");
		System.out.println();
		
		Arrays.sort(book, Book.WITH_NAME);
		System.out.print("NAME 정렬 : ");
		for(int i = 0; i<book.length; i++)
			System.out.print(book[i].title+"  ");
		System.out.println();
		
		Arrays.sort(book, Book.WITH_SERIAL);
		System.out.print("SERIAL 정렬 : ");
		for(int i = 0; i<book.length; i++)
			System.out.print(book[i].title+"  ");
		System.out.println();
		
		Arrays.sort(book, Book.WITH_DATE);
		System.out.print("DATE 정렬 : ");
		for(int i = 0; i<book.length; i++)
			System.out.print(book[i].title+"  ");
		System.out.println();
		
	}
}
