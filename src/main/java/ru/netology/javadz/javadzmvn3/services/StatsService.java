package ru.netology.javadz.javadzmvn3.services;

public class StatsService {

    public int totalSales(long[] sales) {
        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            total += (int) sales[i];
        }
        return total;
    }

    public int averageSalesMonth(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += (int) sales[i];
        }
        return sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }
    public int lessAverageSales(long[] sales) {
        int averageSalesMonth = averageSalesMonth(sales);
        int lessSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSalesMonth > sales[i]) {
                lessSales ++;
            }
        }
        return lessSales;
    }
    public int moreAverageSales(long[] sales) {
        int averageSalesMonth = averageSalesMonth(sales);
        int moreSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSalesMonth < sales[i]) {
                moreSales ++;
            }
        }
        return moreSales;
    }

}


