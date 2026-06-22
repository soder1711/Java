import java.util.HashMap;
public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();
    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }
    public double calculateTotalCost() {
        double total = 0;
        for (double cost: groceryList.values()) {
            total += cost;
        }
        return total;
    }

    public static void main(String[] args) {
        GroceryListManager list = new GroceryListManager();
        list.addItem("Apples", 1.5);
        list.addItem("Milk", 2.5);
        list.addItem("Bread", 5);
        System.out.println(list.calculateTotalCost());
    }
}
