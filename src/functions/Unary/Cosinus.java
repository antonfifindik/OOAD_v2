package functions.Unary;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Антон on 05.06.2017.
 */
@XmlRootElement(name = "Cosinus")
public class Cosinus extends Unary {

    public Cosinus() {
        super();
    }

    public Cosinus(String value) {
        super(value);
    }

    @Override
    public double computation() {
        return Math.cos(Double.parseDouble(value));
    }

    @Override
    public double derivative() {
        return - Math.sin(Double.parseDouble(value));
    }
}
