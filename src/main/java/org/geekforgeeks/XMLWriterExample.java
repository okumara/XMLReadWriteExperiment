package org.geekforgeeks;

// Java Program to Write XML Using DOM Parser
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLWriterExample {
    public static void xmlWriterExample() throws Exception {
        // Create a DocumentBuilder
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Create a new Document
        Document document = builder.newDocument();

        // Create root element
        Element root = document.createElement("libraries");
        document.appendChild(root);

        Element library = document.createElement("library");
        root.appendChild(library);

        // Create book elements and add text content
        Element book1 = document.createElement("Program1");
        book1.appendChild(document.createTextNode("Java Programming"));
        Element book2 = document.createElement("Program2");
        book2.appendChild(document.createTextNode("Python Programming"));
        Element book3 = document.createElement("Program3");
        book3.appendChild(document.createTextNode("JavaScript"));
        Element book4 = document.createElement("Program4");
        book4.appendChild(document.createTextNode("C Programming"));
        library.appendChild(book1);
        library.appendChild(book2);
        library.appendChild(book3);
        library.appendChild(book4);

        // Create root element
        library = document.createElement("library");
        root.appendChild(library);

        // Create book elements and add text content
        Element book5 = document.createElement("Program1");
        book5.appendChild(document.createTextNode("Basic Programming"));
        Element book6 = document.createElement("Program2");
        book6.appendChild(document.createTextNode("Pascal Programming"));
        Element book7 = document.createElement("Program3");
        book7.appendChild(document.createTextNode("6502 Assemble Programming"));
        Element book8 = document.createElement("Program4");
        book8.appendChild(document.createTextNode("Groovy Programming"));
        library.appendChild(book5);
        library.appendChild(book6);
        library.appendChild(book7);
        library.appendChild(book8);



        // Write to XML file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);

        // Specify your local file path
        StreamResult result = new StreamResult("./output/output.xml");
        transformer.transform(source, result);

        System.out.println("XML file created successfully!");
    }
}
