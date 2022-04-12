package Lab13_1;

class Employee {
    private String name;
    public Employee(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

// admin 
class Admin extends Employee{
    public Admin(String name){
        super(name);
    }
    public void management(){
        System.out.println(getName() + "admin still working on management!");
    }
}

//janitor 
class Janitor extends Employee{
    public Janitor(String name){
        super(name);
    }
    public void cleaning(){
        System.out.println(getName() + "I'm cleaning now!");
    }
}

//receptionist
class Receptionist extends Employee{
    public Receptionist(String name){
        super(name);
    }
    public void welcome(){
        System.out.println(getName() + "Hello welcome!");
    }
}

//it
class IT extends Employee{
    public IT(String name){
        super(name);
    }
    public void development(){
        System.out.println(getName() + "developing new webpage!");
    }
}