import java.util.ArrayList;

public class order {
    ArrayList<calculateTotal> order = new ArrayList<calculateTotal>();
    double totalCost;

    public void addToOrder(calculateTotal item){
        order.add(item);
    }

    public double totalCost(){
        for (int i = 0; i < order.size(); i++)
        {
            totalCost = order.get(i).totalCost() + totalCost;
        }
        return totalCost;
    }
}
