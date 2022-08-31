public class Main {
    public static void main(String[] args) {
        int score = 500; // сумма на счете
        int amount = 1500; //пополнил на сумму
        if (amount > 1000) {
            System.out.println(amount / 100); // кол-во бонусов
            System.out.println(amount / 100 + amount + score); // сумма на счете всего с учетом бонусов

            int replenishment = 300; // пополнил на сумму
            if (replenishment > 1000) {
                System.out.println(replenishment / 100);
            } // кол-во бонусов

            System.out.println(replenishment + score); // итого на счете с учетом будет бонус или нет


        }
}}
