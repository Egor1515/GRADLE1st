package ru.netology;

import org.junit.Assert;
import org.junit.Test;


public class CashBackHackServiceTest {
    CashBackHackService service = new CashBackHackService();


    @Test

    public void shouldCalculate() {
        int amount = 1500;


        int expected = 500;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void shouldCalculate1() {
        int amount = 1000;

        int expected = 1000;
        int actual = service.remain(amount);


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculate2() {
        int amount = 999;


        int expected = 1;
        int actual = service.remain(amount);


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculate3() {
        int amount = 1001;


        int expected = 999;
        int actual = service.remain(amount);


        Assert.assertEquals(expected, actual);
    }


}

