public class hotDog implements calculateTotal{
    private double regularPrice;

    public hotDog(double regularPrice){
        this.regularPrice = regularPrice;
    }
    @Override
    public double totalCost() {
        return regularPrice;
    }
}
