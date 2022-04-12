package person;

public class FacultyMember extends Employee {
    int officehour;
    String rank;

    public FacultyMember(String n, String add, Long phnum, String email, int ofih, String rank ,String ofi, int sla) {
        super(n, add, phnum, email, ofi, sla);

        this.officehour = ofih;
        this.rank = rank;
    }

    public String toString() {
        return " ((Faculty Member)) " + '\n' +"   Name : " + name + '\n' + "   Address : " + address + '\n' + "   Phonenumber : " + phonenum
                + '\n' +"   Email : " + email + '\n' + "   Office Hours : " + officehour + '\n' + "   Rank : " + rank;
    }
}
