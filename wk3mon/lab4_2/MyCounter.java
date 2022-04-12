//thanapong yamkamol
//642115022

package lab4_2;
public class MyCounter {
    public static void main(String[] args) {
       Counter c1 = new Counter(0);
       c1.click();
       c1.click();
       System.out.println("c1 current count is: "+ c1.getCount());
       c1.reset();
       System.out.println("c1 after reset count is: "+ c1.getCount());
       Counter c2 = new Counter(0);
       c2.click();
       c2.click();
       c2.click();
       System.out.println("c2 current count is: "+ c2.getCount());
       c2.reset();
       System.out.println("c2 after reset count is: "+ c2.getCount());
    }
}
