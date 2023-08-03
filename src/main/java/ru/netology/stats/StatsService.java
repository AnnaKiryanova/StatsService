package ru.netology.stats;

public class StatsService {

    public int minSales(int[] sales) { //минимальные продажи
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) { //максимальные продажи
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int salesAmount(int[] sales) { //общая сумма продаж
        int sum = 0;

        for (int number : sales) {
            sum = sum + number;
        }
        return sum;
    }

    public int averageAmount(int[] sales) { //средняя сумма продаж в месяц
        int sum = salesAmount(sales);
        return sum / sales.length;
    }

    public int monthsSalesBelowAverage(int[] sales) { //количество месяцев, в которых продажи ниже среднего
        int averageMonth = averageAmount(sales);
        int month = 0;

        for (int number : sales) {
            if (number < averageMonth) {
                month = month + 1;
            }
        }
        return month;
    }

    public int monthsSalesAboveAverage(int[] sales) { //количество месяцев, в которых продажи выше среднего
        int averageMonth = averageAmount(sales);
        int month = 0;

        for (int number : sales) {
            if (number > averageMonth) {
                month = month + 1;
            }
        }
        return month;
    }
}
