package ru.netology.stats.javaqamvn.StatsServices;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }


    public long averageSales(long[] sales) {
        long sum = sumSales(sales);
        return sum / sales.length;
    }

    public int sumOfMonthsSalesBelowAverage(long[] sales) {
        int count = 0;
        long avg = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                count = count + 1;
            }
        }
        return count;
    }

    public int sumOfMonthsSalesAboveAverage(long[] sales) {
        int count = 0;
        long avg = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                count = count + 1;
            }
        }
        return count;
    }
}


