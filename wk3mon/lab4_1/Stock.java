//thanapong yamkamol
//642115022

package lab4_1;

public class Stock {
    private String symbol;
    private String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String sb,String nm, double pcp , double cp){
        symbol = sb;
        name = nm;
        previousClosingPrice = pcp;
        currentPrice = cp;
    }

    public double getChangPercent(){
        return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
    }

    public String getname() {
        return name;
    
    }
    public String getsymbol() {
        return symbol;
    }

    public double previousClosingPrice() {
        return previousClosingPrice;
    }
    
    public double currentPrice() {
        return currentPrice;
    }
    
}
