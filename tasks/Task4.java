public class Task4 {
    public static boolean profitableGamble(double prob, double prize, double pay) {
        return prob * prize > pay;
    }
    public static void main(String[] args) {
        System.out.println("profitableGamble(0.2, 50, 9) -> " + profitableGamble(0.2, 50, 9)); //вывод информации
        System.out.println("profitableGamble(0.9, 1, 2) -> " + profitableGamble(0.9, 1, 2));
        System.out.println("profitableGamble(0.9, 3, 2) -> " + profitableGamble(0.9, 3, 2));
    }
}
