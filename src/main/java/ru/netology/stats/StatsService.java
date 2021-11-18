package ru.netology.stats;

public class StatsService {
    public int getSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return (sum);
    }

    public int getAverageSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        int average = sum / 12;

        return (average);
    }

    public int findMinSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
                }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findMaxSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getAmountUnderAverage(int[] sales) {
        int average = getAverageSumSales(sales);
        int counter = 0;
        for (int sale : sales) {
            if ( sale < average) {
               counter++;
            }
        }
        return counter;
    }

    public int getAmountMoreAverage(int[] sales) {
        int average = getAverageSumSales(sales);
        int counter = 0;
        for (int sale : sales) {
            if ( sale > average) {
                counter++;
            }
        }
        return counter;
    }
}