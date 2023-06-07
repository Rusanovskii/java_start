package ru.stqa.pft.sandbox;

public class MyFirstProgram {
//Класс был помещен в пакет, нужно ли прописывать полностью имя с указанием пакета в build.gradle?
    public static void main(String[] args) {
        // Передаем значение для переменной any указывая его в парпметре функции
        hello("World");
        hello("Mr Barantsev");
        hello("Java");

        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));
    }
    public static void hello(String any) {
        // Указываем, в параметре используемой в main функции, что any это строка
        System.out.println("Hello, "  + any + "!");
    }

    public static double area (double v) {
        return v * v;
    }
    public static double area (double a, double b) {
        return a * b;
    }
}



