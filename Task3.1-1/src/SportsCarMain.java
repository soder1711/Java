public class SportsCarMain {
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar("something", 60, 50);
        myCar.fillTank();
        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h. The gasoline tank capacity is: " + myCar.getGasolineTankCapacity());
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h. The gasoline tank capacity is: " + myCar.getGasolineTankCapacity());
        }
    }
}
