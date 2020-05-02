public class Main {
    public static void main(String[] args) {
        int StartBalance = 300;
        int RefAmount = 1500;
        int bonus = 1;
        int totalbonus;
        if (RefAmount >= 1000) {
            totalbonus = RefAmount / 100 * bonus;
        }
        else {
            totalbonus = 0;
        }
        int balance = StartBalance + RefAmount + totalbonus;
        System.out.println(totalbonus);
        System.out.println(balance);
    }
}
