public class Main {
    public static void main(String[] args) {

        int balance = 100;
        System.out.println("Баланс: " + balance);
        int replenishment = 1100;
        System.out.println("Сумма пополнения: " + replenishment);
        int amount = balance + replenishment;
        System.out.println("Итоговый счёт: " + amount);
        System.out.println("При пополнении счёта более чем на 1000 рублей,сотовый оператор дарит по 1 рублю за каждые полные 100 рублей пополнения!");
        if (replenishment >= 1000) {
            int bonus = replenishment / 100;
            System.out.println("Бонус равен: " + bonus);
            int amountbonus = amount + bonus;
            System.out.println("Итоговая сумма на счету: " + amountbonus);
        }
    }
}
