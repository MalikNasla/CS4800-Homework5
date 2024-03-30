public class fries implements calculateTotal{
    private double regularPrice;

    public fries(double regularPrice){
        this.regularPrice = regularPrice;
    }
    @Override
    public double totalCost() {
        return regularPrice;
    }
}
