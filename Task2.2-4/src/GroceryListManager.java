import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<GroceryItems> groceryList = new ArrayList<>();
    public void addItem(String item, double cost, String category, int quantity) {
        groceryList.add(new GroceryItems(item, cost, category, quantity));
    }
    public void updateQuantity(String item, int newQuantity) {
        for (GroceryItems grocery : groceryList) {
            if (grocery.item.equals(item)) {
                grocery.quantity = newQuantity;
            }
        }
    }
    public void displayAvailableItems() {
        for (GroceryItems grocery : groceryList) {
            if (grocery.quantity > 0) {
                System.out.println(grocery.item + " Quantity: " + grocery.quantity);
            }
        }
    }
    public static void main(String[] args) {
        GroceryListManager list = new GroceryListManager();
        list.addItem("Apple", 2.5, "Fruit", 5);
        list.addItem("Milk", 1.5, "Dairy", 0);
        list.displayAvailableItems();
        list.updateQuantity("Apple", 2);
        list.displayAvailableItems();
    }
}