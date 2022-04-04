package week2;

import java.util.Comparator;
public class Book implements Comparable<Book>{
	public static final Comparator<Book> WITH_NAME = new WithName();
	public static final Comparator<Book> WITH_SERIAL = new WithSerial();
	public static final Comparator<Book> WITH_DATE = new WithDate();
	
	String title;
	int serial;
	int yyyy;
	int mm;
	int dd;
	int date;
	
	public Book(String t, int s, int y, int m, int d) {
		title = t;
		serial = s;
		yyyy = y;
		mm = m;
		dd = d;
		date=yyyy*100+mm*10+dd;
	}
	
	@Override
	public int compareTo(Book b) {
		return this.title.compareTo(b.title);
	}
}

class WithDate implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return b1.date - b2.date;
	}
}
class WithSerial implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return b1.serial-b2.serial;
	}
}
class WithName implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return b1.title.compareTo(b2.title);
	}
}