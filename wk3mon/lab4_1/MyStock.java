//thanapong yamkamol
//642115022

package lab4_1;

public class MyStock {
    public static void main(String[] args) {
        Stock Mystock = new Stock("ORCL","Oracle Corporation",34.5,35);
        System.out.println("Symbol: "+Mystock.getsymbol());
        System.out.println("Name: "+Mystock.getname());
        System.out.println("Previous Closing: "+Mystock.previousClosingPrice());
        System.out.println("Current Price: "+Mystock.currentPrice());
        System.out.println("Price Change: "+Mystock.getChangPercent());
    }
}
