package functions.Constant;

import functions.Function;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Антон on 04.06.2017.
 */
@XmlRootElement(name = "Constant")
@XmlType(propOrder = {"value"})
public class Constant extends Function {

    String value;

    public Constant() {
        value = "0.0";
    }


    public Constant(String value) {
        this.value = value;
    }

    @XmlElement
    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public double computation() {
        return Double.parseDouble(value);
    }

    @Override
    public double derivative() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Constant = " + value;
    }
}
