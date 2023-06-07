package ru.stqa.pft.sandbox;

public class MyFirstProgram {
//Класс был помещен в пакет, нужно ли прописывать полностью имя с указанием пакета в build.gradle?
    public static void main(String[] args) {
        // Передаем значение для переменной any указывая его в парпметре функции
        hello("World");
        hello("Mr Barantsev");
        hello("Java");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        Point p = new Point()
        System.out.println("Вычисляем расстояния между " + p.p1 + " и " + p.p2 + " = " + r.area());
    }
    public static void hello(String any) {
        // Указываем, в параметре используемой в main функции, что any это строка
        System.out.println("Hello, "  + any + "!");
    }


}



