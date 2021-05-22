public class BonusService {
    public void calculate(long account, int invoice) {
        int bonus = 0;
        if (invoice > 1000) {
            bonus = invoice / 100;
        }
        account = account + invoice + bonus;
        System.out.println("Иготовая сумма на счете клиента = " + account);
        System.out.println("Сумма бонусов на счете клиента = " + bonus);
    }
}
