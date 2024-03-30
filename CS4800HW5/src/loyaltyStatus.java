public class loyaltyStatus {

    int status;
    double newCost;

    public loyaltyStatus(int status){
        this.status = status;
    }

    public double getDiscount(double cost){
        if (status == 1) {
            newCost = cost * (1 - .1);
            return newCost;
        }
        else if (status == 2) {
            newCost = cost * (1 - .2);
            return newCost;
        }
        else {
            newCost = cost * (1 - .3);
            return newCost;
        }
    }
}
