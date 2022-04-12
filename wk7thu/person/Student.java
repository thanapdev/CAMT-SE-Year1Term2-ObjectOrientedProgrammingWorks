package person;

public class Student extends Person {
    String status;

    public Student(String n, String add, Long phnum, String email, String status) {
        super(n, add, phnum, email);
        this.status = status;
    }

    public String toString() {
        return " ((Student)) " + '\n' +"   Name : " + name + '\n' +"   Address : " + address + '\n' +"   Phonenumber : " + phonenum
                + '\n' +"   Email : " + email +'\n' + "   Status : " + status;
    }
}
