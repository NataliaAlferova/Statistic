package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum () {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.getSumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSum () {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.getAverageSumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findMinSalesMonth () {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinSalesMonth(sales);

        assertEquals(expected, actual);
    }

 @Test
     void findMaxSalesMonth () {
        StatsService service = new StatsService();

       int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
       int expected = 8;
       int actual = service.findMaxSalesMonth(sales);

       assertEquals(expected, actual);
    }

    @Test
    void getAmountUnderAverage () {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getAmountUnderAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void getAmountMoreAverage () {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getAmountMoreAverage(sales);

        assertEquals(expected, actual);
    }
}




