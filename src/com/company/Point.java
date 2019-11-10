package com.company;

import java.util.Scanner;

public class Point {
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    private double x,y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point() {}

    void move(double dx, double dy){
        x += dx;
        y+= dy;
    }

    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = in.nextDouble();
        System.out.println("Enter y: ");
        double y = in.nextDouble();
        move(x,y);
    }

    double getDistance(Point a){
        return Math.sqrt(Math.pow(this.x -a.x,2)+ Math.pow(this.y -a.y,2));
    }

}
