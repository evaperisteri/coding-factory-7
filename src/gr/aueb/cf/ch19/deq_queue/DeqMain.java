package gr.aueb.cf.ch19.deq_queue;

import gr.aueb.cf.ch19.deq_stack.MyStack;

public class DeqMain {


    public static void main(String[] args) {
        MyQueue<String> strQueue = new MyQueue<>();
        strQueue.enQueue("ABC1234");
        strQueue.enQueue("ZAU7781");
        strQueue.enQueue("HUI8695");

        strQueue.forEach(System.out::println);
        String firstOut = strQueue.deQueue();
        System.out.println();
        System.out.println(firstOut + " deleted");
        System.out.println();
        strQueue.forEach(System.out::println);
    }
}
