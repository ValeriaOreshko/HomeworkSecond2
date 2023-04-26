public class Main {
    public static void main(String[] args) {

        int start = 100; //
        int plus = 1100;

        int bonus;
        if (plus > 1000) {
            bonus = plus / 100;
        } else {
            bonus = 0;
        }

        int result = bonus + start + plus;

        System.out.println("Бонусы " + bonus);
        System.out.println("Итоговый счет " + result);
    }
}