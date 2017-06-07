package start;

import functions.Binary.Addition;
import functions.Binary.Multiplication;
import functions.Constant.Constant;
import functions.Logarithm.DecimalLogarithm;
import functions.Unary.Sinus;

/**
 * Created by Антон on 04.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition("30", "50");
        addition.print();
        addition.saveToXml();

        Sinus sinus = new Sinus("90");
        sinus.print();
        System.out.println(sinus.derivative());

        Multiplication multiplication = new Multiplication("100", "100");
        multiplication.print();

        Constant constant = new Constant("3,141592653589793238462643");
        constant.print();

        DecimalLogarithm logarithm = new DecimalLogarithm("1000");
        logarithm.print();


    }
}
