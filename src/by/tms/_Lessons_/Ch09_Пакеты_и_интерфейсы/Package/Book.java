package by.tms._Lessons_.Ch09_Пакеты_и_интерфейсы.Package;

public class Book { //класс являеться частью пакета
protected String Title;
protected String Author;
protected int PubDate;

public Book(String t, String a, int d) {
    Title = t;
    Author = a;
    PubDate = d; }

public void show() {System.out.println(Title);
System.out.println(Author);
System.out.println(PubDate);
System.out.println();}
}

class BookDemo { //класс также входит пакет
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("Книга 1", "кто-то", 1998);
        books[1] = new Book("Книга 2", "кто-то", 2558);
        books[2] = new Book("Книга 3", "4кто-то", 1250);
        books[3] = new Book("Книга 55", "кто-то", 1997);
        books[4] = new Book("Книга 123", "2кто-то", 1998);

        for (Book book : books) book.show();
    }
}
