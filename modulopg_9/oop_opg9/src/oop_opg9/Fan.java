package oop_opg9;

import java.util.*;

public class Fan {

    //attributter
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;

    private  int speed = 1;
    private  boolean on = false;
    private  double radius = 5;
    private  String color = "blue";

    public Fan(String color, double radius, boolean on, int speed) {
        this.speed = (speed);
        this.color = (color);
        this.on = (on);
        this.radius = (radius);
    }

    public Fan() {

        this("blue", 2.0, true, 3);
    }

    public void setSpeed(int speed) {
        if (speed == 1) {
            this.speed = speed;

        } else if (speed == 2) {
            this.speed = speed;

        } else if (speed == 3) {
            this.speed = speed;
        } else {
            System.out.println("i can't go that speed!");
        }

    }

    public int getSpeed() {
        return this.speed;

    }

    public void setOn(boolean isOn) {
        if (isOn == true) {
            this.on = true;
        } else if (isOn == false) {
            this.on = false;
        } else {
            System.out.println("Sorry, i don't understand that");
        }

    }

    public boolean isOn() {
        return this.on;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        if (radius < 20.0) {
            this.radius = radius;
        } else {
            System.out.println("I can't go that big");
        }
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public String toString() {
        String text;
        if (this.on == true) {
            text = (String) ("I'm at speed: " + this.getSpeed() + ", i'm the color: " + this.color + ", I have a radius of: " + this.radius);
        } else {
            text = (String) ("Fan is off, i'm: " + this.color + ", I have a radius of: " + this.radius);

        }
        return text;
    }

    public String toString(Date date) {
        String text = (this.toString() + " " + date.toString());
        return text;
    }

}
