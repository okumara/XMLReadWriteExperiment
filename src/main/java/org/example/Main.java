package org.example;

import static org.geekforgeeks.XMLReaderExample.xmlReaderExample;
import static org.geekforgeeks.XMLWriterExample.xmlWriterExample;

public class Main {
    public static void main(String[] args) {
        try {
            xmlWriterExample();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            xmlReaderExample();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}