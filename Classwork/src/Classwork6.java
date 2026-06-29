public class Classwork6 {
    private static int number;
    public Classwork6() {
        number = 0;
    }
    public int add() {
        return number + 1;
    }
    public static void main(String[] args) {
        Classwork6 idk = new Classwork6();
        for (int i = 0; i < 10; i++) {
            number = idk.add();
            System.out.println(number);
        }
    }
}
