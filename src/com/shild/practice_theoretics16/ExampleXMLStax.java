package src.com.shild.practice_theoretics16;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExampleXMLStax {
    public static void main(String[] args) {
        final String fileName = "BookCatalog.xml";

        try {
            XMLStreamReader xmlr = XMLInputFactory.newInstance(). ////новый экземпляр
                    createXMLStreamReader(fileName, new FileInputStream(fileName));


            //создаете объект класса XMLStreamReader, который позволяет
            while (xmlr.hasNext()) {
                xmlr.next(); //вам перемещаться последовательно по всем элементам XML
                if (xmlr.isStartElement()) {  //и проверять, что за элемент вы нашли
                    System.out.println(xmlr.getLocalName());
                } else if (xmlr.isEndElement()) {
                    System.out.println("/" + xmlr.getLocalName());
                } else if (xmlr.hasText() && xmlr.getText().trim().length() > 0) {
                    System.out.println("   " + xmlr.getText());
                }
            }
        } catch (FileNotFoundException | XMLStreamException ex) {
            ex.printStackTrace();
        }
    }
}
