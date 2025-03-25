package ru.netology.javadz.javadzmvn3.services;

public class StatsService {

    public int totalSales(int[] sales) {
        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            total += (int) sales[i];
        }
        return total;
    }

    public int averageSalesMonth(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += (int) sales[i];
        }
        return sum / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lessAverageSales(int[] sales) {
        int averageSalesMonth = averageSalesMonth(sales);
        int lessSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSalesMonth > sales[i]) {
                lessSales++;
            }
        }
        return lessSales;
    }

    public int moreAverageSales(int[] sales) {
        int averageSalesMonth = averageSalesMonth(sales);
        int moreSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSalesMonth < sales[i]) {
                moreSales++;
            }
        }
        return moreSales;
    }

}

