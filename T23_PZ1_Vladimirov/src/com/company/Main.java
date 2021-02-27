package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String strcript = "", strdecript = "";
        System.out.println("+------------------------> Шифр Цезаря <------------------------+");
        Scanner input = new Scanner(System.in);
        System.out.print("Введите слово > ");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++)
        {
            strcript += (char)(str.charAt(i) + 4);
        }
        System.out.println("Закодированное сообщение >>  " + strcript + "  <<");
        for (int j = 0; j < strcript.length(); j++)
        {
            strdecript += (char)(strcript.charAt(j) - 4);
        }
        System.out.println("Декодированное сообщение >>>  " + strdecript + "  <<<");
    }
}
