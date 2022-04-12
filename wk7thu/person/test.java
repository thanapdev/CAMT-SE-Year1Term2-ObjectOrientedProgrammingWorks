package person;

public class test {
    public static void main(String[] args) {
        Person someguy = new Person("NPC", "Village", (long) 1919191, "goodsmilenpc@yahoo.com");
        System.out.println(someguy.toString());

        System.out.println();

        Student stu1 = new Student("thanapong", "Home", (long) 815425851, "642115022@gmail.com", "Your waifu");
        System.out.println(stu1.toString());

        System.out.println();

        Employee emp1 = new Employee("AJ", "CAMT", (long) 15884, "AJ.camt@gmail.com", "401", 400000);
        System.out.println(emp1.toString());

        System.out.println();

        FacultyMember fam1 = new FacultyMember("someone", "Oishi's room", (long) 854225, "someone1@gmail.com", 20, "A","somefal ", 35000);
        System.out.println(fam1.toString());

        System.out.println();

        StaffMem stm1 = new StaffMem("someoneagain", "Sound room", (long) 85642, "someone2@facebook.com", "Mystery" ,"somefal ", 35000);
        System.out.println(stm1.toString());
    }
}
