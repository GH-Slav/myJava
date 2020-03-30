package by.tms._Lessons_.Ch09_Пакеты_и_интерфейсы.Package.UseBook;

import by.tms._Lessons_.Ch09_Пакеты_и_интерфейсы.Package.Book;

public class ExtBook extends Book {
    private String publishter;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publishter = p;
    }

    public void show() {
        super.show();
        System.out.println(publishter);
        System.out.println();
    }

    public String getPublishter() { return publishter; }
    public void setPublishter(String p) { publishter = p; }

    public String getTitle() { return Title; }
    public void setTitle(String t) { Title = t; }

    public String getAuthor() { return Author; }
    public void setAuthor(String a) { Author = a; }

    public int getPubDate() { return PubDate; }
    public void setPubDate(int d) { PubDate = d; }
}

class ProtectDemo {
    public static void main(String[] args) {
        ExtBook[] books = new ExtBook[6];
        books[0] = new ExtBook("Книга 1", "кто-то", 1997, "Вильямс");
        books[1] = new ExtBook("Книга 2", "кто-то", 1988, "ВВильямс");
        books[2] = new ExtBook("Книга 44", "4кто-то", 1999, "ВВильямс");
        books[3] = new ExtBook("Книга 666", "999кто-то", 1997, "ВВильямс");
        books[4] = new ExtBook("Книга 96", "66кто-то", 1988, "ВВильямс");
        books[5] = new ExtBook("Книга 4", "4кто-то", 1910, "Вильямс");
        for (Book book : books) book.show();

        //Поиск книг
        System.out.println();
        System.out.println("Все книги по 'Вильямс'");
        int i;
        for (i = 0; i < books.length; i++)
            if (books[i].getPublishter() == "Вильямс") ;{
        System.out.println();
        System.out.println(books[i].getTitle());}

//        books[0].title = "test title"; //Ошибка доступа
    }
}


