package day39_CustomClass_Statics.circleTask;

import java.text.DecimalFormat;

public class Circle {

    public double radius, diameter;
    //   public static double PI = 3.14; // only one copy of static variables will be shared by all circle objects

    public void setInfo(double radius){
        this.radius = radius;
        diameter = 2 * radius;
    }

    public double area(){
        return radius * radius * Math.PI;
    }

    public double perimeter(){
        return diameter * Math.PI;
    }


    public String toString() {
        DecimalFormat df= new DecimalFormat("0.000");
        return "Circle{" +
                "radius= " + radius +
                ", diameter= " + diameter +
                ", area= " + df.format( area()  )+
                ", perimeter= " + df.format( perimeter() ) +
                '}';
    }
}

/*
CircleTask
		1. create a class named Student that has the followings features
            Attributes:
                    radius, diameter

                methods:
                    caculateArea(): returs the area of the circle
                    calculatePerimeter(): returns the perimeter of the circle
                    setInfo(): initializes all the instance of the Circle
                    toString(): displays the radius, diameter, perimeter and area of the circle object


 */