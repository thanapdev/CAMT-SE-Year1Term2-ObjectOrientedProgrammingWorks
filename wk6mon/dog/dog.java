package dog;

public class dog {
    private String name;
    private int age;

    public dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void DogName(String dname) {
        name = dname;
    }

    public void DogAge(int dage) {
        age = dage;
    }

    public String getDogName() {
        return name;
    }

    public int getDogAge() {
        return age;
    }

    public int humanage() {
        return age * 7;
    }

    public String toString() {
        return "Name : " + name + "\n" + "Age : " + age + "\n" + "Humanage : " + humanage();
    }

}
