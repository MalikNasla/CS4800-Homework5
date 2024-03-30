public class burger implements calculateTotal{
    private double regularPrice;

    public burger(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    @Override
    public double totalCost() {
        return regularPrice;
    }
}
