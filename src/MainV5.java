public class MainV5 {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long bonus = service.calculate (100,100);

        System.out.println(bonus);
    }
}
