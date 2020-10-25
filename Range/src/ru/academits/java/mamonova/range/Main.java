package ru.academits.java.mamonova.range;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало диапазона: ");
        double from = scanner.nextDouble();

        System.out.println("Введите конец диапазона: ");
        double to = scanner.nextDouble();

        Range range = new Range(from, to);

        double rangeLength = range.getLength();

        System.out.println("Введите число: ");
        double number = scanner.nextDouble();

        if (!range.isInside(number)) {
            System.out.println("Заданного числа нет в диапазоне.");
        } else {
            range.setTo(number);
            double newRange1Length = range.getLength();

            range.setFrom(number);
            range.setTo(to);
            double newRange2Length = range.getLength();

            System.out.println("Длина диапазона: " + rangeLength);
            System.out.println("Число " + number + " разбивает диапазон на: " + newRange1Length + " и " + newRange2Length);
        }
    }
}