package homework.chapter09.Q08;

public class Fan {

    final int SlOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    public Fan() { //default
        this.speed = SlOW;
        this.radius = 5;
        this.color = "blue";
    }
    public String toString() {
        if (on) {
            return "speed: " + speed + "\ncolour: " + color + "\nradius: " + radius;
        }
        return "colur: " + color + "\nradius: " + radius + "\nfan is off ";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
