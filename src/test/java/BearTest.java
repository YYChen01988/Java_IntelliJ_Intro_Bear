import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Baloo", 12, 95.62);
    }

    @Test
    public void hasName(){

        String name = bear.getName();
        //alt+Enter and then choose second option (org.junit)
        assertEquals("Baloo", name);
    }

    @Test
    public void hasAge(){
        int age = bear.getAge();
        assertEquals(12, age);
    }

    @Test
    public void hasWeight(){
        double weight = bear.getWeight();
        assertEquals(95.62, weight, 0.01);
        //when test in double, you need to put in third number
        // in assert equal, it means result +- delta are acceptable
    }

    @Test
    public void readyToHibernateIfGreaterThan80(){
        boolean readyToHibernate = bear.isReadyToHibernate();
        assertEquals(true, readyToHibernate);
    }

    @Test
    public void notReadyToHibernateIfGreaterThan80(){
        Bear thinBear = new Bear("Yogi", 25, 65.88);
        boolean readyToHibernate = thinBear.isReadyToHibernate();
        assertEquals(false, readyToHibernate);
    }
}
