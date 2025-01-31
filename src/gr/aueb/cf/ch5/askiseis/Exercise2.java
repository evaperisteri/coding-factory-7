package gr.aueb.cf.ch5.askiseis;

public class Exercise2 {

    public static void main(String[] args) {
        double celsius =40;
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(fahrenheit);
    }

    public static double celsiusToFahrenheit (double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
}
