package org.oop;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public static double calculateDistance(Point from, Point to){
        return Math.sqrt(Math.pow((to.x-from.x),2)+ Math.pow((to.y-from.y),2));
    }
    public static double calculateDirection(Point from, Point to) {
        return Math.atan2((to.y-from.y),(to.x-from.x) );
    }


}
