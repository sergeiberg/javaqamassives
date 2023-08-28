package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {    //СУММА ВСЕХ ПРОДАЖ
        int totalSum = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSum += sales[i];
        }
        return totalSum;
    }

    public int midMonthSales(int[] sales) {    //СРЕДНЯЯ СУММА ПРОДАЖ В МЕСЯЦ
        int middleSum = (sumSales(sales) / 12);
        return middleSum;
    }

    public int maxSales(int[] sales) {  //НОМЕР МЕСЯЦА В КОТОРОМ БЫЛ ПИК ПРОДАЖ;
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    public int minSales(int[] sales) { //НОМЕР МЕСЯЦА С МИНИМАЛЬНЫМ КОЛИЧЕСТВОМ ПРОДАЖ;
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int belowMidMonthSales(int[] sales) {    //СУММА МЕСЯЦЕВ С ПРОДАЖАМИ НИЖЕ СРЕДНЕГО

        int belowMidSales = 0;
        int midSales = midMonthSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < midSales) {
                belowMidSales++;
            }
        }
        return belowMidSales;
    }
    public int aboveMidMonthSales(int[] sales) {    //СУММА МЕСЯЦЕВ С ПРОДАЖАМИ ВЫШЕ СРЕДНЕГО

        int aboveMidSales = 0;
        int midSales = midMonthSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > midSales) {
                aboveMidSales++;
            }
        }
        return aboveMidSales;
    }



}