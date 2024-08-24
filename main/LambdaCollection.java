package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaCollection {
  public static void main(String[] args) {
    List<String> names = Collections.unmodifiableList(new ArrayList<>(Arrays.asList("abdu", "eunha", "sowon")));
    Map<String, String> map = new HashMap<>();
    map.put("satu", "abdu");
    map.put("dua", "abdu2");
    map.put("tiga", "abdu3");
    
    // contoh pakai for loop
    for(int i = 0; i < names.size(); i++){
      System.out.println(names);
    }

    // contoh pakai lambda
    names.forEach(value -> System.out.println(value));
    names.removeIf(value -> value.length() > 5);
    map.forEach((key, value) -> System.out.println("Ini key: " + key + " dan valuenya " + value));

    // contoh pakai method reference
    names.forEach(System.out::println);
  }
}
