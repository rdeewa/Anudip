package L_Three;

class cars {
    private String make;
    private String model;
    private int year;
    private String color;
    // Getter and setter methods for make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getter and setter methods for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and setter methods for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    // Getter and setter methods for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class Main_car {

    public static void main(String[] args) {
        cars myCar = new cars();

        // Set car properties
        myCar.setMake("Toyota");
        myCar.setModel("Camry");
        myCar.setYear(2022);
        myCar.setColor("Red");

        // Print car details
        System.out.println("Car Details:");
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Color: " + myCar.getColor());
    }
}
