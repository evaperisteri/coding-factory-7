package gr.aueb.cf.ch19.lists;

import java.util.ArrayList;
import java.util.Iterator;

public class MainList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Athens");
        cities.add("NY");
        cities.add("London");


        String cit = cities.get(0);
        int nyPosition = cities.indexOf("NY");
        if (nyPosition != -1) {
            cities.set(nyPosition, "New York");
        } else {
            System.out.println("NY does not exist");
        }

        int athensPosition = cities.indexOf("Athens");

        if(cities.contains("Athens")) {
            cities.remove("Athens");
        } else {
            System.out.println("Athens does not exist");
        }

        cities.removeIf(city -> city.startsWith("A"));

        //traverse ή iterate
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        for (String city : cities) {
            System.out.println(city);
        }

        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        cities.forEach(city -> System.out.println(city));

        cities.forEach(System.out::println);

        //delete with iteration
        Iterator<String> iter = cities.iterator();
        while(iter.hasNext()){
            String city = iter.next();
            if (city.equals("New York")){
                //cities.remove(city);            //δινει exception
                iter.remove();
            }
        }
    }
}
