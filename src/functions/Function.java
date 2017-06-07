package functions;


import xml.JaxbParser;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;

/**
 * Created by Антон on 04.06.2017.
 */
@XmlRootElement(name = "Function")
public abstract class Function {

    private static JaxbParser jaxbParser = new JaxbParser();

    public void saveToXml() {                       //запись объекта в xml
        try {
            jaxbParser.saveObject(new File("C:\\Users\\Антон\\IdeaProjects\\OOAD v2\\src\\files\\myXml.xml"), this);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println(this.toString());
    }

    public abstract double computation();              //вычисление значения (abstract)

    public abstract double derivative();                                //производная
}
