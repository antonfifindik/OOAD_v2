package functions.Binary;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Антон on 04.06.2017.
 */
@XmlRootElement(name = "Addition")
public class Addition extends Binary {

    public Addition() {
        leftArgument = "0";
        rightArgument = "0";
    }

    public Addition(String leftArgument, String rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double computation() {
        return Double.parseDouble(leftArgument) + Double.parseDouble(rightArgument);
    }


}
