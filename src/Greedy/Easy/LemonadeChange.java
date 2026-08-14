package Greedy.Easy;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0; // Counter for $5 bills
        int ten = 0;  // Counter for $10 bills

        // Process each customer's bill
        for (int bill : bills) {
            if (bill == 5) {
                five++; // Accept $5 (no change needed)
            } else if (bill == 10) {
                if (five > 0) {
                    five--; // Give one $5 as change
                    ten++;  // Accept $10
                } else {
                    return false; // Cannot give change
                }
            } else { // bill == 20
                if (five > 0 && ten > 0) {
                    five--; // Use one $5
                    ten--;  // Use one $10
                } else if (five >= 3) {
                    five -= 3; // Use three $5 bills
                } else {
                    return false; // Cannot give change
                }
            }
        }
        return true;
    }
    static void main(String[] args) {
        int[] bills = {5, 5, 5, 10, 20};

        System.out.print("Queue of customers: ");
        for (int bill : bills) System.out.print(bill + " ");
        System.out.println();

        LemonadeChange stand = new LemonadeChange();
        boolean ans = stand.lemonadeChange(bills);

        if (ans)
            System.out.println("It is possible to provide change for all customers.");
        else
            System.out.println("It is not possible to provide change for all customers.");
    }
}

