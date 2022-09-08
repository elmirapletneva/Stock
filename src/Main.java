public class Main {
    public static void main(String[] args) {
        int score = 500; // сумма на счете
        int amount = 1500; //пополнил на сумму 1500
        int bonus = amount / 100;
        if (amount > 1000) {
            System.out.println(amount + bonus + score + " рублей на счету у клиента");
        } // в случае если сумма пополнения больше 1000
        else {
            System.out.println(score + +amount + " рублей на счету у клиента");
        } // в случае если сумма пополнения меньше 1000


    }
}
