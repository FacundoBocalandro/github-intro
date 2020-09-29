public class StudentCard implements Card, Discount{
    private double money;
    private int travels;
    private final static double DISCOUNT = 0.8;

    public StudentCard() {
        money = 0;
        travels = 0;
    }

    public StudentCard(double money) {
        this.money = money;
    }

    @Override
    public void use(double amount) {
        money -= applyDiscount(amount);
        travels ++;
    }

    @Override
    public void recharge(double amount) {
        if (amount < 0){
            throw new NegativeAmountException();
        }
        money += amount;
    }

    @Override
    public double getMoney() {
        return money;
    }

    @Override
    public double applyDiscount(double amount) {
        if (travels <= 2) {
            return amount * (1 - DISCOUNT);
        }
        return amount;
    }
}
