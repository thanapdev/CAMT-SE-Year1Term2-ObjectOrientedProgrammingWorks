package car;

public class car {
    private String car;
    private String model;
    private int year;

    public car(String car ,String model, int year) {
        this.car = car;
        this.model = model;
        this.year = year;
    }

    public void Brand(String bcar) {
        car = bcar;
    }

    public void CarModel(String cmodel) {
        model = cmodel;
    }

    public void CarYear(int cyear) {
        year = cyear;
    }

    public String getBrand() {
        return car;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean checkCaryear() {
        return year > 45;
    }

    public String toString() {
        return "Car : " + car + "\n" + "Model : " + model + "\n" + "year : " + year + "\n" + "Is it antique : " + checkCaryear();
    }

}
