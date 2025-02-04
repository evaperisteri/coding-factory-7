package gr.aueb.cf.ch19.deq_stack;

public class DeqMain {


    public static void main(String[] args) {
        MyStack<Integer> intStack = new MyStack<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);

        intStack.forEach(System.out::println);
        int topVal = intStack.pop();
        System.out.println(topVal + " deleted");
        System.out.println();
        intStack.forEach(System.out::println);
    }
}
