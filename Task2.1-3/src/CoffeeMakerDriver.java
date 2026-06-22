public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker coffee = new CoffeeMaker();
        if (!coffee.isOn()) {
            coffee.pressOnOff();
        }
        coffee.setCoffeeAmount(60);
        coffee.setType(true);
        System.out.println("Coffee maker is on" + "\nCoffee type is " + coffee.getType() + "\nCoffee amount is " + coffee.getCoffeeAmount());
        coffee.pressOnOff();
        System.out.println("Coffee maker is off");
    }
}
