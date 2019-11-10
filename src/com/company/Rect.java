package com.company;

public class Rect {
    public double getWidth() {
        if(Math.abs(pointR.getX()-pointL.getX()) == width){
            return  width;
        }
        System.out.println("Ширина по точкам и по значению не сходится. Проверьте значения и попробуйте еще раз");
        return 0;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        if(Math.abs(pointR.getY()-pointL.getY()) == height){
            return  height;
        }
        System.out.println("Длина по точкам и по значению не сходится. Проверьте значения и попробуйте еще раз");
        return 0;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double width;
    private double height;

    public Rect(Point pointL, Point pointR) {
        this.pointL = pointL;
        this.pointR = pointR;
        this.width = Math.abs(pointR.getX() - pointL.getX());
        this.height = Math.abs(pointR.getY() - pointL.getY());
    }

    private Point pointL;// левая нижняя точка прямоугольника
    private Point pointR;// правая верхняя точка прямоугольника

    public Rect(double width,double height){
        this.width =width;
        this.height =height;
        pointL = new Point();
        pointR = new Point(width,height);
    }

    double getArea(){

        System.out.println(getHeight()*getWidth());
        return width*height;
    }

    Rect magnify(double koeff){
        this.width *= koeff;
        this.height *= koeff;
        System.out.println(this.getClass().getName() + "   width:" + this.width + "   height:" + this.height);
        return this;
    }
}
