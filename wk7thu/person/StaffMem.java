package person;

public class StaffMem extends Employee {
    String title;

    public StaffMem(String n, String add, Long phnum, String email, String title, String ofi, int sla) {
        super(n, add, phnum, email, ofi, sla);

        this.title = title;
    }

    public String toString() {
        return " ((Staff Member)) " + '\n' +"   Name : " + name + '\n' +"   Address : " + address + '\n' +"   Phonenumber : " + phonenum
                + '\n' +"   Email : " + email + '\n' +"   title : " + title;
    }
}
