package lab6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lab6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("z");
        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
