public class cheese implements calculateTotal {
    private calculateTotal item;
    private double toppingPrice;

    public cheese(calculateTotal item, double toppingPrice) {
        this.item = item;
        this.toppingPrice = toppingPrice;
    }

    @Override
    public double totalCost() {
        return item.totalCost() + toppingPrice;
    }
}
