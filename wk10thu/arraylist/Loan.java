//thanapong yamkamol
//642115022

package arraylist;

public class Loan {
    private String name;
    private double loan;
    public Loan() {}
    public Loan(String name, double loan) {
        this.name = name;
        this.loan = loan;
    }

    public String getName() {
        return this.name;
    }
    public double getLoan() {
        return this.loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: "+this.name+"\nLoan: "+this.loan;
    }
}
