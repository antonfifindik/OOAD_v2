package functions.Unary;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Антон on 05.06.2017.
 */
@XmlRootElement(name = "Sinus")
public class Sinus extends Unary {

    public Sinus() {
        super();
    }

    public Sinus(String value) {
        super(value);
    }

    @Override
    public double computation() {
        return Math.sin(Double.parseDouble(value));
    }

    @Override
    public double derivative() {
        return Math.cos(Double.parseDouble(value));
    }
}
