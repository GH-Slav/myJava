package by.tms._Lessons_.Ch09_Пакеты_и_интерфейсы.Package.UseBook;

import by.tms._Lessons_.Ch09_Пакеты_и_интерфейсы.Package.Book;

public class UseBook {
    public static void main(String[] args) {
 Book[] books = new Book[2]; //перед классом указываеться имя пакета
        books[0] = new Book("Книга 033", "5кто-то", 2015);
        books[1] = new Book("Книга 77", "кто-то", 1902);
        for (Book book : books) book.show();
    }
}
