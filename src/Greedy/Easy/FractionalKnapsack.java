package Greedy.Easy;

import java.util.*;

public class FractionalKnapsack {
    static class ItemComparator implements Comparator<Item>{
        public int compare(Item a, Item b){
            double r1 = (double) a.value/ (double) a.weight;
            double r2 = (double) b.value/ (double) b.weight;
            return Double.compare(r2,r1);
        }
    }
    public double fractionalKnapsack(int W, Item[] arr, int n){
        Arrays.sort(arr, new ItemComparator());
        int currWeight = 0;
        double finalvalue = 0.0;
        for (int i=0; i<n; i++){
            if (currWeight+arr[i].weight<=W){
                currWeight += arr[i].weight;
                finalvalue += arr[i].value;  // Add the full value of the item
            } else {
                // If the current item can't be fully added, take the fractional part
                int remain = W - currWeight;
                finalvalue += (arr[i].value / (double) arr[i].weight) * (double) remain;
                break;
            }
        }
        return finalvalue;
    }
    static class Item{
        int value;
        int weight;
        Item(int value, int weight){
            this.value = value;
            this.weight = weight;
        }
    }
    static void main(String[] args) {

        // Input data
        int n = 3, weight = 50;  // Number of items and capacity of knapsack
        Item[] arr = { new Item(100, 20), new Item(60, 10), new Item(120, 30) };

        // Create an object of the Solution class
        FractionalKnapsack obj = new FractionalKnapsack();

        // Calculate the maximum value we can get with the fractional knapsack
        double ans = obj.fractionalKnapsack(weight, arr, n);

        // Output the result
        System.out.println("The maximum value is: " + String.format("%.2f", ans));
    }
}
