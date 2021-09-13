public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int cashIn = 1001;
        balance = balance + cashIn;
        int bonus = 0;
        if (cashIn > 1000) {
            bonus = cashIn / 100;
            balance = balance + bonus;
        }
        System.out.println("Total balance");
        System.out.println(balance);
        System.out.println("Bonus");
        System.out.println(bonus);
    }
}
