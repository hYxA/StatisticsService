package ru.netology;

public class StatisticsService {

    /**
     * расчёт суммы продаж
     */
    public int sumCalculate(int[] deals) {
        int summ = 0;
        for (int deal : deals) {
            summ += deal;
        }

        return summ;
    }

    /**
     * расчёт среднего числа продаж в месяц
     */
    public long averageCalculate(int[] deals) {
        int summ = sumCalculate(deals);
        long average = summ / deals.length;
        return average;
    }

    /**
     * последний месяц с наивысшими продажами
     */
    public int maxDealsIndex(int[] deals) {
        int index = 1;
        int maxDealsIndex = 1;
        int maxDeal = 0;
        for (int deal : deals) {
            if (maxDeal <= deal) {
                maxDeal = deal;
                maxDealsIndex = index;
            }
            index += 1;
        }

        return maxDealsIndex;
    }

    /**
     * последний месяц с наихудшими продажами
     */
    public int minDealsIndex(int[] deals) {
        int index = 1;
        int minDealsIndex = 1;
        int minDeal = deals[1];
        for (int deal : deals) {
            if (minDeal >= deal) {
                minDeal = deal;
                minDealsIndex = index;
            }
            index += 1;
        }

        return minDealsIndex;
    }

    /**
     * количество месяцев с количеством продаж ниже среднего
     */
    public int belowAverage(int[] deals) {
        long average = averageCalculate(deals)
        int belowAverage = 0;
        for (int deal : deals) {
            if (deal < average) {
                belowAverage += 1;
            }
        }
        return belowAverage;
    }

    /**
     * количество месяцев с количеством продаж выше среднего
     */
    public int aboveAverage(int[] deals) {
        long average = averageCalculate(deals
        int aboveAverage = 0;
        for (int deal : deals) {
            if (deal < average) {
                aboveAverage += 1;
            }
        }
        return aboveAverage;
    }
}