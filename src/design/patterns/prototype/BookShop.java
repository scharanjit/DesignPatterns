package design.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

    private String name;
    List<Book> bookList = new ArrayList<Book>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", bookList=" + bookList +
                '}';
    }


    public void loadData() {
        for (int i = 0; i < 10; i++) {
            Book book = new Book();
            book.setBid(i);
            book.setBname("Book " + i);
            getBookList().add(book);
        }
    }


//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        for (Book book : this.getBookList()) {
            bookShop.getBookList().add(book);
        }
        return bookShop;
    }

}
