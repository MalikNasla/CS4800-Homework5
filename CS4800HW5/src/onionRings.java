public class onionRings implements calculateTotal {
    private calculateTotal item;
    private double toppingPrice;

    public onionRings(calculateTotal item, double toppingPrice) {
        this.item = item;
        this.toppingPrice = toppingPrice;
    }

    @Override
    public double totalCost() {
        return item.totalCost() + toppingPrice;
    }
}
