package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {
    @Test
    public void testArea(){
        Square s = new Square(5);
        // через ключевое слово assert и двойной знак == мы сравниваем полученное значение с желаемым
        assert s.area() == 25;
        // при помощи функции assertEquals
        Assert.assertEquals(s.area(),25);
    }
}
