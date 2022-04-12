package person;

public class Person {
    String name;
    String address;
    Long phonenum;
    String email;

    public Person(String n, String add, Long phnum, String email) {
        this.name = n;
        this.address = add;
        this.phonenum = phnum;
        this.email = email;
    }

    public String toString() {
        return " ((Person)) " +'\n' + "   Name : " + name + '\n' +"   Address : " + address + '\n' +"   Phonenumber : " + phonenum
                + '\n' + "   Email : " + email;
    }

}
