package ru.netology;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;


public class CashBackHackServiceTest {

    @Test
    public static void shouldCalculate() {
        CashBackHackService service = new CashBackHackService();

        int amount = 1500;

        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual, expected);


    }

    @Test
    public static void shouldCalculate1000() {
        CashBackHackService service = new CashBackHackService();

        int amount = 1000;

        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);


    }

    @Test
    public static void shouldCalculate1001() {
        CashBackHackService service = new CashBackHackService();

        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, expected);


    }

    @Test
    public static void shouldCalculate999() {
        CashBackHackService service = new CashBackHackService();

        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, expected);


    }




}