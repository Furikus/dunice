package lab5;

import java.util.ArrayList;
import java.util.List;

public class Lab5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("StroKA");
        list.add("DaLsHe");
        list.add("Selo");
        list.add("StroKA");
        list.add("Selo");
        list.add("Svadba");
        //list.stream().distinct().forEach(System.out::println);
        List<String> notDublicat = list.stream().distinct().toList();
        System.out.println(notDublicat);
    }
}
