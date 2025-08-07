package Greedy;
// algo:
//     1.calc the ratio of profit/weight
//      2. sort all the all the products in decresing order
//      3. initialise res = 0
//      4. do the following for every product:
//          a. if weight of the current product is less or equal to 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Knapsack {
    public static void main(String[] args) {
        int sack = 20;
        int profit[] = {120, 100, 60};
        int weight[] = {17, 13, 8};
        System.out.println(knapsack(sack, profit, weight));
    }

    private static int knapsack(int sack, int[] p, int[] w ) {
        double res = 0;
        TreeMap<Double, List<Integer>> tm = new TreeMap<>();

        for(int i = 0; i < n; i++) {
            List<Integer> li = new ArrayList<>();
            li.add(p[i]);
            li.add(w[i]);
            double profit = p[i];
            double weight = w[i];
            tm.put(profit/weight, li); 
        }

        for(Map.Entry<Double, List<Integer>> entry: tm.descendingMap()) {
            if(entry.getValue().get(1) < sack) {
                res += entry.getValue().get(0);
                sack -= entry.getValue().get(1);
            } else {
                res =+ sack*(entry.getValue().get(0))/(entry.getValue().get(1));
                //res += sack * entry.getKey();
                break;
            }
        }

    }
}
