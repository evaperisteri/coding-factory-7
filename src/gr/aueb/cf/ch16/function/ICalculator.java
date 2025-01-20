package gr.aueb.cf.ch16.function;

@FunctionalInterface        //αυτο το ταγκ επιτρεπει μονο μια μεθοδο
public interface ICalculator {
    int operate (int a, int b);
}
