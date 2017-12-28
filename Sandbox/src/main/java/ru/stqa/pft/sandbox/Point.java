package ru.stqa.pft.sandbox;

/**
 * Created by nina on 28.12.2017.
 */


public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {

        Point p1 = new Point(3, 0);
        Point p2 = new Point(9, 5);
        System.out.println("Расстояние между точками (" + p1.x + ", " + p1.y + ")" + " и " + "(" + p2.x + ", " + p2.y + ")" + " = " + distance(p1, p2));

    }

    public static double distance(Point p1, Point p2) {
        double a = Math.pow(Math.abs(p1.x - p2.x), 2);
        double b = Math.pow(Math.abs(p1.y - p2.y), 2);
        return Math.sqrt(a + b);

    }


}