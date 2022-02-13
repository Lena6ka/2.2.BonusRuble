public class Main {
    public static void main(String[] args) {

        int refill = 5000;
        int startingScore = 10;
        int bonus;


        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int amount = startingScore + refill + bonus;
        System.out.println("Итоговый счет: " + amount + " рублей");
    }
}


