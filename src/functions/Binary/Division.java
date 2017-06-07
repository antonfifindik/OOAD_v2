package functions.Binary;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Антон on 04.06.2017.
 */
@XmlRootElement(name = "Division")
public class Division extends Binary {

    public Division() {
        leftArgument = "0.0";
        rightArgument = "0.0";
    }

    public Division(String leftArgument, String rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double computation() {
        return Double.parseDouble(leftArgument) / Double.parseDouble(rightArgument);
    }
}
