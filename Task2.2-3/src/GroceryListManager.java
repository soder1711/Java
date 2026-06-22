import java.util.HashMap;
public class GroceryListManager {
    private HashMap<String, String> groceryList = new HashMap<>();
    public void addItem(String item, double cost, String category) {
        groceryList.put(item, category);
    }
    public void displayByCategory(String category) {
        for (String item: groceryList.keySet()) {
            if (groceryList.get(item).equals(category)) {
                System.out.println(item);
            }
        }
    }
    public static void main(String[] args) {
        GroceryListManager list = new GroceryListManager();
        list.addItem("Apples", 1.5, "Fruit");
        list.addItem("Milk", 2.5, "Dairy");
        list.addItem("Bread", 5, "IdkTBH");
        list.displayByCategory("Fruit");
    }
}
