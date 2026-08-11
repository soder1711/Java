import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;
    String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", City: " + city + ")";
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Person("Alice", 30, "New York"),
                new Person("Bob", 25, "Los Angeles"),
                new Person("Charlie", 35, "New York"),
                new Person("Diana", 28, "Chicago"),
                new Person("Eve", 22, "New York")
        ));
        people.forEach(System.out::println);
        people.sort(Comparator.comparingInt(p -> p.age));
        people.forEach(System.out::println);
        people.removeIf(p -> !p.city.equals("New York"));
        people.forEach(System.out::println);
    }
}