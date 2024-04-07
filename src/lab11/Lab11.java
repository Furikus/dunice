package lab11;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Lab11 {

    List<Person> userList = Arrays.asList(
            new Person("Michael", 37, "TR"),
            new Person("Mary",  11, "EN"),
            new Person("John",  7, "FR"),
            new Person( "Arnold", 13, "RU"),
            new Person("Mike", 87, "US"),
            new Person("Natali", 88, "US"),
            new Person("Jack",  71, "FR")
    );

    public static void main(String... args) {
        Lab11 person = new Lab11();
        person.test1();
    }
    private void test1() {

        System.out.println("Test 1");
//        Optional<Person> optional = userList.stream()
//                .max((p1, p2) -> p1.getAge() - p2.getAge());
//        if (optional.isPresent())
//        {
//            Person oldest = optional.get();
//            System.out.println("The oldest is: " + oldest.getName()
//                    + " (" + oldest.getAge() + ")");
//        }

        System.out.println(userList.stream().max(Comparator.comparingInt(Person::getAge)).get());

    }
    private void test2() {

        System.out.println("Test 2");
        userList.stream()
                .filter(x -> x.getAge() < 18)
                .forEach(System.out::println);
    }

    private void test3() {

        System.out.println("Test 3");
        userList.stream()
                .sorted(Comparator.comparing(Person::getNationality))
                .forEach(System.out::println);
    }
}

class Person {
    String name;
    int age;
    private String nationality;

    public static void main(String[] args) {

    }


    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Person c = (Person) obj;

        return CharSequence.compare(name, c.name) == 0
                && Integer.compare(age, c.age) == 0
                && CharSequence.compare(nationality, c.nationality) == 0;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = result * 17 + age;
        result = result * 17 + name.hashCode();
        result = result * 17 + nationality.hashCode();
        return result;
    }
    @Override
    public String toString() {
        return  name + " " + age + " " + nationality;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return  name;
    }

    public String getNationality() {
        return  nationality;
    }


}