package design.patterns.prototype;

public class Book {

    private int bid;
    private String bname;

    public int getBid() {
        return bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                '}';
    }
}

