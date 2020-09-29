public class TravelMachine {
    private final PriceCalculator priceCalculator;

    public TravelMachine(PriceCalculator priceCalculator) {
        this.priceCalculator = priceCalculator;
    }

    public void makeTrip(Card card, OriginAndDestination originAndDestination){
        double price = priceCalculator.getPrice(originAndDestination);
        card.use(price);
    }
}
