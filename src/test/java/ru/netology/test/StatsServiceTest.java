package ru.netology.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void totalSumMonths () {
        StatsService service = new StatsService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageSalesAmount () {
        StatsService service = new StatsService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMid = 15;
        int actualMid = service.midMonthSales(sales);

        Assertions.assertEquals(expectedMid, actualMid);
    }

    @Test
    public void minMonthSalesScore () {
        StatsService service = new StatsService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void maxMonthSalesScore () {
        StatsService service = new StatsService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void belowMidMonthSales () {
        StatsService service = new StatsService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualMonth = service.belowMidMonthSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void aboveMidMonthSales () {
        StatsService service = new StatsService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonthSum = 5;
        int actualMinMonthSum = service.aboveMidMonthSales(sales);

        Assertions.assertEquals(expectedMinMonthSum, actualMinMonthSum);
    }
}
