package Lab9;

import java.util.ArrayList;
import java.util.List;

public class lab9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("StroKA");
        list.add("DaLsHe");
        list.add("Selo");
        list.add("StroKA");
        list.add("Selo");
        list.add("Svadba");
        //list.stream().filter(x-> x.length()>5).reduce(String.valueOf(0), (sum, x )-> sum= sum + x);
        System.out.println(
                list.stream().map(String::length).filter(length -> length >5).reduce(0,(sum, x)-> sum = sum + x ));
    }
}
