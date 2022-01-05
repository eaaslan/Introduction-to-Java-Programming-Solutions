package homework.chapter09.Q09;

import homework.chapter09.Q09.RegularPolygon;

public class TestRegularPolygon {
    public static void main(String[] args) {

        RegularPolygon r1 = new RegularPolygon();
        RegularPolygon r2 = new RegularPolygon(6, 4);
        RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.printf("Perimeter: %5.2f Area: %4.2f\n",r1.getPerimeter() , r1.getArea());
        System.out.printf("Perimeter: %5.2f Area: %4.2f\n",r2.getPerimeter() , r2.getArea());
        System.out.printf("Perimeter: %5.2f Area: %4.2f\n",r3.getPerimeter() , r3.getArea());
    }
}
