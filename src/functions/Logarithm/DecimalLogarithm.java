package functions.Logarithm;

import functions.Function;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Антон on 05.06.2017.
 */
@XmlRootElement(name = "DecimalLogarithm")
@XmlType(propOrder = {"value"})
public class DecimalLogarithm extends Function {

    private String value;

    public DecimalLogarithm() {
        value = "0.0";
    }

    public DecimalLogarithm(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    @XmlElement
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public double computation() {
        return Math.log10(Double.parseDouble(value));
    }

    @Override
    public double derivative() {
        return 1 / (Double.parseDouble(value) * 2.30259);
    }

    @Override
    public String toString() {
        return "DecimalLogarithm: " + value + " = " + computation();
    }
}
