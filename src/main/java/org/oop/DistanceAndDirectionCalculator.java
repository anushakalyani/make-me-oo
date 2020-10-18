package org.oop;

public class DistanceAndDirectionCalculator {
    public static double distance(Point from, Point to) {
        return Point.calculateDistance(from,to);
    }

    public static double direction(Point from, Point to) {
        return Point.calculateDirection(from,to);
    }
}
