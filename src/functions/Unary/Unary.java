package functions.Unary;

import functions.Function;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Антон on 05.06.2017.
 */
@XmlRootElement(name = "Unary")
@XmlType(propOrder = {"value"})
public abstract class Unary extends Function {
    protected String value;

    public Unary() {
        value = "0.0";
    }

    public Unary(String value) {
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
    public String toString() {
        return String.format("%s(%s) = %f", this.getClass().getName(), value, computation());
    }


}
