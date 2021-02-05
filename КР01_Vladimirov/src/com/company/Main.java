package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args)
    {
        System.out.println("\n+ ------------ 1. Работа с консолью ------------ +\n");
        System.out.println("\nЗадание: 2 \n");

        Date currentDate = new Date();
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEEEEEE");
        String day = dayFormat.format(currentDate);
        System.out.println(day);
        SimpleDateFormat mounthFormat = new SimpleDateFormat("MMMMMMM");
        String mounth = mounthFormat.format(currentDate);
        System.out.println(mounth);
        System.out.println("Андрей");

        System.out.println("\nЗадание: 4 \n");

        System.out.println("*     *      *");
        System.out.println(" *   * *    * ");
        System.out.println("  * *   * *  ");
        System.out.println("   *     *   ");

        System.out.println("\n+ ------------ 2. Простейшая арифметика ------------ +\n");
        System.out.println("\nЗадание: 2\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Число - > ");
        int a = scanner.nextInt();
        System.out.print("\nКвадрат числа - > " + Math.pow(a,2) + "\nKуб числа - > " + Math.pow(a,3));

        System.out.println("\nЗадание: 8");

        Scanner scannercatet1 = new Scanner(System.in);
        Scanner scannercatet2 = new Scanner(System.in);
        Scanner scannercatet3 = new Scanner(System.in);
        System.out.print("\nKатет - > ");
        int catet1 = scannercatet1.nextInt();
        System.out.print("\nKатет - > ");
        int catet2 = scannercatet2.nextInt();
        System.out.print("\nKатет - > ");
        int catet3 = scannercatet3.nextInt();
        System.out.println("\nПериметр трикутника - > " + (catet1 + catet2 + catet3));
        System.out.println("\nПлоща трикутника - > " + (catet1*catet2)/2);
        System.out.println("\nГипотенуза - > " + Math.sqrt(((catet1*catet1)+(catet2*catet2))));

        System.out.println("\n+ ------------ 3. Условный оператор и арифметика ------------ +\n");
        System.out.println("\nЗадание: 2\n");

        Scanner scannerproverka = new Scanner(System.in);
        System.out.print("\nЧисло - > ");
        int proverka = scannerproverka.nextInt();
        if (proverka < 7)
        {
            System.out.println("Yes");
        }
        else if (proverka > 10)
        {
            System.out.println("No");
        }
        else if (proverka == 9)
        {
            System.out.println("Error");
        }

        System.out.println("\nЗадание: 28");

        Scanner jeslo = new Scanner(System.in);
        System.out.print("\nЧисло - > ");
        int znah = jeslo.nextInt();
        int o,l,k,t;
        if(znah > 999 && znah <=9999)
        {
            o = znah % 10000 / 1000;
            l = znah % 1000 / 100;
            k = znah % 100 / 10;
            t = znah % 10;
            if( o == l || o == k || o == t || l == o || l == k || l == t || k == o || k == l || k == t || t == o || t == l || t == k)
            {
                System.out.println("Есть одинаковые цифры");
            }
            else
                {
                    System.out.println("Нет одинаковых цифр");
                }
        }
        else
            {
                System.out.println("Что то пошло не так!");
            }


        System.out.println("\n+ ------------ 4. Циклы и арифметика ------------ +\n");
        System.out.println("\nЗадание: 2");


        Scanner ranner = new Scanner(System.in);
        System.out.print("\nЧисло - > ");
        int run = ranner.nextInt();
        for (int p = 0; p < run; p++)
        {
            System.out.println("Silence is golden");
        }

        System.out.println("\nЗадание: 33");

        for(int str = 0; str < 30; str++)
        {
            if(str%2 != 0)
            {
                for (int pozi = 0; pozi < str; pozi++) {
                    System.out.print(" " + pozi);
                }
            }
            else
                {
                    System.out.println("\n1 1 1 1 1");
                }
            System.out.print("\n");
        }

        System.out.println("\n+ ------------ 5. Работа с символами ------------ +\n");
        System.out.println("\nЗадание: 2");

        System.out.println("a" + "b" + "c" + "d" + "e" + "\n"
                + "f" + "g" + "h" + "i" + "j" + "\n"
                + "k" + "l" + "m" + "n" + "o" + "\n"
                + "p" + "q" + "r" + "s" + "t" + "\n"
                + "u" + "v" + "w" + "x" + "y" + "\n"
                + "z");

        System.out.println("\nЗадание: 5");

        System.out.print("Введите число от 3 до 7 - > ");
        Scanner scandipoz = new Scanner(System.in);
        int diapoz = scandipoz.nextInt();

        if(diapoz >= 3 && diapoz <=7)
        {
            System.out.println("!" + generateRandomHexString(diapoz -2) + "!");
        }
        else
            {
                System.out.println("Error");
            }
    }
    public static String generateRandomHexString(int length){
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        while(sb.length() < length){
            sb.append(Integer.toHexString(r.nextInt()));
        }
        return sb.toString().substring(0, length);
    }
}
