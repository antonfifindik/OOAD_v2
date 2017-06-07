package functions.Binary;

import functions.Function;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Антон on 04.06.2017.
 */
@XmlRootElement(name = "Binary")
@XmlType(propOrder = {"leftArgument", "rightArgument"})
public abstract class Binary extends Function {
    protected String leftArgument;
    protected String rightArgument;

    public Binary() {

    }

    public Binary(String leftArgument, String rightArgument) {
        this.leftArgument = leftArgument;
        this.rightArgument = rightArgument;
    }

    public String getLeftArgument() {
        return leftArgument;
    }
    @XmlElement
    public void setLeftArgument(String leftArgument) {
        this.leftArgument = leftArgument;
    }

    public String getRightArgument() {
        return rightArgument;
    }
    @XmlElement
    public void setRightArgument(String rightArgument) {
        this.rightArgument = rightArgument;
    }



    @Override
    public String toString() {
        return String.format("%s: %s and %s = %f", this.getClass().getName(), leftArgument, rightArgument, computation());
    }

    @Override
    public double derivative() {
        return 0.0;
    }
}
