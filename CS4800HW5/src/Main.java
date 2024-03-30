import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        loyaltyStatus oneYear = new loyaltyStatus(1);
        loyaltyStatus twoYears = new loyaltyStatus(2);
        loyaltyStatus overTwoYears = new loyaltyStatus(3);

        calculateTotal burger = new burger(10);
        calculateTotal hotDog = new hotDog(5);
        calculateTotal fries = new fries(2);

        hotDog = new cheese(hotDog, 1);
        burger = new onionRings(burger, 2);
        fries = new pickles(fries, .5);

        order cart = new order();
        cart.addToOrder(burger);
        cart.addToOrder(hotDog);
        cart.addToOrder(fries);

        double totalCost = cart.totalCost();
        double oneYearLoyaltyPrice = oneYear.getDiscount(totalCost);
        double twoYearLoyaltyPrice = twoYears.getDiscount(totalCost);
        double overTwoYearsLoyaltyPrice = overTwoYears.getDiscount(totalCost);

        DecimalFormat df = new DecimalFormat("#.##");
        String roundedTotalCost = df.format(totalCost);
        String roundedOneYear = df.format(oneYearLoyaltyPrice);
        String roundedTwoYear = df.format(twoYearLoyaltyPrice);
        String roundedOverTwoYears = df.format(overTwoYearsLoyaltyPrice);

        System.out.println("Total Cost: $" + roundedTotalCost);
        System.out.println("With One Year Loyalty Discount: $" + roundedOneYear);
        System.out.println("With Two Year Loyalty Discount: $" + roundedTwoYear);
        System.out.println("With Over Two Years Loyalty Discount: $" + roundedOverTwoYears);

    }
}