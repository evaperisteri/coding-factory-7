package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.*;
import org.w3c.dom.ls.LSOutput;
//import gr.aueb.cf.ch12.model.Teacher;

public class Main {

    public static void main(String[] args) {


    Teacher teacher = new Teacher("Androutsos", "thanassis", 1);
    User user = new User(1, "Costas", "Mask", "cmask",
            "12545", true);
    Customer customer = new Customer(1, "andrew", "dimitriou",
            "15289476",
            "6985947563", "sterea", "attica", "athens",
            "patision", "15", "11457");
    Point point = new Point(5, 10);
    Order order = new Order(1, 5.5, "meat", "ordered");

        System.out.println("Teacher full name: " + teacher.getFirstname() + ", " + teacher.getLastname());
        System.out.println("User username: " + user.getUsername());
        System.out.println("Customer vat: " + customer.getVatRegistrationNo());
        System.out.println("Order Formatted Time Stamp: " + order.getFormattedTimeStamp());
        System.out.printf("Point: {%d,%d}", point.getX(), point.getY());
    }
}
