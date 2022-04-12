package Lab13_2;

public class main2 {
    public static void main(String[] args) {

        Novels book1 = new Novels("Harvy Bocter", "Harvy",350);

        Magazine book2 = new Magazine("Misteen malakaaa", "Saw Misteen" , 120);

        Journals book3 = new Journals("Su vs Big Dog Maruay", "Su " , 50);

        Textbooks book4 = new Textbooks("Someone write it now ", "No" ,0);

        book1.novels();
        book2.magazine();
        book3.journals();
        book4.textbooks();
    }
}
