package homework.chapter09.Q01;

public class Q01Rectangle {

    double width;
    double height;

    Q01Rectangle() {
        width = 1;
        height = 1;
    }
    Q01Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea() {
        return width * height;
    }
    double getPerimeter() {
        return 2 * (width + height);
    }
}
