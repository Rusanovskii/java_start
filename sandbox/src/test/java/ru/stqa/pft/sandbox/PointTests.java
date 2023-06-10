package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void testDistance(){
        Point p1 = new Point(5.0,8.0);
        Point p2 = new Point(8.0,5.0);
        Assert.assertEquals(p1.distance(p1,p2),4.242640687119285);
    }
}
