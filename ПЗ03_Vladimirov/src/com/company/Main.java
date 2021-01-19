package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n---Задание 1---\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");

        int number = sc.nextInt();

        System.out.println(number < 100 ? "less": "not less");

        //Задание 2

        System.out.println("\n---Задание 2---\n");
        sc = new Scanner(System.in);
        System.out.println("Введите оценку");

        number = sc.nextInt();

        switch(number)
        {
            case (2):
                System.out.println("Неудовлетворительно");
                break;
            case (3):
                System.out.println("Удовлетворительно");
                break;
            case (4):
                System.out.println("Хорошо");
                break;
            case (5):
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Такой оценки нет");
                break;
        }
        //Задание 3

        System.out.println("\n---Задание 3---\n");
        sc = new Scanner(System.in);
        System.out.println("Введите название дня недели с большой буквы");

        String day = sc.nextLine();

        switch(day)
        {
            case("Воскресенье"):
                System.out.println("0");
                break;
            case("Понедельник"):
                System.out.println("1");
                break;
            case("Вторник"):
                System.out.println("2");
                break;
            case("Среда"):
                System.out.println("3");
                break;
            case("Четверг"):
                System.out.println("4");
                break;
            case("Пятница"):
                System.out.println("5");
                break;
            case("Суббота"):
                System.out.println("6");
                break;
            default:
                System.out.println("День недели введён неверно");
                break;
        }
        //Задание 4

        System.out.println("\n---Задание 4---\n");
        sc = new Scanner(System.in);
        System.out.println("Введите баллы студента");

        number = sc.nextInt();

        if(number > 100)
        {
            System.out.println("Система оценивания стобальная!!!!");
        }
        else
        {
            if(number <= 100 && number > 91) System.out.println("Оценка: A");
            else if(number <= 90 && number > 81) System.out.println("Оценка: B");
            else if(number <= 80 && number > 71) System.out.println("Оценка: C");
            else if(number <= 70 && number > 50) System.out.println("Оценка: D");
            else if(number <= 50) System.out.println("Оценка: F");
        }
        //Задание 5
        System.out.println("\n---Задание 5---\n");
        System.out.println("Номер варианта: " + (1 + 1)%305);

        //Задание 5.1
        System.out.println("\n---Задание 5.1---\n");
        double a = 8.53, b= 13.4, x = 2.5, y = 0;

        y = Main.First(a, b, x);
        System.out.println("1) ( При x = 2,5 ) y = " + y);

        x = -3.1;

        y = Main.First(a, b, x);
        System.out.println("2) ( При x = -3,1 ) y = " + y);
        //Задание 5.2
        System.out.println("\n---Задание 5.2---\n");
        a = 7.1; b = 3.2; x = -3.04;

        y = Main.Second(a, b, x);
        System.out.println("1) y = " + y);

        x = 2.16;

        y = Main.Second(a, b,  x);
        System.out.println("2) y = " + y);

        x = 5.37;

        y = Main.Second(a, b, x);
        System.out.println("3) y = " + y);
    }

    public static double First(double a, double b, double x)
    {
        if(x > 0)
            return(a+1/2*Math.exp(-x));
        else
            return(Math.cos(b*x+1));
    }


    public static double Second(double a, double b, double x)
    {
        if(x <= 0)
            return(a+1/2*Math.exp(-x));
        else if(x > 0 && x < 4)
            return(Math.sin(b*b*x));
        else
            return(Math.sqrt(x*x+2*a));

    }
}

