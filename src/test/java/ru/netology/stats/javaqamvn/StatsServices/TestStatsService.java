package ru.netology.stats.javaqamvn.StatsServices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestStatsService {


    @Test

    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shoudFibdAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void souldFindSumOfMonthsSalesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.sumOfMonthsSalesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindSumOfMonthsSalesAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.sumOfMonthsSalesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
