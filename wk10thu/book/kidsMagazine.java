//thanapong yamkamol
//642115022

package book;
public class kidsMagazine extends magazine {
    private String ageRange;

    public kidsMagazine() {
        super();
    }
    public kidsMagazine(String publisher, int noOfPages, double price, String title, String pubUnit, String ageRange) {
        super(publisher, noOfPages, price, title, pubUnit);
        this.ageRange = ageRange;
    }

    public String getPubUnit() {
        return this.ageRange;
    }

    public void setPubUnit(String ageRange) {
        this.ageRange = ageRange;
    }

    public String toString() {
        return super.toString()+"\nAge Range: "+ageRange;
    }
}