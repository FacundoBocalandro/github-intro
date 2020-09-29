import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Place place1 = new Place("place 1");
        Place place2 = new Place("place 2");
        Place place3 = new Place("place 3");

        OriginAndDestination place1to2 = new OriginAndDestination(place1, place2);
        OriginAndDestination place1to3 = new OriginAndDestination(place1, place3);
        OriginAndDestination place2to3 = new OriginAndDestination(place2, place3);
        OriginAndDestination place2to1 = new OriginAndDestination(place2, place1);
        OriginAndDestination place3to2 = new OriginAndDestination(place3, place2);
        OriginAndDestination place3to1 = new OriginAndDestination(place3, place1);


        Map<OriginAndDestination, Double> prices = new HashMap<>();
        prices.put(place1to2, 5.0);
        prices.put(place1to3, 10.0);
        prices.put(place2to3, 5.0);
        prices.put(place2to1, 5.0);
        prices.put(place3to2, 5.0);
        prices.put(place3to1, 10.0);

        PriceCalculator priceCalculator = new PriceCalculator(prices);

        TravelMachine travelMachine = new TravelMachine(priceCalculator);

        Card studentCard = new StudentCard();
        Card seniorCard = new SeniorCard();
        Card regularCard = new RegularCard();

        Card selectedCard = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose card: ");
        System.out.println("1: student");
        System.out.println("2: senior");
        System.out.println("3: regular");
        int i = scanner.nextInt();
        switch (i) {
            case 1 -> selectedCard = studentCard;
            case 2 -> selectedCard = seniorCard;
            case 3 -> selectedCard = regularCard;
            default -> System.exit(0);
        }

        boolean on = true;

        while (on){
            System.out.println("Enter operation: ");
            System.out.println("1: Recharge");
            System.out.println("2: Use");
            System.out.println("3: Show balance");
            int i1 = scanner.nextInt();
            switch (i1){
                case 1:
                    recharge(scanner, selectedCard);
                    break;
                case 2:
                    System.out.println("Enter origin and destination: ");
                    int i2 = scanner.nextInt();
                    OriginAndDestination originAndDestination = switch (i2) {
                        case 13 -> place1to3;
                        case 23 -> place2to3;
                        case 21 -> place2to1;
                        case 32 -> place3to2;
                        default -> place1to2;
                    };
                    travelMachine.makeTrip(selectedCard, originAndDestination);
                    break;
                case 3:
                    balance(selectedCard);
                    break;
                default:
                    on = false;
            }
        }
    }

    private static void balance(Card selectedCard) {
        System.out.println("Balance:");
        System.out.println(selectedCard.getMoney());
    }

    private static void recharge(Scanner scanner, Card selectedCard) {
        System.out.println("Enter money to recharge");
        double v = scanner.nextDouble();
        selectedCard.recharge(v);
    }
}
