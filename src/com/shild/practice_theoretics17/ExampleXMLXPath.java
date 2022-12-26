package src.com.shild.practice_theoretics17;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;

public class ExampleXMLXPath {
    public static void main(String[] args) {
        try {
            // Создается построитель документа
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().//новый экземпляр
                    newDocumentBuilder();
            // Создается дерево DOM документа из файла
            Document document = documentBuilder.parse("BookCatalog.xml");

            printCost(document);// Печать всех элементов Cost
            printCost2(document); // Печать элемента Cost у которого атрибут currency='USD'
            printCost3(document);// Печать элементов Book у которых значение Cost > 4
            printCost4(document);// Печать первого элемента Book
            printCost5(document);// Печать цены книги у которой Title начинается с

        } catch (XPathExpressionException | ParserConfigurationException | SAXException | IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    // Печать всех элементов Cost
    private static void printCost(Document document) throws DOMException, XPathExpressionException {
        System.out.println("Example 1 - Печать всех элементов Cost");
        XPathFactory pathFactory = XPathFactory.newInstance();// Создать XPathFactory //новый экземпляр
        XPath xpath = pathFactory.newXPath();// Создать XPath

        // Пример записи XPath
        // Подный путь до элемента
        //XPathExpression expr = xpath.compile("BookCatalogue/Book/Cost");
        // Все элементы с таким именем
        //XPathExpression expr = xpath.compile("//Cost");
        // Элементы, вложенные в другой элемент

        XPathExpression expr = xpath.compile// Получить скомпилированный вариант XPath-выражения
                ("//Book/Cost");

        // Применить XPath-выражение к документу для поиска нужных элементов
        NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < nodes.getLength(); i++) {
            Node n = nodes.item(i);
            System.out.println("Value:" + n.getTextContent());
        }
        System.out.println();
    }

    // Печать элемента Cost у которого атрибут currency='USD'
    private static void printCost2(Document document) throws DOMException, XPathExpressionException {
        System.out.println("Example 2 - Печать элемента Cost у которого атрибут currency='USD'");
        XPathFactory pathFactory = XPathFactory.newInstance();// Создать XPathFactory //новый экземпляр
        XPath xpath = pathFactory.newXPath();// Создать XPath
        // Получить скомпилированный вариант XPath-выражения
        XPathExpression expr = xpath.compile("BookCatalogue/Book/Cost[@currency='USD']");
        // Применить XPath-выражение к документу для поиска нужных элементов
        NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < nodes.getLength(); i++) {
            Node n = nodes.item(i);
            System.out.println("Value:" + n.getTextContent());
        }
        System.out.println();
    }

    // Печать элементов Book у которых значение Cost > 4
    private static void printCost3(Document document) throws DOMException, XPathExpressionException {
        System.out.println("Example 3 - Печать элементов Book у которых значение Cost > 4");
        XPathFactory pathFactory = XPathFactory.newInstance();// Создать XPathFactory //новый экземпляр
        XPath xpath = pathFactory.newXPath();// Создать XPath
        // Получить скомпилированный вариант XPath-выражения
        XPathExpression expr = xpath.compile("BookCatalogue/Book[Cost>4]");
        // Применить XPath-выражение к документу для поиска нужных элементов
        NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < nodes.getLength(); i++) {
            Node n = nodes.item(i);
            System.out.println("Value:" + n.getTextContent());
        }
        System.out.println();
    }

    // Печать первого элемента Book
    private static void printCost4(Document document) throws DOMException, XPathExpressionException {
        System.out.println("Example 4 - Печать первого элемента Book");
        XPathFactory pathFactory = XPathFactory.newInstance();// Создать XPathFactory //новый экземпляр
        XPath xpath = pathFactory.newXPath();// Создать XPath
        // Получить скомпилированный вариант XPath-выражения
        XPathExpression expr = xpath.compile("BookCatalogue/Book[2]");
        // Применить XPath-выражение к документу для поиска нужных элементов
        NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < nodes.getLength(); i++) {
            Node n = nodes.item(i);
            System.out.println("Value:" + n.getTextContent());
        }
        System.out.println();
    }

    // Печать цены книги у которой Title начинается с Yogasana
    // Варианты доступа к относительным узлам:
    // ancestor , ancestor-or-self, descendant, descendant-or-self
    // following, following-sibling, namespace, preceding, preceding-sibling
    private static void printCost5(Document document) throws DOMException, XPathExpressionException {
        System.out.println("Example 5 - Печать цены книги у которой Title начинается с 'Yogasana'");

        XPathFactory pathFactory = XPathFactory.newInstance();// Создать XPathFactory //новый экземпляр
        XPath xpath = pathFactory.newXPath();// Создать XPath
        XPathExpression expr = xpath.compile // Получить скомпилированный вариант XPath-выражения
                // компилировать к относительным узлам:
                ("BookCatalogue/Book/Cost"
                + "[starts-with(preceding-sibling::Title, 'Yogasana')"
                + " or "
                + "starts-with(following-sibling::Title, 'Yogasana')]");
        // Применить XPath-выражение к документу для поиска нужных элементов
        NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < nodes.getLength(); i++) {
            Node n = nodes.item(i);
            System.out.println("Value:" + n.getTextContent());
        }
        System.out.println();
    }

}


/*
в каждой функции для работы с XPath используется одна и та же последовательность действий
    // Создать XPathFactory
    XPathFactory pathFactory = XPathFactory.newInstance();
    // Создать XPath
    XPath xpath = pathFactory.newXPath();
    // Получить скомпилированный вариант XPath-выражения
    XPathExpression expr = xpath.compile("BookCatalogue/Book[2]");
    // Применить XPath-выражение к документу для поиска нужных элементов
    NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
*/