public class Calculator {

    static int power(int mult, int power) {
        int total = 1;

        if (power < 0 || mult < 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
        }

        for (int i = 0; i < power; i++) {
            total *= mult;
        }




        return total;
    }
}
