public class CoffeeMaker {
    private boolean type;
    private boolean on;
    private int coffeeAmount;

    public CoffeeMaker() {
        type = false;
        on = false;
        coffeeAmount = 50;
    }
    public void pressOnOff() {
        on = !on;
    }
    public boolean isOn() {
        return on;
    }
    public void setType(boolean newType) {
        if (on) {
            type = newType;
        }
    }
    public String getType() {
        if (type) {
            return "expresso";
        }
        else {
            return "normal";
        }
    }
    public void setCoffeeAmount(int amount) {
        if (on && amount >= 10 && amount <= 80) {
            coffeeAmount = amount;
        }
    }
    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}
