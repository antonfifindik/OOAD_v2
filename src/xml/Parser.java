package xml;

import javax.xml.bind.JAXBException;
import java.io.File;

/**
 * Created by Антон on 04.06.2017.
 */
public interface Parser {
    Object getObject(File file, Class c) throws JAXBException;
    void saveObject(File file, Object o) throws JAXBException;
}
