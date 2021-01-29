package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static class Rectangle {
        public int sideA;
        public int sideB;

        public Rectangle(int x, int y) {
            super();
            sideA = x;
            sideB = y;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Rectangle))
                return false;
            Rectangle ref = (Rectangle) obj;
            return (((this.sideA == ref.sideA) && (this.sideB == ref.sideB)) ||
                    (this.sideA == ref.sideB) && (this.sideB == ref.sideA));
        }
    }

    public class Test {
        public Test() {
        }
    }

    public static void main(String[] args)
    {
        System.out.println("+ --------------- Задание 1 --------------- +\n");

        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(10,10);
        Rectangle r3 = new Rectangle(20,10);
        System.out.println("r1.equals(r1) == " + r1.equals(r1));
        System.out.println("r1.equals(r2) == " + r1.equals(r2));
        System.out.println("r1.equals(r3) == " + r1.equals(r3));
        System.out.println("r2.equals(r3) == " + r2.equals(r3));
        System.out.println("r1.equals(null) == " + r1.equals(null));

        System.out.println("\n+ --------------- Задание 2 --------------- +\n");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        System.out.println(" Initialy set date: " + sdf.format(cal.getTime()));
        cal.set(Calendar.MONTH,Calendar.SEPTEMBER);
        System.out.println(" Date with month changed : " + sdf.format(cal.getTime()));
        cal.set(Calendar.DAY_OF_MONTH,30);
        System.out.println(" Date with day changed : " + sdf.format(cal.getTime()));
    }
}
