package ru.netology.javadz.javadzmvn3.services;

public class StatsService {

    public long totalSales(long[] sales) {
        long total = 0;

        for (int i = 0; i < sales.length; i++) {
            total += (int) sales[i];
        }
        return total;
    }

    public long averageSalesMonth(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += (int) sales[i];
        }
        return sum / sales.length;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long lessAverageSales(long[] sales) {
        long averageSalesMonth = averageSalesMonth(sales);
        long lessSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSalesMonth > sales[i]) {
                lessSales++;
            }
        }
        return lessSales;
    }

    public long moreAverageSales(long[] sales) {
        long averageSalesMonth = averageSalesMonth(sales);
        long moreSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSalesMonth < sales[i]) {
                moreSales++;
            }
        }
        return moreSales;
    }

}

