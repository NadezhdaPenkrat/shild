package src.com.shild.practice_theoretics14;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleXMLDom2 {
    public static void main(String[] args) {
        try {
            // Создается построитель документа
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().//новый экземпляр
                    newDocumentBuilder();
            // Создается дерево DOM документа из файла
            Document document = documentBuilder.parse("practice_theoretics14/ExampleXMLDomBookCatalog.xml");

            // Вызываем метод для добавления новой книги
            addNewBook(document);

        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
        } catch (SAXException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    // Функция добавления новой книги и записи результата в файл
    private static void addNewBook(Document document) throws //бросает ошибки
            TransformerFactoryConfigurationError, DOMException {
        // Получаем корневой элемент
        Node root = document.getDocumentElement();

        // Создаем новую книгу по элементам
        // Сама книга <Book>
        Element book = document.createElement("Book");
        // <Title>
        Element title = document.createElement("Title");
        // Устанавливаем значение текста внутри тега
        title.setTextContent("Incredible book about Java");
        // <Author>
        Element author = document.createElement("Author");
        author.setTextContent("Saburov Anton");
        // <Date>
        Element date = document.createElement("Date");
        date.setTextContent("2015");
        // <ISBN>
        Element isbn = document.createElement("ISBN");
        isbn.setTextContent("0-06-999999-9");
        // <Publisher>
        Element publisher = document.createElement("Publisher");
        publisher.setTextContent("Java-Course publisher");
        // <Cost>
        Element cost = document.createElement("Cost");
        cost.setTextContent("499");
        // Устанавливаем атрибут
        cost.setAttribute("currency", "RUB");

        // Добавляем внутренние элементы книги в элемент <Book>
        book.appendChild(title);
        book.appendChild(author);
        book.appendChild(date);
        book.appendChild(isbn);
        book.appendChild(publisher);
        book.appendChild(cost);
        // Добавляем книгу в корневой элемент
        root.appendChild(book);

        // Записываем XML в файл
        writeDocument(document);
    }

    // Функция для сохранения DOM в файл
    private static void writeDocument(Document document) throws //бросает ошибки
            TransformerFactoryConfigurationError {
        try {
            //преобразователь,трансформатор -Transformer
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(document);
            FileOutputStream fos = new FileOutputStream("other.xml");
            StreamResult result = new StreamResult(fos);
            tr.transform(source, result);
        } catch (TransformerException | IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
