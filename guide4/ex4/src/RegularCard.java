public class RegularCard implements Card{
    private double money;

    public RegularCard() {
        money = 0;
    }

    public RegularCard(double money) {
        this.money = money;
    }

    @Override
    public void use(double amount) {
        money -= amount;
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
}
