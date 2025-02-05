package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        //add
        countries.put("GR", "Greece");
        countries.put("EN", "England");
        countries.put("US", "United States");

        //update
        countries.put("US", "United States of America");

        //get
        String value = countries.get("GR");
        System.out.println(value);

        //iterate
        Iterator<Map.Entry<String, String>> it = countries.entrySet().iterator();
        while( it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
        }

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
        }

        countries.forEach((k, v) -> System.out.println("Key: " + k + " value: " + v));

        //delete
        countries.remove("GR");
    }
}
