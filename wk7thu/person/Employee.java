package person;

public class Employee extends Person {
    private String office;
    private int salary;
    private java.util.Date date;

    public Employee(String n, String add, Long phnum, String email, String ofi, int sla) {
        super(n, add, phnum, email);

        
        this.office = ofi;
        this.salary = sla;
        date = new java.util.Date();

    }

    public String toString() {
        return " ((Employee)) " + '\n' + "   Name : " + name + '\n' +"   Address : " + address + '\n' + "   Phonenumber : " + phonenum +
        '\n' + "   Email : " + email + '\n' +"   Office : " + office + '\n' +"   Salary : " + salary + '\n' +"   Date : " + date;
    }

}
