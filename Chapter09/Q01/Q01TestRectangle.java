package homework.chapter09.Q01;

import homework.chapter09.Q01.Q01Rectangle;

public class Q01TestRectangle {
    public static void main(String[] args) {

        Q01Rectangle r1 = new Q01Rectangle(4, 40);
        Q01Rectangle r2 = new Q01Rectangle(3.5, 35.9);

        System.out.println("second rectangle\nwidth: " + r1.width + "\nheight: " + r1.height
                + "\narea: " + r1.getArea() + "\nperimeter: " + r1.getPerimeter());
        System.out.println();
        System.out.println("first rectangle\nwidth: " + r2.width + "\nheight: " + r2.height
                + "\narea: " + r2.getArea() + "\nperimeter: " + r2.getPerimeter());
    }
}
