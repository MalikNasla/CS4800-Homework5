public class pickles implements calculateTotal {
    private calculateTotal item;
    private double toppingPrice;

    public pickles (calculateTotal item, double toppingPrice) {
        this.item = item;
        this.toppingPrice = toppingPrice;
    }

    @Override
    public double totalCost() {
        return item.totalCost() + toppingPrice;
    }
}
