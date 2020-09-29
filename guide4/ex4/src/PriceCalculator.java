import java.util.Map;

public class PriceCalculator {
    private Map<OriginAndDestination, Double> prices;

    public PriceCalculator(Map<OriginAndDestination, Double> prices) {
        this.prices = prices;
    }

    public double getPrice(OriginAndDestination originAndDestinationToCalculate){
        for (OriginAndDestination originAndDestination : prices.keySet()) {
            if (originAndDestinationToCalculate.equals(originAndDestination)){
                return prices.get(originAndDestination);
            }
        }
        throw new RuntimeException("Price not found");
    }
}
