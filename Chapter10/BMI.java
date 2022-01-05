package homework.chapter10;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;
    public static final double INCH_PER_FOOT = 12;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
class TestBMI {
    public static void main(String[] args) {
        BMI bmi = new BMI("Enes",20,40);
        System.out.println(bmi.getAge());
    }
}
