package functions.Unary;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Антон on 05.06.2017.
 */
@XmlRootElement(name = "Tangent")
public class Tangent extends Unary {

    public Tangent() {
        super();
    }

    public Tangent(String value) {
        super(value);
    }


    @Override
    public double computation() {
        return Math.tan(Double.parseDouble(value));
    }

    @Override
    public double derivative() {
        return 1 / (Math.cos(Double.parseDouble(value) * Math.cos(Double.parseDouble(value))));
    }
}
