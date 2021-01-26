package com.company;
import java.lang.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n+ ---------- Задание 1 ---------- +\n");

        Person tom = new Person();
        tom.displayInfo();


        tom.name = "Tom";
        tom.age = 34;
        tom.displayInfo();

        Person bob = new Person();
        bob.displayInfo();

        Person tom2 = new Person("Tom");
        tom2.displayInfo();

        Person sam = new Person("Sam", 25);
        sam.displayInfo();

        System.out.println("\n+ ---------- Задание 2 ---------- +\n");

        Circle k1 = new Circle(3.1, 4.1, 5.1, "\u201c");
        System.out.println("Длина окружности = " + k1.getLength() + " см\n\n");

        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус > ");
        double r = source.nextDouble();
        k1.setR(r);
        System.out.println("Длина окружности = " + k1.getLength() + " см");



    }
}

class Circle
{
    private double x;
    private double y;
    private double r;
    private String colour;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Circle(double x, double y, double r, String colour)
    {
        this.x = x;
        this.y = y;
        this.r = r;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", colour='" + colour + '\'' +
                '}';
    }

    public double getLength()
    {
        double c;
        c = 2*Math.PI*r;
        return c;
    }
}


class Person{

    String name;    // имя
    int age;        // возраст
    Person()
    {
        name = "Undefined";
        age = 18;
    }
    Person(String n)
    {
        name = n;
        age = 18;
    }
    Person(String n, int a)
    {
        name = n;
        age = a;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}