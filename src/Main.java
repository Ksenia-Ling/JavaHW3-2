public class Main {
    public static void main(String[] args) {
        int startBalance = 300;
        int refAmount = 1500;
        int bonus = 1;
        int totalBonus;
        if (refAmount >= 1000) {
            totalBonus = refAmount / 100 * bonus;
        } else {
            totalBonus = 0;
        }
        int balance = startBalance + refAmount + totalBonus;
        System.out.println(totalBonus);
        System.out.println(balance);
    }
}
