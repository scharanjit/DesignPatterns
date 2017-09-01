package design.patterns.prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {

        BookShop bookShop = new BookShop();
        System.out.println(bookShop);
        bookShop.loadData();
//        bookShop.getBookList().remove(2); //this also affecting bookshop1


        //instead of every time loading data

//        BookShop bookShop1 = (BookShop) bookShop.clone();
//        bookShop1.getBookList().remove(2);
//        //shallow cloning --deep cloning in Java
//        System.out.println(bookShop);
//        System.out.println(bookShop1);

        //solution is deep cloning

        BookShop bookShop2 = bookShop.clone();
        bookShop2.getBookList().remove(2);
        System.out.println(bookShop);
        System.out.println(bookShop2);  //the index book removed only from bookshop 2 ==> deep cloning


    }
}
