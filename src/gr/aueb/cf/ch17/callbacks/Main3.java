package gr.aueb.cf.ch17.callbacks;

public class Main3 {
    public static void main(String[] args) {

        //():input parameters της .print(), δεξιά του βελους: η εκτέλεση της lambda
        doPrint(() -> sayHelloWorld());

        doPrint(() -> sayHelloCoding());
    }

    public static void doPrint(Printable printable){
        printable.print();
    }

    public static void sayHelloWorld(){
        System.out.println("Hello World");
    }

    public static void sayHelloCoding(){
        System.out.println("Hello Coding");
    }
}
