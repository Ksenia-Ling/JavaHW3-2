public class Main {
    public static void main(String[] args) {
        int startbalance = 300;
        int refamount = 1500;
        int bonus = 1;
        int totalbonus;
        if (refamount >= 1000) {
            totalbonus = refamount / 100 * bonus;
        } else {
            totalbonus = 0;
        }
        int balance = startbalance + refamount + totalbonus;
        System.out.println(totalbonus);
        System.out.println(balance);
    }
}
