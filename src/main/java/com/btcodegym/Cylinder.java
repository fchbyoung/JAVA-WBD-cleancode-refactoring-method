package com.btcodegym;

public class Cylinder {

    public static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    public static double getVolume(int radius , int height){
        double base = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * base;
        return volume;
    }

}
