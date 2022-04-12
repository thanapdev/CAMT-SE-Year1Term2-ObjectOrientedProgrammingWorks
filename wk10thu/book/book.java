//thanapong yamkamol
//642115022

package book;

public class book extends Public {
    private String author;

    public book() {
        super();
    }
    public book(String publisher, int noOfPages, double price, String title, String author) {
        super(publisher, noOfPages, price, title);
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return super.toString()+"\nAuthor: "+author;
    }
}