public class Main {
    public static void main(String[] args) {
        long startBalanceKopecks = 100_60;
        long transactionKopecks = 2088_50;
        long bonus = 0;
        if (transactionKopecks > 1000_00) {
            long numberOf100 = transactionKopecks / 100 / 100;
            bonus = numberOf100 * 1;
        }
        long endBalanceKopeks = startBalanceKopecks + transactionKopecks + (bonus * 100);
        float endBalance = endBalanceKopeks / 100f;
        System.out.println("Вам начислен бонус (руб.):");
        System.out.println(bonus);
        System.out.println("Баланс Вашего счета (руб.):");
        System.out.println(endBalance);
    }
}

