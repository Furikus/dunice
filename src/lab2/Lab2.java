package lab2;

import java.util.ArrayList;
import java.util.List;

public class Lab2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("StroKA");
        list.add("DaLsHe");
        list.stream().forEach(x -> System.out.println(x.toLowerCase()));
        list.stream().forEach(x -> System.out.println(x.toUpperCase()));

    }

}
