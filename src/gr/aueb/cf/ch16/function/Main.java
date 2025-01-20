package gr.aueb.cf.ch16.function;

public class Main {

    public static void main(String[] args) {
        ICalculator addition = new AdditionCalculator();        // ομοίως AdditionCalculator addition = new AdditionCalculator();
        int result = addition.operate(1, 2);
        System.out.println(result);

        //δημιουργια νεας ανώνυμης κλασης που υλοποιείται κατευθείαν με λιγεσ μεθόδους και για ένα Instance
        ICalculator sub = new ICalculator() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };

        int result2 = sub.operate(10, 6);
        System.out.println(result2);

        //lambda expression αντι για ανωνυμη κλάση
        //το mul ειναι ενα Instance που υλοποιεί την Operate του ICalculator
        ICalculator mul = (a, b) -> a * b;
        int result3 = mul.operate(3,7);
        System.out.println(result3);
    }
}
