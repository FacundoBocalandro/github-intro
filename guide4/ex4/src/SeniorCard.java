public class SeniorCard implements Card, Discount{
    private double money;
    private static final double DISCOUNT = 0.6;

    public SeniorCard() {
        money = 0;
    }

    public SeniorCard(double money) {
        this.money = money;
    }

    @Override
    public void use(double amount) {
        money -= applyDiscount(amount);
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
        return amount * (1-DISCOUNT);
    }
}
