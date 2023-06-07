package ru.stqa.pft.sandbox;

public class MyFirstProgram {
//Класс был помещен в пакет, нужно ли прописывать полностью имя с указанием пакета в build.gradle?
    public static void main(String[] args) {
// Используем переменную и для вывода простого слова, на случай его замены
        String any = "World";
        System.out.println("Hello, "  + any + "!");
// Изучил применение стандартных матетематических операций
        System.out.println(2 + 2);
        System.out.println(2 - 2);
        System.out.println(2*2);
        System.out.println(2 / 2);
        System.out.println(2.0 / 1);
        System.out.println(1.0/2);
// Изучил метод конкатенации
        System.out.println("2" + "2");
        System.out.println("2" + 2);
        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);
        System.out.println("2 + 2 = " + (2 + 2));
// Изучил использование переменной
        double l = 8.0;
        double s = l * l;
        System.out.println("Площадь квадрата со стороной " + l + " = " + s);

    }
}



