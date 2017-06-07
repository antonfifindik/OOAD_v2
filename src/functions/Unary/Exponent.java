package functions.Unary;

/**
 * Created by Антон on 05.06.2017.
 */
public class Exponent extends Unary {

    public Exponent() {
        super();
    }

    public Exponent(String value) {
        super(value);
    }

    @Override
    public double computation() {
        return Math.exp(Double.parseDouble(value));
    }

    @Override
    public double derivative() {
        return Double.parseDouble(value);
    }
}
